package KaranAgrawal

object ArrangeAccToNumberOfCharacters extends App {
  val list=List("hello","hi","hey","welcome","great","nice")
  def arrangeAccToNumberOfCharacters(list:List[String]):List[String]={
    list.sortBy(_.length)
  }
  println(arrangeAccToNumberOfCharacters(list))
}
