package ArjunChaudhary

object SplitList{
  def splitList[A](list: List[A],n:Int)={
    val l1=list.take(n)
    val l2=list.drop(n)
    (l1,l2)
  }
}
