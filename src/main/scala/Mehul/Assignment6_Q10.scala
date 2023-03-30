package Mehul
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
object Assignment6_Q10 {

    //split the list where is the given index into two parts


    def SplitListFunction(position:Int,list:List[Int],list_length:Int,sublist:ListBuffer[Int]):List[Int]={
      @tailrec
        def SplitList_at_pos(position:Int,list:List[Int],list_length:Int,i:Int,sublist:ListBuffer[Int]):List[Int]={
              if(list.isEmpty || i>list_length)
                sublist.toList
              else if(i>=position)
              {
                sublist+=list.head
                SplitList_at_pos(position,list.tail,list_length,i+1,sublist)
              }
              else
              {
                SplitList_at_pos(position,list.tail,list_length,i+1,sublist)
              }
         }
        SplitList_at_pos(position,list,list_length,0,sublist)
      }

   /* def main(args:Array[String]): Unit =
    { //using the built_in function
      val a=List(2,4,6,8,9,10,1,2)
      //print(a.splitAt(3))
      val split_part=new ListBuffer[Int]
        //using the recursive way
       print(a.take(3),SplitListFunction(3,a,a.length,split_part))
    }*/

}
