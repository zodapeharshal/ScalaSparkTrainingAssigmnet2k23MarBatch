package ShlokThakkar

import scala.collection.mutable.ListBuffer
import scala.util.{Failure, Success, Try}

class Assignments{


  //Nth highest element from a list
  def nthHighest(n:Int, inputList: List[Int]): Int =
  {
    if(n==1)
      {
        inputList.max
      }
    else {
      nthHighest(n-1,dropElements(inputList.indexOf(inputList.max),inputList))
    }
  }


  //Sort words in a list based on length.
  def sortByLength(inputList: List[String]): List[String] = {
    inputList.sortBy(x => x.length)
  }


  //check is sum of all the element in the list is divisible by X or not.
  def divisibleByX(x: Int, inputList: List[Int]): Boolean = {
    Try{
      inputList.sum%x
    }
    match{
      case Success(_) => {
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
      case Failure(_) => {
        throw new Exception("X cannot be zero")
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


  //Drop every Nth element from list
  def dropElements(n:Int, inputList:List[Int]): List[Int] =
  {
    inputList.take(n)++inputList.drop(n+1)
  }


  //Duplicate Elements given number of times
  def duplicateElements(n:Int,inputList:List[Char],outputList:List[Char] = List() ): List[Char] =
  {
    if(inputList.tail.length==0) {
      outputList++List.fill(n)(inputList.head)
    }
    else{
      duplicateElements(n, inputList.tail, outputList++List.fill(n)(inputList.head))
    }
  }


  //Vowels in a list of stringss
  def vowelInWords(input: List[String], output: List[Int] = List()): List[Int] = {
    val VOWELS = "aeiouAEIOU"
    input.map(x=>{
      x.count(VOWELS.contains(_))
    })
  }

}
