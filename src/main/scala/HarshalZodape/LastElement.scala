package HarshalZodape
import scala.annotation.tailrec
class LastElement {
  @tailrec
  final def getLastElement(i:Int, lst: List[Int]): Int = {
    if(i==lst.length-1){
      return lst(i) ;
    }
    getLastElement(i+1, lst) ;
  }

}