package ArjunChaudhary

object NthLargest {
  def nthLargest(list:List[Int],n:Int):Int={
    val sortedList = list.sortWith(_ > _)
    def nthElement(list: List[Int],n:Int):Int={
      if(n==1) list.head
      else nthElement(list.span(_ == list.head)._2,n-1)
    }
    nthElement(sortedList,n)
  }
}
