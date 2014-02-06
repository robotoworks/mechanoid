#!/bin/bash

source ../deploy-mechanoid-settings.sh

REMOTE_SNAPSHOT_PATH=$REMOTE_PATH/mechanoid/updates/snapshot
REMOTE_DOC_PATH=$REMOTE_PATH/mechanoid/doc

clear

deployUpdateSite() {
    echo "Deploying Update Site..."

    ssh $REMOTE_USER "rm -r $REMOTE_SNAPSHOT_PATH"
    ssh $REMOTE_USER "mkdir $REMOTE_SNAPSHOT_PATH"
    scp -r $PWD/target/ide/eclipse/** $REMOTE_USER:$REMOTE_SNAPSHOT_PATH
    scp $PWD/target/lib/mechanoid.jar $REMOTE_USER:$REMOTE_SNAPSHOT_PATH/mechanoid.jar
    scp $PWD/target/lib/mechanoid-sources.jar $REMOTE_USER:$REMOTE_SNAPSHOT_PATH/mechanoid-sources.jar
}

deployDoc() {
    echo "Deploying Docs..."

    ssh $REMOTE_USER "rm -r $REMOTE_DOC_PATH"
    ssh $REMOTE_USER "mkdir -p $REMOTE_DOC_PATH"

    scp -r $PWD/target/doc/** $REMOTE_USER:$REMOTE_DOC_PATH
}

deploy() {
    echo "Deploy Mode: $1"

    if [ "$1" == "all" ]; then
        deployUpdateSite
        deployDoc
        exit 1
    elif [ "$1" == "site" ]; then
        deployUpdateSite
        exit 1
    elif [ "$1" == "doc" ]; then
        deployDoc
        exit 1
    else
        echo "Invalid Deploy Option: $1"
        exit 0
    fi
}

usage() {
    echo "Usage:$0 (site|doc|all)"
}

if [ "$#" -eq "0" ]; then
    usage
    exit 1
else
    deploy $1
fi