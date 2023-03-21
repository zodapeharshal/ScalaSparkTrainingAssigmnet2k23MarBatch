package ShlokThakkar

object Assignment1{

  def countSquares(array: Array[Int]): Int =
  {
    val count =  array.count(x=> Math.sqrt(x)%1==0)
    count
  }
}

