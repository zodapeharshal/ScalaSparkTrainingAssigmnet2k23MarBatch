package ShlokThakkar

import scala.util.{Failure, Success, Try}

class Assignments{


  //nth prime number
  def nthPrime(n:Int,count :Int =0,number :Int =2,prime:Int = 0): Int =
  {
    if(count==n) {
      prime
    }
    else{
      if(isPrime(number)) {
        nthPrime(n, count+1, number + 1,number)
      }
      else{
        nthPrime(n,count,number+1,prime)
      }
    }
  }

  def isPrime(number :Int,temp:Int=2): Boolean={
    if(number == 2){
      true
    }
    else if(temp > Math.sqrt(number)){
      true
    }
    else if(number%temp==0){
      false
    }
    else{
      isPrime(number,temp+1)
    }
  }


  //Pack consecutive duplicates of list elements into sublist.
  def consecutive(input: List[Char],output:List[List[Char]]=List()) :List[List[Char]] =
  {
    if(input.isEmpty){
      output
    }
    else if(output.isEmpty){
      consecutive(input.tail,output++List(List(input.head)))
    }
    else if(output.last.head == input.head){
      consecutive(input.tail, output.take(output.length-1)++List(output.last++List(input.head)) )
    }
    else{
      consecutive(input.tail, output++List(List(input.head)))
    }
  }


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
      case Success(_) =>
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
      case Failure(_) =>
        throw new Exception("X cannot be zero")
        false
    }
  }


  //Insert element at given position
  def insertElement(element:Int,position: Int,inputList :List[Int],outputList :List[Int] = List()): List[Any] =
  {
    if(position==0) {
      outputList++List(element)++inputList
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
    if(inputList.tail.isEmpty) {
      outputList++List.fill(n)(inputList.head)
    }
    else{
      duplicateElements(n, inputList.tail, outputList++List.fill(n)(inputList.head))
    }
  }


  //Vowels in a list of strings
  def vowelInWords(input: List[String]): List[Int] = {
    val VOWELS = "aeiouAEIOU"
    input.map(x=>{
      x.count(VOWELS.contains(_))
    })
  }

}
