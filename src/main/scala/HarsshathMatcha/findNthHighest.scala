package HarsshathMatcha

import scala.annotation.tailrec

object findNthHighest extends App {
  def findNthHighest(list:List[Int],n:Int):Int={
    @tailrec
    def nthHigh(list:List[Int],n:Int,len:Int):Int={
      if(len==n) list.max
      else nthHigh(list.diff(List(list.max)), n, len-1)
    }
    nthHigh(list,(list.length-n+1),list.length)
  }
  //val list=List(4,3,5,1,7,6,9,10)
  //println(findNthHighest(list,3))


}
