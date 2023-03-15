package YintiSriPranav

object factorial extends App {

  def factorial(n: Int, res: Int ): Int = {
    if (n == 0) {
      res
    } else {
      factorial(n - 1, n * res)
    }

  }
  println(factorial(5,1))
}


