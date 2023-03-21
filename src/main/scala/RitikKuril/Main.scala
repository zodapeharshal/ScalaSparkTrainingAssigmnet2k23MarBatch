package RitikKuril
import Question3.Fibonacci
import Question2.Factorial
import Question1.Perfect
import LastElementList.last
import DropNelement.drop
import Packduplicatesublist.helper
import Checksum.total


object Main extends App {

  //assert(Fibonacci(3,0,1)==2,"wrong answer");
 // assert(Factorial(5,1)==120,"wrong answer");
  //assert(Perfect(3)==3,"wrong answer");
 // assert(last(list=List(1,2,3,4))==4,"wrong answer");
 // assert( drop(List(1,2,3,4,5),2)==List(1,3,4,5),"wrong answer" );
  //assert(helper(List(1,1,1,2,2),List())==List(List(1,1,1),List(2,2)),"wrong answer")
 // assert(total(List(1,2,3,4,5),5,0)==true,"wrong answer")
  assert(drop(List(1,2,3,4,5),3,1,List())==List(1,2,4,5),"wrong answer")

}
