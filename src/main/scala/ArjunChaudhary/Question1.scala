package ArjunChaudhary
import scala.io.StdIn

object Question1 extends App{

  val i = StdIn.readLine("enter the numbers of array separated by space")
  val arr = i.split(" ").map(_.toInt)
  val count = arr.count(x => (math.sqrt(x) % 1 == 0))
  println(s"number of perfect squares :$count")

}
