# HoleyWar 
## Simple Spring project for develop/training, contains:
- Spring Boot
- JPA/Hibernate (PostgreSQL):
1. validation of data input,
2. flyway migration,
4. ManyToMany, OneToMany, ManyToOne realizations
- Spring Security
1. password encoding
2. Users and Admins
- Spring Boot Mail (email verification)
- Integration tests (with DB scripts)
- Unit tests (With JUnit and Mockito)
- reCaptcha 
- As frontend implementation im using apache freemaker with Bootstrap  

# if you want to use this app, you need to set up your application.properties file

server.port = 8081  
spring.datasource.url=jdbc:postgresql://localhost/holeyWar  
spring.datasource.username=yourUsername  
spring.datasource.password=your password  

spring.jpa.generate-ddl=false  
spring.jpa.show-sql=false  
spring.jpa.hibernate.ddl-auto=validate  


spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true  
spring.freemarker.expose-request-attributes=true  

upload.path = /c:/home/uploads  
spring.mail.host=smtp.yandex.ru   
spring.mail.username='your username from mail'  
spring.mail.password='your password from mail'  
spring.mail.port=465  
spring.mail.protocol=smtps  
mail.debug=true  

recaptcha.secret='secret of recaptcha'  
spring.session.jdbc.initialize-schema=always  
spring.session.jdbc.table-name=SPRING_SESSION  

hostname=localhost:8081
