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

/resource/database.properties

```properties
driver = com.mysql.jdbc.Driver
url = 
username = root
password = 5555
```

/resource/mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <properties resource="database.properties"></properties>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="${driver}"/>
                <property name="url" value="${url}"/>
                <property name="username" value="${username}"/>
                <property name="password" value="${password}"/>
            </dataSource>
        </environment>
    </environments>
    <mappers>
        <!-- 使用相对于类路径的资源引用 -->
        <!--<mapper resource="com/wdg/mybatis/mapper/BlogMapper.xml"/>-->
        <!-- 将包内的映射器接口实现全部注册为映射器 -->
        <!--<package name="com.wdg.mybatis.mapper"></package>-->
        <!-- 使用映射器接口实现类的完全限定类名 -->
        <!--<mapper class="com.wdg.mybatis.mapper.BlogMapper"></mapper>-->
        <!-- 使用完全限定资源定位符（URL） -->
        <mapper url="file:///F:/pop-framework-source/WuDG/pop-framework/pop-framework-mybatis/src/main/resources/com/wdg/mybatis/mapper/BlogMapper.xml"></mapper>
    </mappers>
</configuration>
```

#### 作用域和生命周期

`SqlSessionFactoryBuilder` 建议最佳作用域是方法作用域

`SqlSessionFactory` 全局唯一，运行期间一直存在

`SqlSession` 线程唯一，没有HTTP请求就打开一个SqlSession

#### 映射器实例

```java
BlogMapper mapper = session.getMapper(BlogMapper.class);
Blog blog = mapper.select(1);
```



###  XML配置

#### 属性

* configuration（配置）          
  * [properties（属性）](https://mybatis.org/mybatis-3/zh/configuration.html#properties)
  * [settings（设置）](https://mybatis.org/mybatis-3/zh/configuration.html#settings)
  * [typeAliases（类型别名）](https://mybatis.org/mybatis-3/zh/configuration.html#typeAliases)
  * [typeHandlers（类型处理器）](https://mybatis.org/mybatis-3/zh/configuration.html#typeHandlers)
  * [objectFactory（对象工厂）](https://mybatis.org/mybatis-3/zh/configuration.html#objectFactory)
  * [plugins（插件）](https://mybatis.org/mybatis-3/zh/configuration.html#plugins)
  * environments（环境配置）
    * environment（环境变量）                  
      * transactionManager（事务管理器）
      * dataSource（数据源）
  * [databaseIdProvider（数据库厂商标识）](https://mybatis.org/mybatis-3/zh/configuration.html#databaseIdProvider)
  * [mappers（映射器）](https://mybatis.org/mybatis-3/zh/configuration.html#mappers)

```xml
<properties resource="database.properties">
    <property name="username" value="root"/>
    <property name="password" value="5555"/>
</properties>
```