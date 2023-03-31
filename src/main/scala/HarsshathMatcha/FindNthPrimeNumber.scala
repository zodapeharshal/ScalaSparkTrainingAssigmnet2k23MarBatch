package HarsshathMatcha

import scala.annotation.tailrec

class FindNthPrimeNumber {
  def isPrime(n: Int, i: Int = 2): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % i == 0) false
    else if (i * i > n) true
    else {
      isPrime(n, i + 1)
    }
  }

  def nthPrimeNumber(N: Int): Int = {
    @tailrec
    def nthPrime(start: Int, count: Int, N: Int, Prime: Int): Int = {
      if (count == N && isPrime(start)) Prime
      else if (isPrime(start)) {
        nthPrime(start + 1, count + 1, N, Prime = start)
      }
      else nthPrime(start + 1, count, N, Prime)
    }

    nthPrime(2, 0, N, Int.MinValue)
  }

}
