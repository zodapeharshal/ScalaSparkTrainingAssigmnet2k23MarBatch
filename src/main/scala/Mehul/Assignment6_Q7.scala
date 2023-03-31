package Mehul

object Assignment6_Q7 {
  //arrange the words in the list as count of the cahracters
  def BuiltIn(list:List[String]):List[String]={
    list.sortWith(_.length < _.length)

  }
  /*def Sort(list:List[String]):List[String]={

  }*/
  /*def main(args:Array[String]): Unit =
  {
    val a=List("today","is","a","wonderful","day")
    print(BuiltIn(a))
  }*/

}
