package YintiSriPranav

object ToFindNthHighestElement extends App{
  def findNthHighestElement(lst: List[Int], n: Int): Option[Int] = {
    if (lst.isEmpty) {
      println("Error: Input list is empty.")
      return None
    } else if (lst.length < n) {
      println("Error: N is greater than the length of the input list.")
      return None
    } else {
      val sortedList = lst.sorted(Ordering[Int].reverse)
      return Some(sortedList(n - 1))
    }
  }

  val lst = List(1, 2, 3, 4, 5)
  val n = 4

  val result = findNthHighestElement(lst, n)

  result match {
    case Some(x) => println(s"The $n-th highest element of $lst is $x.")
    case None => println("Error: Could not find the nth highest element.")
  }
}
