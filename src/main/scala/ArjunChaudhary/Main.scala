package ArjunChaudhary
import Question3.fibonacci
import Question2.factorial
import Question4.lastelement
import SortList.sortList
import ConsecutiveDuplicates.consecutiveDuplicates
import NthPrime.nthPrime
import NthLargest.nthLargest
import SumDivX.sumDivisibleByX
import CountVowels.countVowels
import DuplicateElements.duplicateElements
import DropNthElement.dropNthElement
import SplitList.splitList
import InsertElement.insertElement
object Main extends App {
//  println("Welcome to Scala")
  assert(fibonacci(10)==34,"wrong result fib")
  assert(factorial(5,1)==120,"wrong result fac")
  assert(lastelement(List(1,2,3,4,5))==Some(5),"wrong result last")
  assert(sortList(List("hi","hello","bye","last"))==List("hi", "bye", "last", "hello"),"wrong result sortlist")
  assert(consecutiveDuplicates(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))==
    List(List('a','a','a','a'),List('b'),List('c','c'),List('a','a'),List('d'),List('e','e','e','e')),"wrong result consecutiveDuplicates")
  assert(nthPrime(18)==61,"wrong result nth prime")
  assert(nthLargest(List(1,2,4,6,2,6,3,7),3)==4,"wrong result nth largest")
  assert(sumDivisibleByX(List(1,2,4,6,2,6,2,7),3)==true,"wrong result sum Divisible By X")
  assert(countVowels(List("Count","Vowels","in","list"))==List(2, 2, 1, 1),"wrong result count vowels")
  assert(duplicateElements(List('a','b','c','c','d'),3)==List('a','a','a','b','b','b','c','c','c','c','c','c','d','d','d'),
  "wrong result duplicate elements")
  assert(dropNthElement(List('a','b','c','d','e','f','g'),2)==List('a','c','e','g'),"wrong result drop nth element")
  assert(splitList(List('a','b','c','d','e','f','g','h','i','j','k'),3)==(List('a','b','c'),List('d','e','f','g','h','i','j','k')),
    "wrong result splitlist")
  assert(insertElement(List('a','b','c','d','e','f','g'),'z',4)==List('a','b','c','d','z','e','f','g'),"wrong result insert element")
}
