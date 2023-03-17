package YintiSriPranav

object Assignment1 extends App{
  def countPerfectSquares(arr: Array[Int]): Int = {
    def isPerfectSquare(n: Int): Boolean = {
      val sqrtN = math.sqrt(n).toInt
      sqrtN * sqrtN == n
    }

    arr.count(isPerfectSquare)
  }

  val arr = Array(1, 4, 9, 16, 25, 36, 49)
  val count = countPerfectSquares(arr)
  println(s"There are $count perfect squares in the array")
}

