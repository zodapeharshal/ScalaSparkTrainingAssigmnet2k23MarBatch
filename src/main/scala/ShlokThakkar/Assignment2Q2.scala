package ShlokThakkar

import scala.annotation.tailrec

object Assignment2Q2{

  // nth number of fibonacci
  @tailrec
  def fibonacci(n:Int ,firstNumber: Int =0, secondNumber: Int=1, start:Int=1 ): Int =
  {
    //terminal condition
    // returning first number to solve the problem of returning 0 at n=1
    if(start == n)
      {
        firstNumber
      }
    //updating the value of firstnumber to secondnumber and increasing the value of start
    else
      {
        fibonacci(n,secondNumber,secondNumber+firstNumber, start+1)
      }
  }


  //Last Element Of a List
  @tailrec
  def lastElementOfList(input: List[Int]): Int =
  {
    
    if(input.tail.length==1)
      {
        input.tail.head
      }
    else
      {
        lastElementOfList(input.tail)
      }
  }


}
