package Mehul
import scala.collection.immutable.Nil.:::
import scala.collection.mutable.ListBuffer
object Assignment6_Q1 {
  //make_Sublist()
  // taken reference from karan's code as mycode was written unclean and hence fcaing issues while working with list buffer
  def Make_Sublist(list: List[Int], i: Int, templist:List[Int]):(List[Int],Int)={
    if(list.isEmpty || i>=list.length)
      (templist,i)
    else
     {
       if(i==list.length-1 ||list(i)==list(i+1))
         {
           Make_Sublist(list,i+1,templist:+list(i))
         }
       else
         {
           (templist:+(list(i)),i+1)
         }
     }

  }
 def  Duplicate_Sublists_from_list(list:List[Int]):Unit = {

    def fun(list:List[Int],i:Int,sublist_with_list:List[List[Int]]):List[List[Int]]={
      if(list.isEmpty)
        sublist_with_list
      else
      {
        val (new_current,i)=Make_Sublist(list,i,List())
        if (sublist_with_list == List(List())) {
          Make_Sublist(list, i, List(new_current))
        }
        else {
          Make_Sublist(list, i,sublist_with_list :+ (new_current))
        }
      }
    }
   print(fun(list,0,List(List())))
      }





  /*def main(args:Array[String]): Unit =
  { //val a=List.empty[Int]
    val b=   List.empty[List[Int]]
    print(Duplicate_Sublists_from_list( List(2,2,2,3,4,4,4,4,5,5,6,6,6,7,7,8,8),b))
  }/*

}
/* def Duplicate_Sublists_from_list(list:List[Int],list_with_sublist:ListBuffer[ListBuffer[Int]]):(ListBuffer[ListBuffer[Int]])={
      def Duplicate_Sublists(list:List[Int],i:Int,list_with_sublist:ListBuffer[ListBuffer[Int]],list_current:ListBuffer[Int]):Unit={
        if(list.isEmpty)
         print(list_with_sublist)
        else if( list_current.isEmpty)
          {
            list_current+=(list.head)
            Duplicate_Sublists(list.tail,i+1,list_with_sublist,list_current)

          }

        else
          {
            if(list.head==list_current.head)
              {
                list_current+=list.head
                Duplicate_Sublists(list.tail,i+1,list_with_sublist,list_current)
              }
            else
            {
              list_with_sublist:+list_current.map(List(_))
              list_current.remove(0,list_current.length)
              Duplicate_Sublists(list.tail,i+1,list_with_sublist,list_current)
            }
          }
    //    Make_sublist
      }
     val list_current=  List.empty[Int]
    Duplicate_Sublists(list,0,list_with_sublist,list_current)
    //list_with_sublist
  }*/