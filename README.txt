创建项目目录结构

mvn archetype:generate \
    -DarchetypeGroupId=org.apache.maven.archetypes \
    -DarchetypeArtifactId=maven-archetype-webapp \
    -DgroupId=com.baldurtech \
    -DartifactId=shiny-octo-batman

编译 mvn compile
清空 mvn clean
运行 mvn tomcat:run
打包 mvn package
测试 mvn test

清空并运行 mvn clean tomcat:run

查找Maven仓库 http://mvnrepository.com/

在线的 CI 服务 http://travis-ci.org
登录以后，启用要使用的仓库。然后 push 一个新的提交。
