package Mehul
//iport
object Assignment6_Q2 {
  // have taken from internet (to understand use of lazylist)
  def numberStream(n: Int):
  LazyList[Int] = LazyList.from(n)

  println(numberStream(10))

  // Defining Sieve of Eratosthenes
  def sieve_of_Eratosthenes(stream: LazyList[Int]):
  LazyList[Int] = stream.head #:: sieve_of_Eratosthenes(
    (stream.tail)
      filter (x => x % stream.head!= 0)
  )

  println(sieve_of_Eratosthenes(numberStream(10)))


  val no_of_primes = sieve_of_Eratosthenes(numberStream(2))


  println(no_of_primes)
  (no_of_primes take 7) foreach {
    println(_)
  }

 /*def main(args:Array[String]): Unit =
  {

  }/*
}
