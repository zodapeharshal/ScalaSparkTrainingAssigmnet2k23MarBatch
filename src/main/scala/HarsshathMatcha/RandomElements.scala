package HarsshathMatcha
import scala.util.Random
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
object RandomElements extends App {
      def randomElements(list:List[Char],N:Int):List[Char]={
        if(N>list.length) List.empty[Char]
        else {
          @tailrec
          def randomChar(list: List[Char], N: Int, list2: ListBuffer[Char]): List[Char] = {
            if (N == 0) list2.toList
            else {
              val x = Random.nextInt(list.length)
              randomChar(list.filter(_ != list(x)), N - 1, list2.addOne(list(x)))
            }
          }
          val buf = ListBuffer[Char]()
          randomChar(list, N, buf)
        }
      }
  val list=List('a','b','c','d','e','f','g')
  val N= 3
  println(randomElements(list, N))
}
