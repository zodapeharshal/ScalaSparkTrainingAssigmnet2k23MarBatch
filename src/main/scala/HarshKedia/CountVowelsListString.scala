package HarshKedia

object CountVowelsListString{
  val vowels = "aeiou".toSet
  def countVowels(str: String): Int = str.toLowerCase.count(vowels.contains)

  def countVowelsList(list: List[String]): List[Int] = list match {
    case Nil => Nil
    //+: is used to add an element to the front of a list
    case x => countVowels(x.head) +: countVowelsList(x.tail)
  }
}
