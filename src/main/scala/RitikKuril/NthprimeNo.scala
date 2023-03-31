package RitikKuril
//Get the nth prime no
object NthprimeNo {

  def nthPrime(n: Int): Int = {
    require(n > 0, "n must be a positive integer")

    def check(x: Int): Boolean = {
      if (x <= 1) false
      else if (x == 2) true
      else !(2 to (x - 1)).exists(i => x % i == 0)
    }

    def loop(i: Int, count: Int): Int = {
      if (count == n) i - 1 // return the last prime number found
      else loop(i + 1, if (check(i)) count + 1 else count)
    }

    loop(2, 0) // start from 2 and count the number of primes found
  }
}
