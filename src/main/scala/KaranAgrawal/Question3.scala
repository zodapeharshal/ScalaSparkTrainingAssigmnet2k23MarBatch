import scala.annotation.tailrec
object Fibonacci extends App {
println("Enter the number")
  val n = scala.io.StdIn.readInt()

  def fibonacci(input:Int):Int={
@tailrec def fibo(x:Int,a:Int,b:Int):Int={

  if(x==0){
    a
  }
  else{
    fibo(x-1,b,a+b)
  }
}
    fibo(input,0,1)
  }
  println(fibonacci(n))
}
