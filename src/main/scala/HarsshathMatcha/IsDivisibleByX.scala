package HarsshathMatcha

import scala.annotation.tailrec

class IsDivisibleByX {
  def isDivisibleElements(list: List[Int], x: Int): Boolean = {
    @tailrec
    def isDiv(list: List[Int], x: Int, sum: Int): Boolean = {
      if (list.isEmpty) sum % x == 0
      else isDiv(list.tail, x, sum = sum + list.head)
    }

    isDiv(list, x, 0)
  }
  //val list = List(1,6,8,4,5,9,2)
  //val x= 7
  //println(isDivisibleElements(list,x))

}
