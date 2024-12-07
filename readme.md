#NNotla#
## docker Image larını eklemek
PostgreSQL
userName :postgres
d :root
'''bash 
MongoDB
userName : admin 
password : root
DB :UserProfileDB
```bash
docker run -d --name mongodb -p 27017:27017 muhammedali55/mongodb:v.0.3
````
 mongod:
 db.createUser({user:"beyzanur",pwd:"root",roles:["readWrite","dbAdmin"]})
## DOCKER üzerinde Redis Single Node oluşturmak
```bash
docker run --name microservice-redis -p 6379:6379 -d redis
```
```bash
docker run --name redis-gui -d -p 8001:8001 redislabs/redisinsight:1.14.0
```
## redis spring boot configuration
ilgili bağımlılıklar eklenir
implementation 'org.springframework.boot:spring-boot-starter-data-redis:3.2.2'

Dikkat !!!!
Redis repository olarak kullanılabileceği gibi ,Cache olarak kullanılabilir.bu nedenle spring te cache i ve redis repository aktif etmek için gerekli anatasyonları
config e eklemeniz uygun olacaktır
```java

````
`````bash
docker build -t configserver:v01 .






