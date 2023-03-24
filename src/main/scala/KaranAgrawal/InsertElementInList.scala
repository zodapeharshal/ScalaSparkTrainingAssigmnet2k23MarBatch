package KaranAgrawal

object InsertElementInList extends App {
val list=List(1,2,3,4,5,6)
  val index=3
  val value=5
  def insertAt(list:List[Int],i:Int,value:Int):List[Int]={
    list.take(i):::List(value):::list.drop(i)
  }
  println(insertAt(list,index,value))
}
