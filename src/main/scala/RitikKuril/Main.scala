package RitikKuril
import Question3.fibonacci
import Question2.factorial
import Question1.perfect
import LastElementList.last
import DropNelement.drop
import Packduplicatesublist.helper
import Checksum.total
import InsertElement.insert
import SplitArrray.split
import DuplicateElementSam.dup
import NocharacterArj.arrange
import CountvowelsPra.calculate
import RandomElementSelectshlok.randomSelect
import NthhighestElement.nthhighestelement
import NthhighestElement.nthHighest
import NocharacterArj.arrangep
import NthprimeNo.nthPrime
import NthhighestElement.sortfunction
object Main extends App {

  //assert(fibonacci(3,0,1)==2,"wrong answer"); // fibonacci question
  // assert(factorial(5,1)==120,"wrong answer");// factorial question
  //assert(perfect(3)==3,"wrong answer"); // perfect square  question
  // assert(last(list=List(1,2,3,4))==4,"wrong answer");  get the last Element

  //assert(helper(List(1,1,1,2,2),List())==List(List(1,1,1),List(2,2)),"wrong answer") Pack consecutive duplicates of list elements into sublists.
  // assert(total(List(1,2,3,4,5),5,0)==true,"wrong answer")      check is sum of all the element in the list is divisible by X or not.

  // assert( drop(List(1,2,3,4,5),2)==List(1,3,4,5),"wrong answer" );// built in function  Drop every Nth element from a list.
  //assert(drop(List(1,2,3,4,5),3,1,List())==List(1,2,4,5),"wrong answer")                  Drop every Nth element from a list.


  // assert(insert(List(1,2,3,4),4,8,1,List())==List(1,2,3,8,4),"wrong answer");  Insert an element at a given position into a list.

  //assert(split(List(1,2,3,4,5,6),2)==List(List(1, 2), List(3, 4, 5, 6)),"wrong answer");// built in function Split a list into two parts.
  //assert( split(List(1,2,3,4,5,6),4,1,List(List()))==List(List(1, 2, 3), List(4, 5, 6)),"wrong answer")   Split a list into two parts.

  //assert(dup(List(1,2,2,3),2,0,List())==List(1, 1, 1, 2, 2, 2, 2, 3, 3),"wrong answer");  Duplicate the elements of a list a given number of times.

  //  assert(arrange(List("hello","RITIKKK","a","GOdofwar"))==List("a", "hello", "RITIKKK", "GOdofwar"),"wrong answer")// built in method   ( Arrange the element (words) in the list acc to the number of Character in a word.)
  //assert(arrangep(List("hello","pink","aplle","popopop"),scala.collection.mutable.PriorityQueue())==List(Tuple2(7,"popopop"), Tuple2(5,"hello"), Tuple2(5,"aplle"), Tuple2(4,"pink")),wrong answer)(  using priority queue Arrange the element (words) in the list acc to the number of Character in a word.)

  //assert(calculate(List("abcaaa","hello"),scala.collection.mutable.Map())==Map("abcaaa" -> 4, "hello" -> 2),"Wrong answer") Count number of vowels of english alphabet in each word of the list of string.


  // assert(nthPrime(5)==11,"wrong answer")  Find nth prime number from starting if 2 is the first prime number.


  //print(randomSelect(2,List(8,1,9,12,67)))    Extract a given number of randomly selected elements from a list.

  //assert(nthhighestelement(List(5,1,2,89,23),3)==5,"wrong answer") nth highest Element using in build function

  // assert( nthHighest(List(5,2,1,8,3),4))==5,"wrong answer") nth highest Element using priority queue
  // assert(sortfunction(List(5,1,2,3,12),3)==3,"wrong answer") Nth highest element using custom sort function (merge sort)

}