package YintiSriPranav

object ArrangingTheWords extends App{
  def arrangingTheWords(list: List[String]): Either[String, List[String]] = {
    if (list.isEmpty) {
      Left("List cannot be empty")
    } else {
      Right(list.sortBy(_.length)) //the function uses the sortBy() method
      // to sort the input list according to the length of each string
    }
  }

  val list = List("completing", "all", "the", "questions", "in", "assignment" )
  val sorted = arrangingTheWords(list)
  sorted match {
    case Left(error) => println(error)
    case Right(result) => println(result)
  }

}
