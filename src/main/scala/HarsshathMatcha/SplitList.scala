package HarsshathMatcha
import scala.annotation.tailrec

object SplitList extends App {
  def splitList(pos: Int, list: List[Char]): (List[Char], List[Char]) = {
    @tailrec
    def splitListElements(pos: Int, list: List[Char], i: Int, list2: List[Char]): (List[Char], List[Char]) = {

      if (pos == i) (list2.appended(list.head), list.tail)
      else splitListElements(pos, list.tail, i + 1, list2.appended(list.head))
    }

    splitListElements(pos, list, 1, Nil)
  }

    val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    println(splitList(5, list))

  }

