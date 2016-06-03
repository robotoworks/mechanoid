#!/bin/bash

WORKING_DIR=$PWD
MECH_VERSION=0.2.3
TARGET=target
SITE_PATH=$WORKING_DIR/target/ide/eclipse
DOC_PATH=$WORKING_DIR/target/doc
APIDOCS_PATH=$WORKING_DIR/target/doc/apidocs
LIB_PATH=$WORKING_DIR/target/lib
BIN_PATH=$WORKING_DIR/target/bin

rm -r $TARGET
mkdir $TARGET

buildMechanoid() {
	echo "Building Mechanoid..."
	mvn clean install
	
	mkdir -p $SITE_PATH
	cp -r $WORKING_DIR/releng/com.robotoworks.mechanoid.updatesite/target/repository/** $SITE_PATH
	
	mkdir -p $LIB_PATH
	cp $WORKING_DIR/libs/mechanoid/target/mechanoid-$MECH_VERSION-SNAPSHOT.jar $LIB_PATH/mechanoid.jar
	cp $WORKING_DIR/libs/mechanoid/target/mechanoid-$MECH_VERSION-SNAPSHOT-sources.jar $LIB_PATH/mechanoid-sources.jar
	cp $WORKING_DIR/plugins/com.robotoworks.mechanoid.standalone/target/com.robotoworks.mechanoid.standalone-$MECH_VERSION-SNAPSHOT.jar $LIB_PATH/mechanoid.runner.jar
}

buildJavadoc() {
	echo "Building Javadoc..."
	mvn -f $WORKING_DIR/libs/mechanoid/pom.xml javadoc:javadoc

	mkdir -p $APIDOCS_PATH
	cp -r $WORKING_DIR/libs/mechanoid/target/apidocs/** $APIDOCS_PATH
}

buildUserdoc() {
	echo "Building user docs..."
	make -C $WORKING_DIR/docs html
	
	mkdir -p $APIDOCS_PATH
	cp -r $WORKING_DIR/docs/build/html/** $DOC_PATH
}

build() {
    echo "Deploy Mode: $1"

    if [ "$1" == "all" ]; then
        buildMechanoid
        buildJavadoc
        buildUserdoc
        exit 1
    elif [ "$1" == "product" ]; then
        buildMechanoid
        exit 1
    elif [ "$1" == "javadoc" ]; then
        buildJavadoc
        exit 1
    elif [ "$1" == "userdoc" ]; then
        buildUserdoc
        exit 1
    elif [ "$1" == "alldocs" ]; then
        buildJavadoc
        buildUserdoc
        exit 1
    else
        echo "Invalid Build Option: $1"
        exit 0
    fi
}

usage() {
    echo "Usage:$0 (product|javadoc|userdoc|alldocs|all)"
}

if [ "$#" -eq "0" ]; then
    usage
    exit 1
else
    build $1
fi




