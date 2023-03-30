package HarsshathMatcha

import HarsshathMatcha.CharacterWords.characterWords
import HarsshathMatcha.CountVowels.countVowels
import HarsshathMatcha.DropEveryNthElement.dropNthElement
import HarsshathMatcha.DuplicateElements.duplicateElements
import HarsshathMatcha.DuplicateSubLists.duplicateSubLists
import HarsshathMatcha.Factorial.factorial
import HarsshathMatcha.Fibonacci.fibonacci
import HarsshathMatcha.FindNthHighestElement.findNthHighestElement
import HarsshathMatcha.InsertElement.insertElement
import HarsshathMatcha.IsDivisible.isDivisibleElements
import HarsshathMatcha.LastElement.last
import HarsshathMatcha.NthPrimeNumber.nthPrimeNumber
import HarsshathMatcha.SplitList.splitList


object Main extends App {
  assert(factorial(5)==120,"wrong ans")
  assert(fibonacci(9)==34, "wrong ans")
  assert(last(List(1,2,3,4,5,6))==6,"Wrong ans")
  assert(findNthHighestElement(List(4,3,5,1,7,6,9,10),3)==7,"Wrong Ans")
  assert(characterWords(List("ram","Krishna","Shiva","Karna","Harsshath","Vishnu","Gani"))==List("ram", "Gani", "Shiva", "Karna", "Vishnu", "Krishna", "Harsshath"),"Wrong Ans")
  assert(countVowels(List("Shiva","Harsshath","Karna","ViratKohli","PrabhuTeja"))==List(2, 2, 2, 4, 4),"Wrong Ans")
  assert(dropNthElement(List(1, 6, 3, 8, 9, 7),3)==List(1,6,8,9),"Wrong Ans")
  assert(duplicateElements(List('a','b','c','c','d'),3)==List('a','a','a', 'b','b','b','c','c','c','c','c','c','d','d','d'),"Wrong Ans")
  assert(duplicateSubLists(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))==List(List('a','a','a','a'), List('b'), List('c','c'), List('a','a'), List('d'), List('e','e','e','e')),"Wrond Ans")
  assert(insertElement(List(1, 2, 3, 4, 5, 6, 7),9,2)==List(1, 9, 2, 3, 4, 5, 6, 7),"Wrong Ans")
  assert(isDivisibleElements(List(1, 6, 8, 4, 5, 9, 2), 7),"Wrong Ans")
  assert(nthPrimeNumber(10)==29,"Wrong Ans")
  assert(splitList(5,List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))==((List('a','b','c','d','e'),List('f','g','h','i','j','k'))),"Wrong Ans")




}
