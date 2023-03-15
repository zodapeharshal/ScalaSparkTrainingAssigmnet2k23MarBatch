package HarshKedia
import annotation.tailrec

object Question3 extends App {

  def fibonacci(n: Int): Int = {
    // to make sure from the complier code is tail-recursive
    @annotation.tailrec
    def help(a: Int, b: Int, n: Int): Int = {
      if (n == 0) a
      else help(b, a + b, n - 1)
    }
    help(0, 1, n)
  }

  print("Enter the number n : ")
  val n= scala.io.StdIn.readLine().trim.toInt
  val result = fibonacci(n)

  println(s"The $n th fibonacci number is : $result")
}
