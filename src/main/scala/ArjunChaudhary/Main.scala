package ArjunChaudhary
import Question3.fibonacci
import Question2.factorial
import Question4.lastelement
object Main extends App {
//  println("Welcome to Scala")
  assert(fibonacci(10)==34,"wrong result fib")
  assert(factorial(5,1)==120,"wrong result fac")
  assert(lastelement((List(1,2,3,4,5)))==Some(5),"wrong result last")
}
