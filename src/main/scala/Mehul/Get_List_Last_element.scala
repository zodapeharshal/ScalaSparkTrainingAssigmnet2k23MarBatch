package MMehul
import scala.annotation.tailrec
object Get_List_Last_element {
       def List_last_element(list:List[Int]):Int={

         @tailrec def fun(list:List[Int]): Int =
         {
           if(list.length==1)
             list.head
           else
            fun(list.tail)

         }

         fun(list)

       }
      def main(args:Array[String]): Unit =
  {
   // print(List_last_element(List(2,3,4,5,6)))
    print(List_last_element(List.empty[Int]))
  }
}
