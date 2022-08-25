#!/usr/bin/env sh

# deploy 项目

CURRENT_PATH=`pwd`
echo "当前所在路径 : $CURRENT_PATH"

PROJECT_NAME='maven-repo'
PROJECT_BOOT_PATH=`cd .. && pwd`

DEPLOY_PATH=$PROJECT_BOOT_PATH'/'$PROJECT_NAME

echo "Maven deploy 路径 : $DEPLOY_PATH"

echo "开始 deploy ..."

mvn clean deploy -Dmaven.test.skip  -DaltDeploymentRepository=self-mvn-repo::default::file:$DEPLOY_PATH

echo "deploy 完成..."
