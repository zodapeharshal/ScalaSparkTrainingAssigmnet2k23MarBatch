package ShlokThakkar

object Assignment2Q1 extends App {
  def Factorial(x:Int,fact: Int ): Int =
  {
    if(x==1)
      return fact
    else {
      return Factorial(x-1,x*fact)
    }
  }
  val num = scala.io.StdIn.readLine("Enter a number: ")
  println(Factorial(num.trim.toInt,1))
}

