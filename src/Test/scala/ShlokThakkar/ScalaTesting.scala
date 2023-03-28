package ShlokThakkar

import ShlokThakkar.Main.assignments
import org.scalatest.flatspec._

class ScalaTesting extends AnyFlatSpec{

  behavior of "Factorial of 5"
  it should "match with 120" in{
    assert(Assignment2Q1.factorial(5)==120)
  }

  val assignment = new Assignments

  behavior of "nth Prime"
  it should "1000th prime Match 7919" in {
    assert(assignment.nthPrime(1000)==7919)
  }
  it should("1st prime match 2") in{
    assert(assignment.nthPrime(1)==2)
  }

  behavior of "nth Highest element"
  it should("3rd highest equals 9") in{
    assert(assignment.nthHighest(3,List(1,3,5,8,7,4,4,1,5,8,9,5,5,1,5,5,225,8,4,5,5444,4))==9)
  }
}