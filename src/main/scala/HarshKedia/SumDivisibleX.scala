package HarshKedia

object SumDivisibleX{
  def sumOfList(list: List[Int]): Int = {
    def helper(list: List[Int], result: Int): Int = {
      list match {
        case Nil => result
        case x => helper(x.tail, result + x.head)
      }
    }
    helper(list, 0)
  }

  def sumDivisibleByX(list: List[Int], x: Int): Boolean = {
    sumOfList(list) % x == 0
  }
}
