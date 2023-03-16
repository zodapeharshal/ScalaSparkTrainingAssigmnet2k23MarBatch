package YintiSriPranav
import YintiSriPranav.factorial.factorial
import YintiSriPranav.Fibonacci.fibonacci
object Main extends App {
  //println("Welcome to Scala")
  assert(factorial(5,1)==120,"wrong result")
  assert(fibonacci (10)==34, "wrong result")
}
