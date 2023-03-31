package HarshKedia

import org.scalatest.flatspec.AnyFlatSpec
import HarshKedia.SumDivisibleX.sumDivisibleByX
import HarshKedia.CountVowelsListString.countVowelsList
import NthPrimeNumber.nthPrime


class Tests extends AnyFlatSpec{

  behavior of "sumDivisibleByX method"

  it should "return true if the sum of elements in the list is divisible by 4" in {
    val list = List(1, 2, 4, 6, 2, 5)
    val divisor = 4
    assert(sumDivisibleByX(list, divisor) == true)
  }

  behavior of "countVowelsList method"

  it should "return a list with the count of vowels in each element of the input list" in {
    val inputList = List("apple", "banana", "orange")
    val expectedList = List(2, 3, 3)
    assert(countVowelsList(inputList)==expectedList)
  }

  behavior of "nthPrime method"

  it should "return the correct value for the 3rd prime number" in {
    val n = 3
    val expected = 5
    val result = nthPrime(n)
    assert(result == expected)
  }

}
