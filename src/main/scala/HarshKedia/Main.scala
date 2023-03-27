package HarshKedia
import HarshKedia.CountVowelsListString.countVowelsList
import HarshKedia.DropEveryNth.dropNthElem
import HarshKedia.DuplicateElements.duplicateN
import HarshKedia.InsertElement.insert
import Question1.PerfectSquare
import Question2.fact
import Question3.fibonacci
import Question4.LastElement
import Question5.duplicate
import NthPrimeNumber.nthPrime
import HarshKedia.NthHighestNumber.nthHighest
import HarshKedia.RandomSelect.getRandomElements
import HarshKedia.SortListLength.sortByLength
import HarshKedia.SplitList.split
import HarshKedia.SumDivisibleX.sumDivisibleByX

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
  // Find nth prime number from starting if 2 is the first prime number.
  assert(nthPrime(3)==5,"wrong result this is not nth prime")
  //Find the nth highest element of the list.
  assert(nthHighest(List(1, 3, 2, 6, 4, 8, 5, 10, 7, 9),3).get==8,"wrong result this is not NthHighestNumber element")
  //check is sum of all the element in the list is divisible by X or not.
  assert(sumDivisibleByX(List(1, 2, 3, 4, 5),3)==true,"wrong result sum is not divisible by X")
  //Count number of vowels of english alphabet in each word of the list of string.
  assert(countVowelsList(List("apple", "banana", "orange"))==List(2, 3, 3),"wrong result these are not correct count of vowels")
  //Arrange the element (words) in the list acc to the number of Character in a word.
  assert(sortByLength(List("intel","amd","nvidia","cereberas","graphcore"))==List("amd", "intel", "nvidia", "cereberas", "graphcore"),"this is not correct sorted list acc to length")
  // Duplicate the elements of a list a given number of times. duplicateN(3, List('a, 'b, 'c, 'c, 'd))  -> List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  assert(duplicateN(3, List('a','b','c','c', 'd'))==List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd'),"this is not correct duplicates of list given number of times")
  // Drop every Nth element from a list.
  assert(dropNthElem(3,List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))==List(1, 2, 4, 5, 7, 8, 10),"this is not correct list after dropping every nth element")
  // Split a list into two parts. split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) -> (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  assert(split(List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'), 3) == (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k')),
    "this is not correct split of list")
  //Insert an element at a given position into a list.
  assert(insert(List(1, 2, 3, 4, 5), 6, 2)==List(1, 2, 6, 3, 4, 5),"wrong insertion !!")
  //Extract a given number of randomly selected elements from a list. randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)) -> List('e, 'd, 'a)
//  println(getRandomElements(List('a, 'b, 'c, 'd, 'f, 'g, 'h),3))
}
