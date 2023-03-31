package Mehul
import scala.collection.mutable.ListBuffer
object Assignment6_Q9 {
  //drop the n th element from the list
  def DropNthElement(position:Int,list:List[Int]): List[Int]= {


    def drop_at_pos(list:List[Int],position:Int,i:Int,newlist:ListBuffer[Int]):List[Int]= {
      if(list.isEmpty)
        newlist.toList
      else if(position == i) {

        drop_at_pos(list.tail, position, i + 1,newlist)
      }
      else
      {
        newlist+=list.head
        drop_at_pos(list.tail,position,i+1,newlist)
      }

    }
    val new_list=new ListBuffer[Int]
    drop_at_pos(list,position,0,new_list)
  }

  /*def main(args:Array[String]): Unit =
  {
    print(DropNthElement(3,List(2,4,6,8,10,12,14,16)))
  }*/

}
