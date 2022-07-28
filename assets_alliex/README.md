# Spring boot multi module base project

##### Technology stack in project:

|Category        |Detail                         |Version                      |
|----------------|-------------------------------|-----------------------------|
|Java            |`JDK`                          |11                           |
|Build tool      |`apache-maven`                 |apache-maven-3.6.2           |
|Framework       |`Spring boot`                  |2.3.3.RELEASE      
|                |`Spring boot security`         |2.3.3.RELEASE  
|                |`mybatis-spring-boot`          |2.1.3                      |
|Database        |`MySql    `                   |5.7                         |
|Web server      |`Apache Tomcat Embedded`       |9.0.30                       |
|Other plugin    |`springfox-swagger`            |3.0.0                        |
|                |`Logback`                      |                             |
|                |`Lombok`                       |1.18.10    
|                |`Mybatis generate maven plugin`|1.4.0   
|                |`Mybatis schema migration maven plugin`|1.1.3  

### Module dependencies 
![Module dependencies](assets/images/rest-api-modules-dependencies.png?raw=true)

### DTO
![DTO](assets/images/DTO.png?raw=true)

##### How to build
Step 1: cd to root folder <br/>
Step 2: run script
```shell script
$ mvn -pl -mybatis-generator clean package -DskipTests
``` 

##### How to deploy
-   OPTION 1: Deploy on external web server as Tomcat
```sh
$ set "JAVA_OPTS=%JAVA_OPTS% -DLOG_PATH=YYY"
```
- OPTION 2: Using embedded container. Running with java tool <br />
Step 1: cd to web/rest/target folder <br />
Step 2: Run this command
```sh
    java -jar {APP_FILE}.jar --spring.profiles.active={ENVINROMENT} --PORT={PORT} --LOG_PATH={PATH} 
```

example: 
* Run on develop environment
    ```shell script
    sudo java -jar rest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=development  --LOG_PATH=/opt/logs/energy_data_platform_dev/dangnh
    ```
* Run on staging env:
    ```
    sudo java -jar rest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=staging --LOG_PATH=/home/nhdang/app_log/web-back --MYSQL_HOST=energy-data-stg-db-01.cfe5ia3jklz0.ap-northeast-1.rds.amazonaws.com  --MYSQL_PORT=3306  --MYSQL_DB=energy_data_platform_stg  --MYSQL_USERNAME=energydata_app --MYSQL_PASSWORD=yBcExGXLUcwJN2xL
    ```

* Run on master env:
    ```
    sudo java -jar rest-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=production --LOG_PATH=/var/log/data_platform/web-back --MYSQL_HOST=energy-data-stg-db-01.cfe5ia3jklz0.ap-northeast-1.rds.amazonaws.com  --MYSQL_PORT=3306  --MYSQL_DB=energy_data_platform_stg  --MYSQL_USERNAME=energydata_app --MYSQL_PASSWORD=yBcExGXLUcwJN2xL --JWT_SECRET=yBcExGXLUcwJN2xL
    ```



##### How to call restful API

![DTO](assets/images/call-api.png?raw=true)

Note: Authorization, id_client: Get from Google Oauth2 service
Accept-Language: en, ja or null 

##### Api's description document
```sh
http://localhost:9000/api/swagger-ui/index.html
```




