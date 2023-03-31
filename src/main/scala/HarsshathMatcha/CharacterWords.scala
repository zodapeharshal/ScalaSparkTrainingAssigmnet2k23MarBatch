package HarsshathMatcha
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object CharacterWords {
  def characterWords(list:List[String]):List[String]={
    @tailrec
    def countWords(list:List[String],list2:ListBuffer[String]):List[String]={
      if(list.isEmpty) list2.toList
      else if(list.tail.forall(_.length >= list.head.length)) countWords(list.tail,list2.appended(list.head))
      else countWords(list.tail:+list.head,list2)
    }
    val buf = ListBuffer[String]()
    countWords(list,buf)
  }
  //val list = List("ram","Krishna","Shiva","Karna","Harsshath","Vishnu","Gani")
  //println(characterWords(list))
}
