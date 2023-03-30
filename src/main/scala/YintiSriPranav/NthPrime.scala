package YintiSriPranav

object NthPrime extends App{
  def nthPrime(n: Int): Int = {
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num == 2) true
      else !(2 to (num - 1 )).exists(x => num % x == 0)
      }

      def findNthPrime(current: Int, count: Int, Output: Int):  Int = {
        if (count == n && isPrime(current))current
        else if (isPrime(current)) findNthPrime(current + 1, count + 1, Output = current)
        else findNthPrime(current + 1, count, Output)
      }

      findNthPrime(3, 2, Output = n)
    }

  val n = 10
  val nthPrimeNumber = nthPrime(n)
  println(s"The $n-th prime number is $nthPrimeNumber")

}
