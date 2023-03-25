package HarsshathMatcha
import scala.collection.mutable.ListBuffer
import scala.annotation._
object InsertElement {

  def insertElement(list: List[Int], ele: Int, pos: Int): List[Int] = {
    @tailrec
    def insEle(list: List[Int], ele: Int, pos: Int, i: Int, list2: ListBuffer[Int]): List[Int] ={
      if (list.isEmpty) list2.toList
      else if (pos == i) {

        insEle(list, ele, pos, i + 1, list2.appended(ele))
      }
      else {

        insEle(list.tail, ele, pos, i + 1, list2.appended(list.head))
      }
    }
    val buf = ListBuffer[Int]()
    insEle(list,ele,pos,1,buf)
    }
  //val list = List(1, 2, 3, 4, 5, 6, 7)
  //val newList=insertElement(list,9,2)
  //println(newList)
}