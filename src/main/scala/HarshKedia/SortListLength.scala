package HarshKedia

object SortListLength {
  def sortByLength(list: List[String]): List[String] = {
    // in build sort in scala
    //    list.sortBy(_.length)

    //quick sort
    list match {
      case Nil => Nil
      case pivot => {
        val (less, greater) = pivot.tail.partition(_.length < pivot.length)
        sortByLength(less) ++ List(pivot.head) ++ sortByLength(greater)
      }
    }
  }
}
