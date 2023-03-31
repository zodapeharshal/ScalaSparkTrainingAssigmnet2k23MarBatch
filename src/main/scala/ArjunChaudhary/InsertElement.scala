package ArjunChaudhary

object InsertElement{
  def insertElement[A](list: List[A], x: A, pos: Int): List[A] = {
    list.take(pos) ::: List(x) ::: list.drop(pos)
  }

}
