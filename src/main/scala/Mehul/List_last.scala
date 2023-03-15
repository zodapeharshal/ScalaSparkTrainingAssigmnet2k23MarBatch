package Mehul

object List_last {
  def list_recursion(a:List[Int]):Int={
    if(a.isEmpty==true)
    { -1
    }
    else if(a.length==1)
    {
      a.head
    }
    else
    {
      list_recursion(a.tail)
    }
  }
 /* def main(args:Array[String]){
    val a:List[Int]=List(2,3,4)
    //val a=List.empty[Int]
    var b=list_recursion(a)
    if(b == -1) print("list is empty")
    else print(b)

  }
*/
}
