package ShlokThakkar
import ShlokThakkar.Assignment1.countSquares
import ShlokThakkar.Assignment2Q1.factorial
import ShlokThakkar.Assignment2Q2.{fibonacci, lastElementOfList}
import ShlokThakkar.RandomSelect.randomNum


object Main extends App {

  //Checking Squares
  assert(countSquares(Array(1,2,3,4,5)) == 2,"Wrong Number of squares")

  //Factorial of a Number
  assert(factorial(0) == 1,"Wrong Value")

  // Fibonacci
  assert(fibonacci(10)==34,"Wrong Fibonacci")

  //Last Element of List
  assert(lastElementOfList(List(1,2,3,4,5,6))==6,"Wrong Last Element")

  //Random Number from a list
  println(randomNum(3,List('a','b','c','d','e','f','g')))


  val assignments = new Assignments

  //Sum of list dividiblity
  assert(assignments.divisibleByX(5,List(5,10,15,20,25))== true,"Incorrect answer for divisiblity")

  //Insert Element at a nth position
  //println(assignments.insertElement(5,4,List(1,2,3,4,6,7,8)))
  assert( assignments.insertElement(5,4,List(1,2,3,4,6,7,8))== List(1,2,3,4,5,6,7,8),"Error")

  //Split list from given index
  //println(assignments.splitList(3,List(1,2,3,4,5,6,7,8,9)))
  assert(assignments.splitList(3,List(1,2,3,4,5,6,7,8,9))==List(List(1, 2, 3), List(4, 5, 6, 7, 8, 9)),"Wrong Split")


  println(assignments.duplicates(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
}
