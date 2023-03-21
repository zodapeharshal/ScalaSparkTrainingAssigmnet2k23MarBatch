package ShlokThakkar

import scala.collection.mutable.ListBuffer
import scala.util.{Failure, Success}

class Assignments{

  //Pack consecutive duplicates of list elements into sublist.


  //check is sum of all the element in the list is divisible by X or not.
  def divisibleByX(x: Int, inputList: List[Int]): Boolean = {
    if (x == 0) {
      println("X can not be 0")
      false
    }
    else {
      if (inputList.sum % x == 0) {
        true
      }
      else {
        false
      }
    }
  }

  //Insert element at given position
  def insertElement(element:Int,position: Int,inputList :List[Int],outputList :List[Int] = List()): List[Any] =
  {
    if(position==0) {
      (outputList++List(element)++inputList)
    }
    else{
      insertElement(element,position-1,inputList.tail, outputList++List(inputList.head))
    }
  }

  //Split a list into two parts.
  def splitList(position :Int,inputList:List[Int],subList1:List[Int]=List()):List[List[Int]] =
  {
    if(position==0)
      {
        List(subList1,inputList)
      }
    else {
      splitList(position-1,inputList.tail,subList1++List(inputList.head))
    }
  }



  //Vowels in a list of stringss
//  def vowelInWords(input: List[String], output: List[Int] = List()): List[Int] = {
//    val VOWELS = "aeiouAEIOU"
//    input.map()
//  }

}
