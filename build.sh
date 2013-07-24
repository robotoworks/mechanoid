#!/bin/bash

WORKING_DIR=$PWD
MECH_VERSION=0.2.0
TARGET=target
SITE_PATH=$WORKING_DIR/target/ide/eclipse
DOC_PATH=$WORKING_DIR/target/doc
APIDOCS_PATH=$WORKING_DIR/target/doc/apidocs
LIB_PATH=$WORKING_DIR/target/lib
BIN_PATH=$WORKING_DIR/target/bin

echo "Building..."
mvn clean install

echo "Building Mechanoid Library Docs..."
mvn -f $WORKING_DIR/libs/mechanoid/pom.xml javadoc:javadoc

echo "Building user docs..."
make -C $WORKING_DIR/docs html

rm -r $TARGET
mkdir $TARGET

mkdir -p $SITE_PATH
cp -r $WORKING_DIR/releng/com.robotoworks.mechanoid.updatesite/target/repository/** $SITE_PATH

mkdir -p $LIB_PATH
MECH_VERSION=0.2.0
MECH_VERSION=0.2.0
MECH_VERSION=0.2.0


mkdir -p $APIDOCS_PATH
cp -r $WORKING_DIR/libs/mechanoid/target/apidocs/** $APIDOCS_PATH
cp -r $WORKING_DIR/docs/build/html/** $DOC_PATH
