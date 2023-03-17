package HarshalZodape

import scala.collection.mutable.ListBuffer

class InsertElement {

  def split_at(lst: List[Int], lb: ListBuffer[Int], idx: Int): (List[Int], List[Int]) = {
    if (idx == 0){
      return (lb.toList, lst) ;
    }
    lb += lst.head ;
    split_at(lst.tail, lb, idx-1)
  }
  def solve_rec(lst: List[Int], idx:Int,  value: Int) : List[Int] = {
      val b = new ListBuffer[Int]
      val result = split_at(lst, b, idx) ;
      List.concat(result._1, List(value), result._2)
  }

  def solve_scala(lst: List[Int], idx: Int, value: Int): List[Int] = {
    val result = lst.splitAt(idx)
    List.concat(result._1, List(value), result._2)
  }
}
