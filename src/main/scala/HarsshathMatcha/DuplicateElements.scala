package HarsshathMatcha
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object DuplicateElements  {
  def duplicateElements(list:List[Char],N:Int):List[Char]={
    @tailrec
    def duplicateEle(list: List[Char],N:Int,count:Int,list2:ListBuffer[Char]):List[Char]={
      if(list.isEmpty) list2.toList
      else if(count==N) duplicateEle(list.tail,N,count=1,list2.appended(list.head))
      else duplicateEle(list,N,count+1,list2.appended(list.head))
    }
    val buf=ListBuffer[Char]()
    duplicateEle(list,N,1,buf)
  }
  //val list=List('a','b','c','c','d')
  //val N= 3
  //println(duplicateElements(list,N))
}
