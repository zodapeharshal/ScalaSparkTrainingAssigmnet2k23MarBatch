package ShlokThakkar

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.util.Random

object RandomSelect {

  //Given Number of Random Elements from a List
  @tailrec
  def randomNum(n: Int, input: List[Char], output: ListBuffer[Char] = ListBuffer()): List[Char] = {
    if(n>input.length)
      {
        println("Wrong Input")
        input
      }
    else {
      val randomNumber = new Random()
      if(n==0)
      {
        output.toList
      }
      else {
        val x = randomNumber.nextInt( input.length - 1 )
        output.addOne(input(x))
        randomNum(n-1,input.take(x)++input.drop(x+1), output)
      }
    }
  }
}
