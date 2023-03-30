package SamruddhiSelukar

class SortList {
  def sortLessToMore(list: List[String]): List[String] = {
    val lengthList = list.sortBy(_.length)
    lengthList
  }
}
