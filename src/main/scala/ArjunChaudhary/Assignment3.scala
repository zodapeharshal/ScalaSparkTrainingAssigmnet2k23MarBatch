package ArjunChaudhary

object Assignment3 extends App{
  //I did not want to add extra parameters to fibonacci function so I created another function fib
  //that is called from within fibonacci function with extra parameters
  def fib(a: Int, b: Int, c: Int): Int = {
    val res = if (c > 3) fib(b, a + b, c - 1) else a + b
    res
  }

  def fibonacci(input: Int): Int = {
    val res = if (input == 1) 0 else if (input == 2) 1 else fib(0, 1, input)
    res
  }

  println(fibonacci(10))

}
