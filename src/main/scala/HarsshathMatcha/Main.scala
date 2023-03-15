package HarsshathMatcha

import HarsshathMatcha.Factorial.factorial
import HarsshathMatcha.Fibonacci.fibonacci
import HarsshathMatcha.LastElement.last



object Main extends App {
  assert(factorial(5)==120,"wrong ans")
  assert(fibonacci(9)==34, "wrong ans")
  assert(last(List(1,2,3,4,5,6))==6,"Wrong ans")

}
