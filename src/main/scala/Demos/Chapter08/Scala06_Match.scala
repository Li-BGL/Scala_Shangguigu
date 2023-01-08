package Demos.Chapter08

object Scala06_Match extends App {
  val list = List(
    ("Hello World Scala Park", 4),
    ("Hello World Scala", 3),
    ("Hello World", 2),
    ("Hello", 1),
  )
  list.map {
    case (str, cnt) => {
      (str + " ") * cnt
    }
  }.flatMap(_.split(" "))
    .map((_, 1))
    .groupBy {
      case (word, _) => {
        word
      }
    }
    .view.mapValues(_.size)
    .toList.sortBy {
    case (word, cnt) => {
      cnt
    }
  }(Ordering.Int.reverse)
    .take(3).foreach(println)
}
