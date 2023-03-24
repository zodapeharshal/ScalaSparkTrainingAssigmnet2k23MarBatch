package HarshKedia
import Question1.PerfectSquare
import Question2.fact
import Question3.fibonacci
import Question4.LastElement
import Question5.duplicate

object Main extends App {
//  Question1
  assert(PerfectSquare(Array(1, 4, 7, 9, 16, 25, 36, 49))==7,"wrong result of perfect square")
  //Question2
assert(fact(4,1)==24,"factorial wrong result")
  //Question3
  assert(fibonacci(5)==5,"fibonacci wrong result")
  //Question4
assert(LastElement(List(1,4,6,8,12)).get==12,"wrong result this is not last element")
  //Question5
  assert(duplicate(List('a', 'a', 'a', 'b', 'c', 'c', 'a', 'd', 'e', 'e', 'e'))==List(List('a', 'a', 'a'), List('b'), List('c', 'c'), List('a'), List('d'), List('e', 'e', 'e')),"wrong result this is not the pack of consecutive list of elements")

}
