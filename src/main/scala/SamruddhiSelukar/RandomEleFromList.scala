package SamruddhiSelukar
import scala.util.Random

class RandomEleFromList {
  def selectRandomEle[A](n:Int, list: List[A]): List[A] = {
    val rand = new Random()
    val randomizeList = rand.shuffle(list.indices.toList).take(n)
    randomizeList.map(list(_))
  }
}
