package SamruddhiSelukar

class Factorial {
  def fac(n: Int): Int = {
    if (n<=1) 1
    else n * fac(n-1)
  }
}
