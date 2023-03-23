package RitikKuril
// Arrange the element (words) in the list acc to the number of Character in a word.
object NocharacterArj {
  def arrange(list: List[String]): List[String] = {

    val ans = list.sortBy(_.length) // built in function
    ans
  }

  def arrangep(list: List[String], pq: scala.collection.mutable.PriorityQueue[Tuple2[Int, String]]): List[Tuple2[Int, String]] = list match {

    case Nil => pq.dequeueAll.toList

    case head :: tail => arrangep(tail, pq += Tuple2(head.length, head))
  }
}