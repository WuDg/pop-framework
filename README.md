# pop-framework
常用框架学习，spring、spring boot、mybatis、dubbo、spring cloud、netty、zookeeper、elastic search

## pop-mybatis

https://mybatis.org/mybatis-3/zh/index.html

> MyBatis 是一款优秀的持久层框架，它支持自定义 SQL、存储过程以及高级映射。MyBatis        免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作。MyBatis        可以通过简单的 XML 或注解来配置和映射原始类型、接口和 Java POJO（Plain Old        Java Objects，普通老式 Java 对象）为数据库中的记录。

### 入门

#### 添加`jar`或者引入`maven`依赖

```xml
<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.4.6</version>
</dependency>
```

#### 从配置中构建SqlSessionFactory

```java
public static void main(String[] args) throws IOException {
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
```

#### 创建配置mybatis文件

/resource/mybatis-config.xml