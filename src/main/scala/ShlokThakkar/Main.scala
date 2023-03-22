package ShlokThakkar

import ShlokThakkar.Assignment2Q1.factorial
import ShlokThakkar.Assignment2Q2.{fibonacci, lastElementOfList}
import ShlokThakkar.RandomSelect.randomNum


object Main extends App {

  //Checking Squares
  val cs = new CountSquares
  assert(cs.countSquares(Array(1,2,3,4,5)) == 2,"Wrong Number of squares")

  //Factorial of a Number
  assert(factorial(0) == 1,"Wrong Value")

  // Fibonacci
  assert(fibonacci(10)==34,"Wrong Fibonacci")

  //Last Element of List
  assert(lastElementOfList(List(1,2,3,4,5,6))==6,"Wrong Last Element")

  //Random Number from a list
  println(randomNum(3,List('a','b','c','d','e','f','g')))


  val assignments = new Assignments


  //Nth highest element of a list
  //println(assignments.nthHighest(5,List(1,3,5,8,7,4,4,1,5,8,9,5,5,1,5,5,225,8,4,5,5444,4)))
  assert(assignments.nthHighest(3,List(1,3,5,8,7,4,4,1,5,8,9,5,5,1,5,5,225,8,4,5,5444,4))==9,"Wrong nth Highest")


  //Sum of list divisibility
  //println(assignments.divisibleByX(5,List(5,10,15,20,25)))
  assert(assignments.divisibleByX(5,List(5,10,15,20,25))== true,"Incorrect answer for divisibility")


  //Vowels in a Word
  //println(assignments.vowelInWords(List("shlok","thakkar","stutI")))
  assert(assignments.vowelInWords(List("shlok","thakkar","stutI"))==List(1,2,2),"Wrong Answer")

  //Sort elements based on the number of characters
  //println(assignments.sortByLength(List("shk","SHLOK","Thakkar","ab")))
  assert(assignments.sortByLength(List("shk","SHLOK","Thakkar","ab"))==List("ab","shk","SHLOK","Thakkar"),"Wrong Sorting")


  //Duplicate the elements of a list a given number of times
  //println(assignments.duplicateElements(3,List('a','b','c','c','d')))
  assert(assignments.duplicateElements(3,List('a','b','c','c','d'))==List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'))


  //Drop Every Nth element
  //println(assignments.dropElements(3,List(1,2,3,5,7,8,9,4,5,5,6,4,8,9)))
  assert(assignments.dropElements(3,List(1,2,3,5,7,8,9,4,5,5,6,4,8,9))==List(1,2,3,7,8,9,4,5,5,6,4,8,9),"Wrong elements dropped")


  //Split list from given index
  //println(assignments.splitList(3,List(1,2,3,4,5,6,7,8,9)))
  assert(assignments.splitList(3,List(1,2,3,4,5,6,7,8,9))==List(List(1, 2, 3), List(4, 5, 6, 7, 8, 9)),"Wrong Split")


  //Insert Element at a nth position
  //println(assignments.insertElement(5,4,List(1,2,3,4,6,7,8)))
  assert( assignments.insertElement(5,4,List(1,2,3,4,6,7,8))== List(1,2,3,4,5,6,7,8),"Error")

}
