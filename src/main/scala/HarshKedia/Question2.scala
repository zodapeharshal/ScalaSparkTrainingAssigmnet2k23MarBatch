package HarshKedia

object Question2 extends App {

  def fact(n: Int, result: Int): Int = {
    if (n == 1) result
    else fact(n - 1, n * result)
  }

  print("Enter the number n : ")
  val n= scala.io.StdIn.readLine().trim.toInt
  val result = fact(n,1)

  println(s"The factorial of number $n is : $result")
}
