package Pranav

import YintiSriPranav.{NewFactorial, NthHighestElement}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class UnitTesting extends AnyFlatSpec with Matchers {
  private val findNthHighestElement = new NthHighestElement
  behavior of "Nth Highest Element in List"
  it should "match 4th Highest in (1,2,3,4,5) is 4" in {
    assert(findNthHighestElement.findNthHighestElement(List(1, 2, 3, 4, 5), 4) == 2)
  }
  private val newfactorial = new NewFactorial
  behavior of "Factorial"
  it should "match 5! eqauls 120" in {
    assert(newfactorial.factorial(5,1)== 120)
  }

}



