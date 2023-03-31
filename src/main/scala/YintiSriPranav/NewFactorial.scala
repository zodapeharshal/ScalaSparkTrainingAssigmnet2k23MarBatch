package YintiSriPranav

class NewFactorial {
  def factorial(n: Int, res: Int): Int = {
    if (n == 0) {
      res
    } else {
      factorial(n - 1, n * res)
    }

  }

}
