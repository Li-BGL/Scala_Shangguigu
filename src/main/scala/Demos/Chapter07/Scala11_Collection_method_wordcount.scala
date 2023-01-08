package Demos.Chapter07

import Demos.ScalaChapter06.scala08_Object_Instance.User

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

object Scala11_Collection_method_wordcount extends App {

  //todo 集合- 使用功能函数实现word count
  //统计一个单词出现的次数（频率）-》词频

  //1. 获取数据源
  val source=Source.fromFile("/Users/lzhao/projects/Scala learning/Shangguigu-scala-learn/data/word")
  val dataList: List[String] = source.getLines().toList //获取每一行

  source.close()

  //2. 判断需要得到的结果

  //3。 根据预想的结果，缺什么补什么
  //3。1 缺少单词，获取单词，将每行数据中的单词分解开来，采用扁平化操作

  val wordList= dataList.flatMap(
    line => {
      line.split(" ")
    }
  )

  println(wordList)

  //map方法，将数据按照指定的规则转换成其他数据，这里的转换可以是数值的转换，也可以类型的转换
  //A=>B

  val wordToOneList = wordList.map(
    word=>{
      (word,1)
    }
  )
  println(wordToOneList)
  //4. 统计数据前，先将数据按照规则聚合在一起
  //   将数据按照指定的规则进行分组：相同的单词放在一起
  //groupby方法会将数据集中的每一条数据加分组标记，相同标记的数据会放置在一起
  //groupBy方法的返回结果就是分组后的Map集合
  //      map集合中的key就是分组标记，value就是相同标记的数据集合

  val wordGroup = wordToOneList.groupBy(
    kv=>{
      kv._1
    }
  )

  val wordCount = wordGroup.view.mapValues(
    list=> {
      list.size
    }
  ).toMap
  println(wordCount)
  //map不能sortBy

  val top3 = wordCount.toList.sortBy(
    wc => {
      wc._2
    }
  )(Ordering.Int.reverse).take(3)

  println(top3)










}
