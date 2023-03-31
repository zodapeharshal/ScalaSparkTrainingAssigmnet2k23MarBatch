package SamruddhiSelukar

class InsertElementAtNth {
  def insertEle[A](n: Int, a: A, list: List[A]): List[A] = {
    list.patch(n, List(a), 0)
  }
}
