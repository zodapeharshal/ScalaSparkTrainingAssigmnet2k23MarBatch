package HarshKedia

object InsertElement {
  def insert[A](list: List[A], x: A, pos: Int): List[A] = {
    //:: is the cons operator
    //x :: list will create a new list with x as its first element and the rest of the elements from list following it.
    if (pos <= 0) x :: list
    else list.head :: insert(list.tail, x, pos - 1)
  }
  println()
}
