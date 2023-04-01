package KaranAgrawal

object NthHighestElement extends App {
  val list = List(1, 2, 3, 5, 4, 6)
val n=5
  def nthHighestElement(list: List[Int], n: Int, count: Int, mx: Int): Int = {
    if (n == count) {
      list.max
    }
    else {
      nthHighestElement(list.filter(_ != list.max), n, count + 1, mx)
    }
  }

  if (list.isEmpty) {
    println("Given List is Empty")
  }
  else {
    println(nthHighestElement(list, n, 1, 0))
  }
}
