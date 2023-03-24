package HarshalZodape
import scala.io.StdIn.readLine
import scala.math._
class FindPerfectSquare {
  def findPerfectSquare(): Unit = {
    print("Enter array Values : ")
    val arr = readLine().split(" ").map(_.toInt)
    var ans: Int = 0 ;
    arr.foreach((a) => {
      val x : Int = sqrt(a).toInt ;
      if(x * x == a) ans+=1 ;
    })
    println(s"Total number of perfect square are: ${ans}") ;
  }
}
