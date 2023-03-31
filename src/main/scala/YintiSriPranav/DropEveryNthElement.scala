package YintiSriPranav

object DropEveryNthElement extends App{
  def dropEveryNthElement(lst: List[Int], n: Int): List[Int] = {
    if (lst.length == 0 || n <= 0) {
      println("Error: Input list is empty or n is less than or equal to 0.")
      return Nil
    } else {
      def dropHelper(lst: List[Int], count: Int): List[Int] = {
        lst match {
          case Nil => Nil
          case x :: xs =>
            if (count == n) dropHelper(xs, 1)
            else x :: dropHelper(xs, count + 1)
        }
      }

      return dropHelper(lst, 1)
    }
  }

  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val n = 2

  val result = dropEveryNthElement(lst, n)

  println(s"Dropped every $n-th element from $lst: $result")

}
