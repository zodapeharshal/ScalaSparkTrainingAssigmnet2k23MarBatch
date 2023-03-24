package KaranAgrawal

object SplitListIntoTwo extends App{
val list=List(1,2,3,4,5,6,7,8,9)
  val n=3
  def splitListIntoTwo(list:List[Int],n:Int):List[List[Int]]={
    val listOne=list.take(n)
    val listTwo=list.drop(n)
    List(listOne,listTwo)
  }
  println(splitListIntoTwo(list,n))
}
