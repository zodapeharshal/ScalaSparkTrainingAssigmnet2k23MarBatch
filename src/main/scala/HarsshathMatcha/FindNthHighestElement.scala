package HarsshathMatcha
import scala.annotation.tailrec

object FindNthHighestElement extends App {
  def maxFunction(list: List[Int]): Int = {
    @tailrec
    def maxi(list: List[Int], n: Int): Int = {
      if (list.isEmpty) n
      else if (list.head > n) maxi(list.tail, list.head)
      else maxi(list.tail, n)
    }
    maxi(list, Int.MinValue)
  }

  def findNthHighestElement(list: List[Int], n: Int):Int={
    @tailrec
    def nthHighest(list: List[Int], n: Int, len: Int): Int = {
      if (len == n) maxFunction(list)
      else nthHighest(list.diff(List(maxFunction(list))), n, len - 1)
    }

    nthHighest(list, (list.length - n + 1), list.length)
  }

  //val list = List(4, 3, 5, 1, 7, 6, 9, 10)
  //maxFunction(list)
  //println(findNthHighestElement(list,3))

}
