package YintiSriPranav

object DuplicateListInElements extends App{
  def duplicateList[T](list: List[T], n: Int): Either[String, List[T]] = {
    if (list.isEmpty) {
      Left("List cannot be empty")
    }  else {
      Right(list.flatMap(elem => List.fill(n)(elem)))
    }
  }

  val list = List(1, 2, 3, 4, 5,6,7,8)
  val n = 2
  val duplicate = duplicateList(list, n)
  duplicate match {
    case Left(error) => println(error)
    case Right(result) => println(result)
  }
}

