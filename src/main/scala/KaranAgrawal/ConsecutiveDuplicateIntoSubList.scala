package KaranAgrawal

object ConsecutiveDuplicateIntoSubList extends App {
val list=List(1,1,1,2,3,3,4,5,5,5,5,6,7,1,1,2,3,4,4,8,8,8,9,9,9,9)
  def duplicateIntoSubList(list:List[Int],index:Int,newList:List[Int]):(List[Int],Int)={
    if(index>=list.length){
      (newList,index)
    }
    else{
      if(index==list.length-1 || list(index)==list(index+1)){
        duplicateIntoSubList(list,index+1,newList:+list(index))
      }
      else{
        (newList:+(list(index)),index+1)
      }
    }
  }
  def consecutiveDuplicateIntoSubList(list:List[Int],index:Int,newList:List[List[Int]]):List[List[Int]] = {
if(index>=list.length){
  newList
}
    else {
  val (subList, i) = duplicateIntoSubList(list, index, List())
  if (newList == List(List())) {
    consecutiveDuplicateIntoSubList(list, i, List(subList))
  }
  else {
    consecutiveDuplicateIntoSubList(list, i, newList :+ (subList))
  }
}
  }
  println(consecutiveDuplicateIntoSubList(list,0,List(List())))
}
