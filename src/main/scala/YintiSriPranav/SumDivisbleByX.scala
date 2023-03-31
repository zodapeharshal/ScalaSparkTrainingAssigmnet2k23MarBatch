package YintiSriPranav

object isSumDivisbleByX extends App{
  def isSumDivisibleByX(list: List[Int], x: Int): Boolean = {
    val sum = list.sum
    sum % x == 0
  }

  val list = List(1, 2, 3, 4, 5)
  val x = 3
  val result = isSumDivisibleByX(list, x)
  println(result) // false
}
