# Email 전송

dependency 추가

```java
<dependency>
    <groupId>javax.mail</groupId>
    <artifactId>mail</artifactId>
    <version>1.4</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context-support</artifactId>
    <version>4.1.6.RELEASE</version>
</dependency>
```



application.properties 추가

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=email
spring.mail.password=password
spring.mail.default-encoding=UTF-8
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

