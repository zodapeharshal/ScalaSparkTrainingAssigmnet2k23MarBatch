package HarshKedia

object DuplicateElements {
  def duplicateN(n: Int, list: List[Char]): List[Char] = list match {
    case Nil => Nil
    case x => List.fill(n)(x.head) ++ duplicateN(n, x.tail)
  }
}
