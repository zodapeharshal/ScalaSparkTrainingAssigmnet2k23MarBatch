package RitikKuril
// Arrange the element (words) in the list acc to the number of Character in a word.
object NocharacterArj {
  def arrange(list:List[String]):List[String]={

      val ans = list.sortBy(_.length)    // built in function
      ans
   }

}
