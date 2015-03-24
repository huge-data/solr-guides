
##《Solr实战》源码

> 《Solr实战》书中的基本源码，对应Solr-4.7.0。

### 1. 目录层级

  $SOLR_IN_ACTION/ - 源码相关文件根目录
  |
  |__src/
  |   |__main/
  |      |__java/ - 包含所有示例的Java源文件
  |
  |__example-docs/ - 每章节涉及到的示例配置和内容文件
  |
  |__scripts/ - 每章节相关的脚本
  |
  |__pom.xml - maven构建文件
  |
  |__README.txt - 说明文件
  |
  |__chapter-examples.sh - 执行书中所有脚本的总脚本
  |
  |__solr-in-action.jar - 编译过后的源码 (根据第2步编译生成)


### 2. 构建源码

```
执行命令:

  `mvn clean package`

```

### 3. 运行部分章节示例

```
例如，运行第5章的ExampleSolrJClient示例:

  `java -jar solr-in-action.jar ch5.ExampleSolrJClient`

传入类名参数执行示例：
 
  `java -jar solr-in-action.jar examplesolrjclient`

driver驱动默认会找到对应的类sia.ch5.ExampleSolrJClient

查看所有可用的示例：

  `java -jar solr-in-action.jar`

查看第5章所有示例：

  `java -jar solr-in-action.jar 5`
```

### 4. 书中的代码列表都是HTTP形式的请求

执行代码列表2.1HTTP的请求：

  `java -jar solr-in-action.jar listing 2.1`
