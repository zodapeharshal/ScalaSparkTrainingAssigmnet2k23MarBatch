package Mehul
import scala.annotation.tailrec
  import scala.collection.mutable.ListBuffer
//import MMehul.Assignment6_Q5.solve

object Assignment6_Q11 {

    def insert_in_list(list:List[Int],position:Int,value:Int): List[Int]= {


     def insert_at_pos(list:List[Int],position:Int,value:Int,i:Int,newlist:ListBuffer[Int]):List[Int]= {
         if(list.isEmpty)
           newlist.toList
         else if(position == i) {
           newlist+=value//append kind of function
           insert_at_pos(list.tail, position, value, i + 1,newlist)
         }
         else
           {
             newlist+=list.head
             insert_at_pos(list.tail,position,value,i+1,newlist)
           }

     }
     val new_list=new ListBuffer[Int]
     insert_at_pos(list,position,value,0,new_list)
    }

  /*def main(args:Array[String]): Unit =
  {
    print(insert_in_list(List(2,3,4,5,6,7,8,9,10),5,90))
  }*/

}



