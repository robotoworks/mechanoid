
WORKING_DIR=$PWD
MECH_VERSION=0.2.0
TARGET=target
SITE_PATH=$WORKING_DIR/target/ide/eclipse
DOC_PATH=$WORKING_DIR/target/doc
APIDOCS_PATH=$WORKING_DIR/target/doc/apidocs
LIB_PATH=$WORKING_DIR/target/lib
BIN_PATH=$WORKING_DIR/target/bin

mvn clean javadoc:javadoc install

rm -r $TARGET
mkdir $TARGET

mkdir -p $SITE_PATH
cp -r $WORKING_DIR/releng/com.robotoworks.mechanoid.updatesite/target/repository/** $SITE_PATH

mkdir -p $LIB_PATH
cp $WORKING_DIR/libs/mechanoid/target/mechanoid-$MECH_VERSION-SNAPSHOT.jar $LIB_PATH/mechanoid.jar
cp $WORKING_DIR/libs/mechanoid/target/mechanoid-$MECH_VERSION-SNAPSHOT-sources.jar $LIB_PATH/mechanoid-sources.jar
cp $WORKING_DIR/plugins/com.robotoworks.mechanoid.standalone/target/com.robotoworks.mechanoid.standalone-$MECH_VERSION-SNAPSHOT.jar $LIB_PATH/mechanoid.runner.jar


mkdir -p $APIDOCS_PATH
cp -r $WORKING_DIR/libs/mechanoid/target/apidocs/** $APIDOCS_PATH
cp -r $WORKING_DIR/docs/build/html/** $DOC_PATH
