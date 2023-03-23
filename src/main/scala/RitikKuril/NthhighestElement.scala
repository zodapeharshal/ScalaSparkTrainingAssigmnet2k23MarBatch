package RitikKuril
// nth highest Element
object NthhighestElement {

/*  def nthhighestelement(list:List[Int],n:Int):Int={

    list.sorted.reverse(n-1)
  }
*/


  def nthHighest(list: List[Int], n: Int): Int = {
    val pq =scala.collection.mutable.PriorityQueue.empty[Int](Ordering.Int.reverse)
    pq.enqueue(list: _*)
    for (_ <- 1 until n) pq.dequeue()
    pq.dequeue()
  }
}
