package HarshKedia

object Question1 extends App {
  // Prompt the user to enter input values
  println("Enter integer values with space :")

  // Read input values as a space-separated string, split it into an array of strings, and convert each element to an integer
  val arr= scala.io.StdIn.readLine().split(" ").map(_.toInt)

  // Count the number of perfect squares
  val result = arr.count(x => Math.sqrt(x) % 1 == 0)

  println(s"The number of perfect squares are: $result")
}
