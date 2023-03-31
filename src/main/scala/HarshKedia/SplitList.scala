package HarshKedia

object SplitList{
  def split[A](list: List[A], n: Int): (List[A], List[A]) = {
    def helper(list: List[A], i: Int, left: List[A], right: List[A]): (List[A], List[A]) =
      list match {
      case Nil => (left.reverse, right.reverse)
      case x =>
        if (i < n) helper(x.tail, i + 1, x.head :: left, right)
        else helper(x.tail, i + 1, left, x.head :: right)
    }

    helper(list, 0, Nil, Nil)
  }
}
