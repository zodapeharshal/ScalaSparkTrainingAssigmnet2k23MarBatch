package SamruddhiSelukar

class NthLargest {
  def nthLargestNum(n: Int, list: List[Int]): Int = {
    if (n > (list.length)-1) throw new IllegalArgumentException(s"n should be in range than 0 to ${(list.length)-1}")
    else{
      val descendSort = list.sortWith(_ > _)
      descendSort.apply(n-1)
    }
  }
}
