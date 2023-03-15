package ArjunChaudhary

import scala.annotation.tailrec

object Question3 {


  def fibonacci(input: Int): Int = {

    @tailrec
    def fib(a: Int, b: Int, c: Int):Int= {
      if (c == 3)  a + b
      else fib(b, a+b ,c-1)
    }
    val res = if (input == 1) 0 else if (input == 2) 1 else fib(0, 1, input)
    res
  }

}
