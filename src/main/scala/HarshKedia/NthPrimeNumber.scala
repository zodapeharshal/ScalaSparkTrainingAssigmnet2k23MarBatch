package HarshKedia

object NthPrimeNumber{

  def nthPrime(n: Int): Int = {

  //throw an IllegalArgumentException if n <0
    require(n > 0, "n must be greater than zero")

    //using Sieve of Eratosthenes
    //reference- https://cp-algorithms.com/algebra/sieve-of-eratosthenes.html#find-primes-in-range
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num <= 3) true
      else if (num % 2 == 0 || num % 3 == 0) false
      else {
        var i = 5
        while (i * i <= num) {
          if (num % i == 0 || num % (i + 2) == 0) return false
          // increments by 6 instead of 2 to skip over multiples of 2 and 3
          // as all other primes are of the form 6k±1
          i += 6
        }
        true
      }
    }

    def findPrime(current: Int, count: Int): Int = {
      if (count == n) current
      else {
        val next = current + 1
        if (isPrime(next)) findPrime(next, count + 1)
        else findPrime(next, count)
      }
    }

    findPrime(2, 1)
  }
}
