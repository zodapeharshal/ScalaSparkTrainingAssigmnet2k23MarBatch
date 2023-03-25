package YintiSriPranav

object SplittingListIntoTwoParts extends App{
  def splitList(lst: List[Int], splitIndex: Int): Option[(List[Int], List[Int])] = {
    if (lst.length == 0 || splitIndex < 0 || splitIndex > lst.length) {
      println("Error: Input list is empty or split index is out of bounds.")
      return None
    } else {
      val (firstPartofList, secondPartofList) = lst.splitAt(splitIndex)
      return Some((firstPartofList, secondPartofList))
    }
  }

  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val splitIndex = 4

  val result = splitList(lst, splitIndex)

  result match {
    case Some((x, y)) => println(s"Split $lst at index $splitIndex: ($x, $y)")
    case None => println("Error: Could not split the input list.")
  }

}
