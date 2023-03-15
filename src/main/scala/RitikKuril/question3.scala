package RitikKuril
object Question3 {


  def Fibonacci(n:Int,temp0:BigInt,temp1:BigInt):BigInt ={

    if(n==1)
      temp1;

    else if(n==0)
      temp0;
    else
      Fibonacci(n-1,temp1,temp0+temp1);

  }
  /*def main(args: Array[String]): Unit = {

    println("Enter the value of n");
    val n= scala.io.StdIn.readInt();
    println("the factorial is=>");

   val ans= fibonacci(n-1,0,1);
    println(ans);


  }

   */
}
