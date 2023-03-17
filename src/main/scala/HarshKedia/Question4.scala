package HarshKedia
object Question4 {
  // using Option to handle the case when list is empty
  def LastElement(list: List[Int]): Option[Int] = {
    if (list.length==0) {
      None
    } else if (list.length==1) {
      Some(list.head)
    } else {
      LastElement(list.tail)
    }
  }
}
