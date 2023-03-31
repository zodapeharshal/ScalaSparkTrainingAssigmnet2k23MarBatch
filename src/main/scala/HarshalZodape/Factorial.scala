package HarshalZodape
import scala.annotation.tailrec
class Factorial {
  @tailrec
  final def factorial(x: Int, fac:Int): Int = {
    if (x <= 1)
      return fac ;
    factorial(x-1, x * fac) ;
  }
}
