package YintiSriPranav

object vowels extends App{
  def countVowels(str: String): Int = {
    str.count("AEIOUaeiou".contains(_))
  }

  def countVowels(words: List[String]): List[Int] = {
    words.map(countVowels)
  }

  val words = List("My", "name", "is", "Yinti", "Sri", "Pranav")
  val vowelCounts = countVowels(words)
  println(vowelCounts)
}
