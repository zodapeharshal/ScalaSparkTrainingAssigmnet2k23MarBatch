package YintiSriPranav

object DuplicateSublists extends App{
  def duplicate(list1: List[Char], list2: List[List[Char]] = List()): List[List[Char]] = {
    if (list2.isEmpty) {
      duplicate(list1.tail, list2 ++ List(List(list1.head)))
    }
    else if (list1.isEmpty) {
      list2
    }
    else if (list2.last.head == list1.head) {
      duplicate(list1.tail, list2.take(list2.length - 1) ++ List(list2.last ++ List(list1.head)))
  }
    else {
      duplicate(list1.tail, list2++List(List(list1.head)))
    }
  }
  println(duplicate(List('a','a','a','b','b','c','c')))
}




