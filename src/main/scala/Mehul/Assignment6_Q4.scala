package Mehul

import scala.annotation.tailrec

object Assignment6_Q4 {
  def add_elements_list(list: List[Int]): Int = {
    @tailrec
    def add_elements(list: List[Int], total: Int): Int = {

      if (list.isEmpty)
        total
      else
      //total=total+list.head
        add_elements(list.tail, total + list.head)
    }

    add_elements(list, 0)
  }

  def division_(list: List[Int], x: Int): Int = {
    //print(add_elements_list(list))
    if (add_elements_list(list) % x == 0)
      1
    else
      0


  }
  /*def main(args : Array[String])
  {
   print( division(List(1,2,3,4,5,6),3))
  }*/

}
