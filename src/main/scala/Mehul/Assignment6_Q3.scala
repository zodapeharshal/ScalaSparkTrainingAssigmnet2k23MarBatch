package Mehul
import scala.collection.mutable.PriorityQueue
object Assignment6_Q3 {
  //get the nth highest element in the list
  def NthHIghest(list:List[Int],n:Int):Int={
    val pq=new PriorityQueue[Int]
    //enqueing elements in priority queue
    for(x <- list)
      pq.enqueue(x)
    //print(pq.dequeueAll(n-1))
    //pq.dequeue
    val Nth={
      val pqc=pq.clone()
      (1 until n).foreach(i => pqc.dequeue())
      pqc.dequeue
    }
    Nth
  }

/*  def main(args:Array[String]): Unit =
  {
    val a=List(2,8,9,12,1,6,23,13,5,7)
    print(NthHIghest(a,2))

    //print(pq.clone.dequeueAll)
  }*/


}
