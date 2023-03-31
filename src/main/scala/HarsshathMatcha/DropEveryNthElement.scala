package HarsshathMatcha

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object DropEveryNthElement {
  def dropNthElement(list: List[Int], N: Int): List[Int] = {
    @tailrec
    def dropElement(list: List[Int], N: Int, index: Int, list2: ListBuffer[Int]): List[Int] = {
      if (list.isEmpty) list2.toList
      else if (index == N) dropElement(list.tail, N, index = 1, list2) //list2.toList
      else dropElement(list.tail, N, index + 1, list2.appended(list.head))
    }

    val buf = ListBuffer[Int]()
    dropElement(list, N, 1, buf)
  }

  //val list = List(1, 6, 3, 8, 9, 7)
  //val N = 3
  //println(dropNthElement(list, N))


}
