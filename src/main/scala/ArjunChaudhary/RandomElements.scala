package ArjunChaudhary

import scala.util.Random

object RandomElements extends App{
  val list =List('a','b','c','d','e','f','g')
  def randomElements[A](list: List[A],num:Int):List[A]={
    val random = new Random()
    val shuffledList=random.shuffle(list)
    shuffledList.take(num)
  }
  println(randomElements(list,3))
}
