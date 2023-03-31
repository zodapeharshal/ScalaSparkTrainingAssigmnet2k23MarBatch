package YintiSriPranav
import YintiSriPranav.factorial.factorial
import YintiSriPranav.Fibonacci.fibonacci
import YintiSriPranav.lastelement.last
import YintiSriPranav.VowelsInWord.vowelsInAWord
object Main extends App {
  //println("Welcome to Scala")
  assert(factorial(5,1)==120,"wrong result")
  assert(fibonacci (10)==34, "wrong result")
  assert(last(List(1,2,3,4,5,6))==6)
  val list1= List("Yinti", "Sri", "Pranav")
  list1.map(x => println(vowelsInAWord(x)))

}
