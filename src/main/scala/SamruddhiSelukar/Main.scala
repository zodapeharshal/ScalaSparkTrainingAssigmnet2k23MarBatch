package SamruddhiSelukar

object Main {
//  println("Welcome to Scala")
  def main(args: Array[String]): Unit = {
//    val greet = new Hello
//    greet.helloWorld()

//    val calcFac = new Factorial
//    val n = 5
//    println(s"The factorial of $n is ${calcFac.factorial(n)}")

    val fib = new Fibonacci
    val n = 10
    println(s"The fibonacci series is ${fib.fibonacci(n)}")
  }
}
