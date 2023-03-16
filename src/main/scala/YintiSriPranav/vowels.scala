package YintiSriPranav

object vowels extends App {
  def countVowels(words: List[String]): List[Int] = {
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    words.map(_.count(vowels))
  }
  val words = List("My", "name", "is", "Yinti", "Sri", "Pranav" )
  val vowelCounts = countVowels(words)
  println(vowelCounts)
}
