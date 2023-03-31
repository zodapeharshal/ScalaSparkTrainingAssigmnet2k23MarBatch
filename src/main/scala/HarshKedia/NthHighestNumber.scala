package HarshKedia

object NthHighestNumber {

  def nthHighest(list: List[Int], n: Int): Option[Int] = {
    require(n > 0, "n must be greater than zero")
    //sort the list in ascending order then reverse it
    val sortedList = list.sorted.reverse
    nthElement(sortedList, n)
  }

  def nthElement(list: List[Int], n: Int): Option[Int] = {
    (list, n) match {
      // list is empty
      case (Nil, _) => None
      // one element
      case (x :: _, 1) => Some(x)
      case (x :: xs, _) if x == xs.head => nthElement(xs, n)
      case (x :: xs, _) => nthElement(xs, n - 1)
    }
  }
}
