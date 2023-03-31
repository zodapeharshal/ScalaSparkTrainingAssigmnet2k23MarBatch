package HarsshathMatcha
import scala.annotation.tailrec
object DuplicateSubLists{

  def duplicateSubLists(list: List[Char]): List[List[Any]] = {
    @tailrec
    def duplicateEleSubLists(list: List[Char], lastChar : Option[Char], newNestedList: List[List[Char]]): List[List[Char]] = {
      list match {
        case Nil => newNestedList
        case head :: tail if lastChar.isEmpty =>
          val updatedList = List(head)
          duplicateEleSubLists(tail, Some(head), newNestedList.::(updatedList))

        case head :: tail if(lastChar.isDefined && lastChar.get == head)=>
          val updatedList = newNestedList.last.::(head)
          val newUpdatedNestedList = newNestedList.dropRight(1)
          duplicateEleSubLists(tail, Some(head), newUpdatedNestedList.:+(updatedList))

        case head :: tail =>
          val updatedList = List(head)
          duplicateEleSubLists(tail, Some(head), newNestedList.:+(updatedList))
      }
    }
    val buf = Nil
    duplicateEleSubLists(list, None, buf)
  }
  //val list = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
 // println(duplicateSubLists(list))


}


