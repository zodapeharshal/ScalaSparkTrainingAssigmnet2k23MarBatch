package KaranAgrawal

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class NthPrimeNumberTest extends AnyFlatSpec with Matchers{

  private val nthPrime = new NthPrimeNo

  behavior of "NthPrimeNo"

  it should "Nth Prime Number" in {
    val result = nthPrime.nthPrime(3,1,5)

    result shouldEqual 11
  }
}
