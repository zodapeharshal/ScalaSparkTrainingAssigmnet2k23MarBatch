import scala.annotation.tailrec
object Factorial extends App {
 println("Enter the number")
  val n=scala.io.StdIn.readInt()
  def factorial(imput:Int):Int={

    @tailrec def fact(acc:Int,i:Int):Int={
      if(i<=1){
        acc
      }
      else{
        fact(acc*i,i-1)
      }
    }
    fact(1,imput)
  }
  println(factorial(n))
}
