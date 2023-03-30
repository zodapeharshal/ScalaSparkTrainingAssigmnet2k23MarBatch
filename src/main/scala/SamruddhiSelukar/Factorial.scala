package SamruddhiSelukar

class Factorial {
def factorial(n: Int): Int = { // Int in the brackets is the type of the parameter and the Int before the function starts is the return type
  var result = 1 // result here is 1 because when you multiply anything with 1 is the number itself
  for (i <- 1 to n) {
    result *= i
  }// here we used a for loop which take non-zero +ve integers till n and multiplies it with the result - the result gets updated each time
  result // the result is returned
} // this code works for any non-negative integers
}
