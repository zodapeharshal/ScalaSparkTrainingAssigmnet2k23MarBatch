package HarshKedia

object Question1{
  def PerfectSquare(arr: Array[Int]): Int = {
    // Count the number of perfect squares
    val result = arr.count(x => Math.sqrt(x) % 1 == 0)
    result
  }
}
