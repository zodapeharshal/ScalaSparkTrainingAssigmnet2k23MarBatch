package ArjunChaudhary

import scala.annotation.tailrec

object Question2 {
  // facotrial function
  @tailrec
  def factorial(input: Int, res:Int): Int = {
    if (input == 1)  res
    else
    factorial(input-1,res*input)
  }

}
