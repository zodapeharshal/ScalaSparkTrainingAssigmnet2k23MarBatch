package KaranAgrawal

object DuplicateListElements extends App{
val list=List(1,2,3,4,5,6)
  val n=3
  def duplicate(value:Int,n:Int,newList:List[Int]):List[Int]={
    if(n==0){
      newList
    }
    else{
      duplicate(value,n-1,newList.::(value))
    }
  }
  def duplicateElements(list:List[Int],n:Int,index:Int,newList:List[Int]):List[Int]={
    if(index>=list.length){
      newList
    }
    else{
      val ls=duplicate(list(index),n,List())
      duplicateElements(list,n,index+1,newList:::ls)
    }
  }
  println(duplicateElements(list,n,0,List()))
}
