package ArjunChaudhary

object CountVowels{
  def countVowels(list: List[String]):List[Int]={
    val vowels = List('a','e','i','o','u')
    list.map(_.count(x => vowels.contains(x.toLower)))
  }
}
