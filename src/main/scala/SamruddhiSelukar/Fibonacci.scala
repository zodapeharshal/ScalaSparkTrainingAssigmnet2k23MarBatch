package SamruddhiSelukar

class Fibonacci {
  def fibonacci(n: Int): List[Int] = { //here n is the number of fibonacci numbers to be generated - List[Int] is returning the list of integers(fibonacci series)
    var a = 0 //initializing a and b to 0 and 1 resp.
    var b = 1
    var result = List(a) //Initializing a list-result with one element 'a' and appending the value of fibonacci numbers while looping
    for (i <- 1 to n) {
      val sum = a + b
      result = result :+ b // :+ operator appends the ele to the end of the list - thus we are appending the current value of b at the end of the list
      a = b // later updating the value of a and b to the previous fibonacci numbers and continue looping
      b = sum
    }
    result
  }
}
