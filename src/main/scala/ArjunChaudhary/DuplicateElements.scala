package ArjunChaudhary

object DuplicateElements{

  def duplicateElements(list: List[Char],num:Int):List[Char]=list match {
    case Nil =>Nil
    case x=> {
      List.fill(num)(x.head)::: duplicateElements(x.tail,num)
    }
  }
}
