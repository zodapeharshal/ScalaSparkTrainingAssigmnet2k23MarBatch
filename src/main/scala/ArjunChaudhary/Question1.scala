package ArjunChaudhary
import scala.io.StdIn

object Assignment1 extends App{
  // the count function evaluates the condition for each element of array, and increments
  // the counter for all true evaluations.
  def count(array: Array[Int], condition: Int => Boolean) = {
    var c: Int = 0
    for (x <- array) {
      if (condition(x)) {
        c = c + 1
      }
    }
    c
  }

  val i = StdIn.readLine("enter the numbers of array separated by space")
  val arr = i.split(" ").map(_.toInt)
  val countt = count(arr, x => (math.sqrt(x) % 1 == 0))
  println(s"number of perfect squares :$countt")

}
