package HarsshathMatcha

import HarsshathMatcha.Factorial.factorial
import HarsshathMatcha.Fibonacci.fibonacci
import HarsshathMatcha.LastElement.last
import HarsshathMatcha.findNthHighest.findNthHighest



object Main extends App {
  assert(factorial(5)==120,"wrong ans")
  assert(fibonacci(9)==34, "wrong ans")
  assert(last(List(1,2,3,4,5,6))==6,"Wrong ans")
  assert(findNthHighest(List(4,3,5,1,7,6,9,10),3)==7,"Wrong Ans")

}
