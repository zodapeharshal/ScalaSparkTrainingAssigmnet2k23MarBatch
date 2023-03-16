package ArjunChaudhary
//question
// Arrange the element (words) in the list acc to the number of Character in a word.
object SortList extends App {
  val list = List("hi","hello","bye","last")
  val l = list.sortWith(_.length < _.length)
  println(l)


}
