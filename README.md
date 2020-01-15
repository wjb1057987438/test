创建.md文件  
echo " test" >> README.md  
#初始化git  
git init  
#添加文件到git暂存区  
git add *  
#配置邮箱和用户名  
git config --global user.email "1057987438@qq.com"  
git config --global user.name "wjb1057987438"  
#提交代码到git仓库  
 git commit -m "java 练习代码"  
 #关联GitHub远程仓库  
 git remote add origin https://github.com/wjb1057987438/test.git  
#提交到项目的主干分支  
git push -u origin master  
