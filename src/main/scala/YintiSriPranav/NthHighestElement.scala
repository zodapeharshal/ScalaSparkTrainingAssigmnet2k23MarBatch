package YintiSriPranav

class NthHighestElement {

  def findNthHighestElement(lst: List[Int], n: Int): Int = {
    if (lst.isEmpty) {
      println("Error: Input list is empty.")
      return -1
    } else if (lst.length < n) {
      println("Error: N is greater than the length of the input list.")
      return -1
    } else {
      val sortedList = lst.sorted(Ordering[Int].reverse)
      return (sortedList(n - 1))
    }
  }

 // val lst = List(1, 2, 3, 4, 5)
 // val n = 4

  //val result = findNthHighestElement(lst, n)

  //result match {
   // case Some(x) => println(s"The $n-th highest element of $lst is $x.")
   // case None => println("Error: Could not find the nth highest element.")
  //}

}
