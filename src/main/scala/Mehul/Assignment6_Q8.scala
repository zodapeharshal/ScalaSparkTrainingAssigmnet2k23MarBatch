package Mehul
import scala.annotation.tailrec
import MMehul.Assignment6_Q11.insert_in_list

import scala.collection.mutable.ListBuffer

object Assignment6_Q8 {

  def Duplicate_elements_in_list(list:List[Char],times:Int): List[Char]= {

//@tailrec
    def Duplicate_elements(list:List[Char],times:Int,count:Int,i:Int,newlist:ListBuffer[Char]):List[Char]= {
      if(list.isEmpty || i>list.length)
        newlist.toList
      else if(times == count) {
        //append kind of function
        newlist.append(list.head)
        Duplicate_elements(list.tail, times, 0, i + 1,newlist)
      }
      else
      {
        newlist.append(list.head)
        Duplicate_elements(list,times,count+1,i,newlist)
      }

    }
    val new_list=new ListBuffer[Char]
    Duplicate_elements(list,times,1,0,new_list)
  //  new_list.toList
  }
  /*def main(args:Array[String]): Unit =
  {
   print( Duplicate_elements_in_list(List('a','b','c','d'),3))
   // print(new_list)
  }*/

}
