package SamruddhiSelukar

class NthPrimeNum {
  def nthPrime(n: Int): Int = {
    if (n <= 0) throw new IllegalArgumentException("n should be greater than 0") // is a way for a method to signal that you passed an invalid argument.
    val primeCount = LazyList.from(2).filter(isPrime).take(n).toList
    primeCount.last
  }

  def isPrime(n: Int): Boolean = {
    if (n < 2) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      val limit = math.sqrt(n).toInt
      LazyList.from(3, 2).takeWhile(_ <= limit).forall(i => n % i != 0)
    } // takeWhile - Takes all the numbers in the LazyList until the limit is reached
  }
}
