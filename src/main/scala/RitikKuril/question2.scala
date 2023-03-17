package RitikKuril
object Question2 {


  def Factorial(n:Int,res:Int):Int ={
   if(n<=1)
     res;

   else
     Factorial(n-1,n*res);

  }
  /*def main(args: Array[String]): Unit = {

    println("Enter the value of n");
    val n= scala.io.StdIn.readInt();
    println("the factorial is=>");

   val ans= factorial(n,1);
    println(ans);


  }

   */
}