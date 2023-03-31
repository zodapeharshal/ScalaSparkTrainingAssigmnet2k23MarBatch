package SamruddhiSelukar

class DropNthElement {
  def dropEveryNthEle[A](n: Int, list: List[A]): List[A] = {
    list.grouped(n).flatMap(group => group.take(n - 1)).toList
  }
}
