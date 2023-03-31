package SamruddhiSelukar

class SublistOfDuplicates {
  def duplicate[A](list: List[A]): List[List[A]] = list match {
    case Nil => Nil
    case x :: xs =>
      val (duplicates, rest) = xs.span(_ == x)
      (x :: duplicates) :: duplicate(rest)
  }
}
