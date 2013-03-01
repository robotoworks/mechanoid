#!/bin/bash

source ../deploy-mechanoid-settings.sh

REMOTE_SNAPSHOT_PATH=$REMOTE_PATH/mechanoid/updates/snapshot
REMOTE_DOC_PATH=$REMOTE_PATH/mechanoid/doc
REMOTE_APIDOCS_PATH=$REMOTE_PATH/mechanoid/doc/apidocs

clear

deployUpdateSite() {
    echo "Deploying Update Site..."

    ssh $REMOTE_USER "rm -r $REMOTE_SNAPSHOT_PATH"
    ssh $REMOTE_USER "mkdir $REMOTE_SNAPSHOT_PATH"
    scp -r $PWD/releng/com.robotoworks.mechanoid.updatesite/target/repository/** $REMOTE_USER:$REMOTE_SNAPSHOT_PATH
    scp $PWD/libs/mechanoid/target/mechanoid-0.1.0-SNAPSHOT.jar $REMOTE_USER:$REMOTE_SNAPSHOT_PATH/mechanoid.jar
    scp $PWD/libs/mechanoid/target/mechanoid-0.1.0-SNAPSHOT-sources.jar $REMOTE_USER:$REMOTE_SNAPSHOT_PATH/mechanoid-sources.jar
}

deployJavaDoc() {
    echo "Deploying Javadoc..."

    ssh $REMOTE_USER "mkdir $REMOTE_DOC_PATH"

    ssh $REMOTE_USER "rm -r $REMOTE_APIDOCS_PATH"
    ssh $REMOTE_USER "mkdir $REMOTE_APIDOCS_PATH"
    scp -r $PWD/libs/mechanoid/target/apidocs/** $REMOTE_USER:$REMOTE_APIDOCS_PATH
}

deployUserDoc(){
    echo "Deploying User Docs..."

    scp -r $PWD/docs/build/html/** $REMOTE_USER:$REMOTE_DOC_PATH
}

deploy() {
    echo "Deploy Mode: $1"

    if [ "$1" == "all" ]; then
        deployUpdateSite
        deployJavaDoc
        deployUserDoc
        exit 1
    elif [ "$1" == "site" ]; then
        deployUpdateSite
        exit 1
    elif [ "$1" == "doc" ]; then
        deployUserDoc
        deployJavaDoc
        exit 1
    elif [ "$1" == "javadoc" ]; then
        deployJavaDoc
        exit 1
    elif [ "$1" == "userdoc" ]; then
        deployUserDoc
        exit 1
    else
        echo "Invalid Deploy Option: $1"
        exit 0
    fi
}

usage() {
    echo "Usage:$0 (site|doc|userdoc|javadoc|all)"
}

if [ "$#" -eq "0" ]; then
    usage
    exit 1
else
    deploy $1
fi