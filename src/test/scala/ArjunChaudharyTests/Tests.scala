package ArjunChaudharyTests

import ArjunChaudhary.NthLargest.nthLargest
import ArjunChaudhary.NthPrime.nthPrime
import ArjunChaudhary.SumDivX.sumDivisibleByX
import org.scalatest.flatspec.AnyFlatSpec

class Tests extends AnyFlatSpec{
  behavior of "Nth prime"

  it should "find 18th prime" in {
    assert(nthPrime(18) == 61)
  }
  it should "find 11th prime" in {
    assert(nthPrime(11) == 31)
  }


  behavior of "Nth largest"

  it should "find 3rd largest number in list" in {
    assert(nthLargest(List(1, 2, 4, 6, 2, 6, 3, 7), 3) == 4)
  }

  behavior of "Sum divisible by x"

  it should "find if sum is divisible by 3" in{
    assert(sumDivisibleByX(List(1,2,4,6,2,6,2,7),3)==true)
  }
}




