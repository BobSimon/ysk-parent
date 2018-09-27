# 项目结构




# 整体架构说明
###  默认的profile为dev，其他环境通过指定启动参数使用不同的profile，比如：  
###  测试环境：java -jar my-spring-boot.jar --spring.profiles.active=test  
###  生产环境：java -jar my-spring-boot.jar --spring.profiles.active=prod  

1.新建一个名为test的数据库，执行test.sql
2.运行App类，访问：http://localhost:8080/swagger-ui.html 即可看到RESTful API的页面 
3.访问：http://localhost:8083/druid 即可看到sql 监控，不过这里还需要个人登录数据的用户名和密码


# 技术栈
## dubbo 
>>> http://dubbo.apache.org/en-us/
## redis
>>> https://redis.io/
## springboot
>>> https://spring.io/projects/spring-boot
## rabbitmq
>>> http://www.rabbitmq.com/
## zookpeer
>>> https://zookeeper.apache.org/
## spring cloud
>>> http://projects.spring.io/spring-cloud/