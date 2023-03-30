package ArjunChaudhary

object SumDivX{

  def sumOfList(list: List[Int],res:Int):Int=list match {
    case Nil =>res
    case x=>sumOfList(x.tail,res+x.head)
  }
  def sumDivisibleByX(list: List[Int],x:Int):Boolean={
//  val sum = list.sum
    val sum =sumOfList(list,0)
    if(sum % x==0) true
    else false
  }
}
