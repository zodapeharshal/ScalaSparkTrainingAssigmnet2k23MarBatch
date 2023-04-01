package HarsshathMatcha

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class NthPrimeNumberTest extends AnyFlatSpec with Matchers{

  private val nthPrime = new FindNthPrimeNumber
  behavior of "NthPrimeNumber"
  it should " return the nth prime" in {
    val result = nthPrime.nthPrimeNumber(10)
    result shouldEqual 29

    }
  val splitList = new SplitListElements
  behavior of "SplitListElements"
  it should " return split elements in list" in {
    assert(splitList.splitList(5, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) == (List('a', 'b', 'c', 'd', 'e'), List('f', 'g', 'h', 'i', 'j', 'k')))
  }

  val isdivisible = new IsDivisibleByX
  behavior of "IsDivisibleByX"
  it should "return Is elements divisible by X" in {
    assert(isdivisible.isDivisibleElements(List(1, 6, 8, 4, 5, 9, 2), 7))







  }

}

