package HarshKedia

object Question2{
  def fact(n: Int, result: Int): Int = {
    if (n == 1) result
    else fact(n - 1, n * result)
  }
}