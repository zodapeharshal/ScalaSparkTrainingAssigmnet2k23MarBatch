package MMehul

import scala.annotation.tailrec

object Assignment5 {
  def List_last_element(list:List[Int]):Int={

    @tailrec def fun(list:List[Int]): Int =
    {    if (list.isEmpty)
      throw new Exception("List Can't we empty")
    else if(list.length==1)
      list.head
    else
      fun(list.tail)
    }
    fun(list)
  }
}
