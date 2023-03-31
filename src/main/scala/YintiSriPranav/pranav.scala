package YintiSriPranav

object pranav extends App{
  def Vow(str: String): Int = {
    str.count("a,e,i,o,u".contains(_))
  }

  def pranav2(words: List[String]): List[Int] = {
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    words.map(_.count(vowels))
  }

  val words = List("I", "am", "working", "in", "Thoughtgenesis", "company")
  val countVowelsinstring = pranav2(words)
  println(countVowelsinstring)




}
