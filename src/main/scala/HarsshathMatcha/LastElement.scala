package HarsshathMatcha
import scala.annotation._
object LastElement {
  def last(list:List[Int]):Int={
    @tailrec
        def lastEle(list: List[Int], lastElement: Int): Int = {
          if (list.isEmpty) lastElement
          else lastEle(list.tail, list.head)
        }
        lastEle(list, 0)
      }
    //val list = List(1,2,3,4,5,6)
     //println(last(list))

    }


