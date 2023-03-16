package ShlokThakkar

object Assignment2Q1{
  def Factorial(x:Int,fact: Int=1 ): Int =
  {
    if(x<=1)
      fact
    else {
      Factorial(x-1,x*fact)
    }
  }
}

