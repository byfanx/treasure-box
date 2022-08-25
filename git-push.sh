#!/usr/bin/env sh

# 提交并推送打包产物

CURRENT_PATH=`pwd`
echo "当前所在路径 : $CURRENT_PATH"

PROJECT_NAME='maven-repo'
PROJECT_BOOT_PATH=`cd .. && pwd`

PROJECT_PATH=$PROJECT_BOOT_PATH'/'$PROJECT_NAME

echo "项目所在路径 : $PROJECT_PATH"
cd $PROJECT_PATH

echo "开始 pull ..."
git pull origin master
echo "开始 push ..."
git add .
git commit -m "完善组件"
git push origin master
echo "push 完成..."