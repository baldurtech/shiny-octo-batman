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
