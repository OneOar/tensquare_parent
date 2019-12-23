不重启服务器的情况更改配置文件
必须打开 rabbitMQ  就是本项目中的 sms微服务
通过postman测试 Url: http://127.0.0.1:12000/actuator/bus-refresh Method:
post

自定义配置需要加 @RefreshScope  在Controller

