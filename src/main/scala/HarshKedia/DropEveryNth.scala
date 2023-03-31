package HarshKedia

object DropEveryNth{
  def dropNthElem[A](n: Int, list: List[A]): List[A] = {
    def helper[A](count: Int, list: List[A]): List[A] =
      list match {
      case Nil => Nil
      case x =>
        if (count % n == 0) helper(count + 1, x.tail)
        else x.head :: helper(count + 1, x.tail)
    }
    helper(1, list)
  }
}
