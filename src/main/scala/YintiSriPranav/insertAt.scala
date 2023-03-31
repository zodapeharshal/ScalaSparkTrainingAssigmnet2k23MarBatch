package YintiSriPranav

object insertAt extends App{
  def insertAt[T](list: List[T], pos: Int, element: T): Either[String, List[T]] = {
    if (pos < 0 || pos > list.length) {
      Left("Position is invalid")
    } else {
      Right(list.patch(pos, List(element), 0))
    }
  }

  val list = List(1, 2, 3)
  val pos = 1
  val element = 4
  val result = insertAt(list, pos, element)
  println(result) // Right(List(1, 4, 2, 3))

}
