package ShlokThakkar
import ShlokThakkar.Assignment1.countSquares
import ShlokThakkar.Assignment2Q1.Factorial
import ShlokThakkar.Assignment2Q2.{Fibonacci, LastElementOfList};


object Main extends App {

  //Checking Squares
  assert(countSquares(Array(1,2,3,4,5)) == 2,"Wrong Number of squares")
  //Factorial of a Number
  assert(Factorial(0) == 1,"Wrong Value")
  // Fibonacci
  assert(Fibonacci(10)==34,"Wrong Fibonacci")

  //Last Element of List
  assert(LastElementOfList(List(1,2,3,4,5,6))==6,"Wrong Last Element")
}
