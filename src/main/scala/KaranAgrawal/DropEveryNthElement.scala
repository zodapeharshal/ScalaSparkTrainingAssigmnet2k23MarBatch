package KaranAgrawal

object DropEveryNthElement extends App {
val list=List(1,2,3,4,5,6,7,8,9)
  val n=3
  def dropEveryNthElement(list:List[Int],n:Int,index:Int):List[Int]={
    if(index>=list.length){
      list
    }
    else{
      dropEveryNthElement(list.take(index):::list.drop(index+1),n,index+n)
    }
  }
println(dropEveryNthElement(list,n,n))
}
