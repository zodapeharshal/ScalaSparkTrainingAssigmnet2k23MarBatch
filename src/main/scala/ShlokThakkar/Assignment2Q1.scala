package ShlokThakkar

object Assignment2Q1{
  def factorial(input:Int,fact: Int=1 ): Int =
  {
    if(input<=1)
      fact
    else {
      factorial(input-1,input*fact)
    }
  }
}

