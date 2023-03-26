package Mehul
import Mehul.Assignment5.List_last_element
import Mehul.Assignment6_Q11.insert_in_list
import Mehul.Assignment6_Q10.SplitListFunction
import Mehul.Assignment6_Q9.DropNthElement
import Mehul.Assignment6_Q5.solve
import Mehul.Assignment6_Q8.Duplicate_elements_in_list
import Mehul.Assignment6_Q4.division_
import Mehul.Assignment6_Q3.NthHIghest
import Mehul.Assignment6_Q1.Duplicate_Sublists_from_list
import Mehul.Assignment6_Q2.no_of_primes
import Mehul.Assignment6_Q6.Count_Vowel_in_Words
import Mehul.Assignment6_Q7.BuiltIn

import scala.collection.mutable.ListBuffer


object Main {

  //gteth elastlist from the lemeent
  assert(List_last_element(List(2,4,6,8,10))==10,"wronganswer")
  //Q4
  assert(division_(List(2,3,4,5,6),2)==1,"not divisible")
  //Q1
  val b=   List.empty[List[Int]]

  assert(Duplicate_Sublists_from_list( List(2,2,2,3,4,4,4,4,5,5,6,6,6,7,7,8,8),b),"error")
  //Q2
  assert(no_of_primes(7)==17,"wronganswer")

  //Q3
  val a=List(2,8,9,12,1,6,23,13,5,7)
  assert(NthHIghest(a,2)==13,"wronganswer")

  //Q5
  assert(  solve(List(2,3,4,5,6,7,8,9,10),9),"error listempty")

  //Q6
  val a= List("apple","banana","waAtermelon","pear")
  assert((Count_Vowel_in_Words(a)))
  //q7
  val a=List("today","is","a","wonderful","day")
  assert(BuiltIn(a))
  //Q8
  assert( Duplicate_elements_in_list(List('a','b','c','d'),3))
  //q9
  assert(DropNthElement(3,List(2,4,6,8,10,12,14,16)))
  //q10
  val a=List(2,4,6,8,9,10,1,2)
  //print(a.splitAt(3))
  val split_part=new ListBuffer[Int]
  //using the recursive way
  assert(a.take(3),SplitListFunction(3,a,a.length,split_part))

  //q11
  assert(insert_in_list(List(2,3,4,5,6,7,8,9,10),5,90))

}
