package HarsshathMatcha
import scala.annotation._
object Factorial {
  def factorial(n:Int):Int={
    @tailrec
    def factorialnumber(n:Int, res:Int):Int={
      if(n==0) res
      else factorialnumber(n-1, res*n)
    }
    factorialnumber(n,1)
  }
  //println("enter the number")
  //val n = scala.io.StdIn.readInt()
  //println("The factorial of the number is: ")
  //println(factorial(n))
}

