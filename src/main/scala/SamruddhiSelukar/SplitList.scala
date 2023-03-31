package SamruddhiSelukar

class SplitList {
  def splittingList(n:Int, list: List[Char]): (List[Char], List[Char]) = {
    (list.take(n), list.tail)
  }
}
