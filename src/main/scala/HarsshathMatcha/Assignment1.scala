import scala.io.StdIn.readLine
object Assignment1 extends App{
  
  val input : String = readLine("Enter the list of elements :")
  val array = input.split(" ").map(x => x.toInt)
  val count1 = array.count(x=>Math.sqrt(x)%1==0)
  println(s"No of perfect square numbers is $count1")
  
}
