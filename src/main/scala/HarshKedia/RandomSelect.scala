package HarshKedia
import scala.util.Random

object RandomSelect{
  def getRandomElements[A](list: List[A], num: Int): List[A] = {
    val random = new Random()
    val shuffledList= random.shuffle(list)
    shuffledList.take(num)
  }
}
