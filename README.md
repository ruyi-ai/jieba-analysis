# [Jieba-analysis](https://github.com/huaban/jieba-analysis)
* 修改
  - 关闭HMM模型
  - 增加词性标注（不影响现有分词的功能以及接口)
* 使用过程
  - 运行bin目录下build.sh脚本生成得到target目录下的jar包文件
    + jieba-analysis-1.0.3-SNAPSHOT.jar        
    + jieba-analysis-1.0.3-SNAPSHOT-javadoc.jar
    + jieba-analysis-1.0.3-SNAPSHOT-sources.jar

打包的快捷路径
  mvn clean package -DskipTests
