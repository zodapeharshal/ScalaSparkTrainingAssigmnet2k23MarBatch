package ShlokThakkar

object Assignment1 extends App{

  def countSquares(array: Array[Int]): Int =
  {
    val count =  array.count(x=> Math.sqrt(x)%1==0)
    count
  }
  //  println("Enter Number of Chests: ")
  //  val NumberOfChests = scala.io.StdIn.readInt();
//  println("Enter Space Separated Value of each chest: ")
//
//  val array = scala.io.StdIn.readLine().split(" ").map(_.toInt)
//  val count1 = countSquares(array)
//
//  println(count1)
}

