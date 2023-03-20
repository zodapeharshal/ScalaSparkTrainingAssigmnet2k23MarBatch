package Mehul
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
      
}
