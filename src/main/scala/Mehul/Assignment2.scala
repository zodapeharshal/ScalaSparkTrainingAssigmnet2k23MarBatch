import scala.annotation.tailrec

object Assignment2 {
  def factorial(n: Int):BigInt ={
    @tailrec
    def helper(x:Int, res: BigInt) : BigInt=
      if(x<=1) res
      else helper(x-1,x * res)
    helper(n,1)

  }
  def main(args: Array[String]): Unit = {

    println("Enter the value of n");
    val n= scala.io.StdIn.readInt();
    println("the factorial is=>");

    val ans= factorial(n);
    println(ans);


  }



}
