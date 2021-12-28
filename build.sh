#!/bin/bash

WORKING_DIR=$PWD
MECH_VERSION=3.0.0
TARGET=target
SITE_PATH=$WORKING_DIR/target/ide/eclipse
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

build() {
    echo "Deploy Mode: $1"

    if [ "$1" == "all" ]; then
        buildMechanoid
        exit 1
    elif [ "$1" == "product" ]; then
        buildMechanoid
        exit 1
    else
        echo "Invalid Build Option: $1"
        exit 0
    fi
}

usage() {
    echo "Usage:$0 (product|all)"
}

if [ "$#" -eq "0" ]; then
    usage
    exit 1
else
    build $1
fi




