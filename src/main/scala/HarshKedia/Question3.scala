package HarshKedia
import annotation.tailrec

object Question3{
  def fibonacci(n: Int): Int = {
    // to make sure from the complier code is tail-recursive
    @annotation.tailrec
    def help(a: Int, b: Int, n: Int): Int = {
      if (n == 0) a
      else help(b, a + b, n - 1)
    }
    help(0, 1, n)
  }
}
