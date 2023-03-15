package HarsshathMatcha
import scala.annotation._
object LastElement {
  def last(list:List[Int]):Int={
    @tailrec
    def lastElement(list:List[Int],i:Int):Int={
     if(i==list.length-1) list(i)
     else lastElement(list,i+1)
    }
    lastElement(list,0)

  }
  val list=List(1,2,3,4,5,6)
  //println(last(list))

}
