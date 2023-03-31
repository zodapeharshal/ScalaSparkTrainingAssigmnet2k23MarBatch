package RitikKuril
// nth highest Element
object NthhighestElement {

  def nthhighestelement(list:List[Int],n:Int):Int={

    list.sorted.reverse(n-1)
  }


  def merge(seq1: List[Int], seq2: List[Int]): List[Int] =
    (seq1, seq2) match {
      case (Nil, _) => seq2
      case (_, Nil) => seq1
      case (x :: xs, y :: ys) =>
        if (x < y) x :: merge(xs, seq2)
        else y :: merge(seq1, ys)
    }


  def mergeSort(seq: List[Int]): List[Int] = seq match {
    case Nil => Nil
    case xs :: Nil => List(xs)
    case _ =>
      val (left, right) = seq splitAt seq.length / 2
      merge(mergeSort(left), mergeSort(right))
  }








  def sortfunction(list:List[Int],n:Int):Int ={

   mergeSort(list)
    list(n-1)
  }



  def nthHighest(list: List[Int], n: Int): Int = {
    val pq =scala.collection.mutable.PriorityQueue.empty[Int](Ordering.Int.reverse)
    pq.enqueue(list: _*)
    for (_ <- 1 until n) pq.dequeue()
    pq.dequeue()
  }
}
