package YintiSriPranav
import factorial.{factorial}
object factorial extends App {

  def factorial(n: Int, res: Int ): Int = {
    if (n == 0) {
      res
    } else {
      factorial(n - 1, n * res)
    }

  }
  assert(factorial(5,1)==120,"wrong result")
}


