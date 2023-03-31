package ArjunChaudhary

object ConsecutiveDuplicates{
  def consecutiveDuplicates(list: List[Char]):List[List[Char]]= list match {
    case Nil => Nil
    case x => {
      val (l1, l2) = x.span(_ == x.head)
      l1::consecutiveDuplicates(l2)
    }
  }

}
