package KaranAgrawal

class NthHighestElementsInList {
//  val list = List(1, 2, 3, 5, 4, 6)
//  val n = 5

  def nthHighestElement(list: List[Int], n: Int, count: Int): Int = {
    if (n == count) {
      list.max
    }
    else {
      nthHighestElement(list.filter(_ != list.max), n, count + 1)
    }
  }
}
