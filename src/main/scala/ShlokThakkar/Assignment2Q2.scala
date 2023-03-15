package ShlokThakkar

object Assignment2Q2 extends App {
  //n is the nth number of fibonacci
def Fibonacci(n:Int ,firstNumber: Int =0, secondNumber: Int=1, Start:Int=1 ): Int =
  {
    //terminal condition
    // returning first number to solve the problem of returning 0 at n=1
    if(Start == n)
      {
        firstNumber
      }
    //updating the value of firstnumber to secondnumber and increasing the value of start
    else
      {
        Fibonacci(n,secondNumber,secondNumber+firstNumber, Start+1)
      }
  }
  val n = scala.io.StdIn.readLine("Enter the number: ").trim.toInt
  println(Fibonacci(n))
}
