package RitikKuril
import scala.util.Random

//Extract a given number of randomly selected elements from a list
object RandomElementSelectshlok {

  def randomSelect[A](n: Int, list: List[A]): List[A] = {
    require(n <= list.size, "n must be less than or equal to the size of the list")

    val rand = new Random()
    val indices = rand.shuffle((0 until list.size).toList).take(n)
     //print(indices)
  val ans= indices.map(list(_))
    ans
  }
}
