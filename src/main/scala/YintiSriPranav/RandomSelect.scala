package YintiSriPranav
import scala.util.Random
object RandomSelect extends App{
  def randomSelect[A](n: Int, list: List[A]): Either[String, List[A]] = {
    if (list.isEmpty) {
      Left("Error: input list is empty")
    } else {
      Right(Random.shuffle(list).take(n))
    }
  }

  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val result = randomSelect(3, lst)
  println(result)

}
