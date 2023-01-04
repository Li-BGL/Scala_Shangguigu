package Demos.Chapter07



object Scala07_Collection_Map extends App {

  //todo 集合-Map（映射，关联）
  //Map集合中存储的是K-V键值对数据
  //这个数据是无序的，而且k不能重复，v是可以重复的
  //可以通过map中的key关联到value
  //Map是一个trait，一般情况下，采用伴生对象的apply方法进行构建，默认为不可变Map集合

  //todo 构建
  //scala中kv键值对可以采用特殊的方法构建
  val kv = "a" -> 1
  val map = Map(kv, "b"->2,"c" ->3,"d" ->4, "e" ->5)
  println(map)  //打印出来是无序的

  val map2 = Map("a" -> 1,"a" -> 2,"a" -> 3)
  println(map2) //只会出来"a" -> 3,因为最后一个覆盖掉了前面的

  //todo增删改查
  //不可变Map集合的数据基本操作还是特殊符号.
  //对现有集合做处理，通常是对可变集合进行，不可变集合通常不变









}
