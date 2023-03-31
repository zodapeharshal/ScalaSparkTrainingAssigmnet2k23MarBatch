package HarshalZodape
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

// Assignments
object Main extends  App {
    val x = new Questions
    /*************************************************************************************/

    // Question 1 : Pack consecutive duplicates of list elements into sublists
    //        println(x.packConsecutive(List(1,1,1,2,2,2,3,3,3,3,3,4,1,1)))
    /*************************************************************************************/

    //Question 2 : Find nth prime number from starting if 2 is the first prime number.
    //    println(x.nthPrime(10)) ;
    /*************************************************************************************/

    //Question 3: Find the nth highest element of the list.
    //    println(x.nthHighestElement(List(1,2,3,4,5),2))
    /*************************************************************************************/

    // Question 4 : check is sum of all the element in the list is divisible by X or not
    //    x.checkDivisibility(List(1,2,3,4,5),3);
    //    x.checkDivisibility_rec(List(1,2,3,4,5), 3, 0, 0);
    /*************************************************************************************/

    // Question 5 : Extract a given number of randomly selected elements from a list.
    //    println(x.randomSelect_rec(3,List('a','b','c','d','e','f', 'g', 'h', 'i', 'j')))
    /*************************************************************************************/

    // Question 6 : Count number of vowels of english alphabet in each word of the list of string.
    //        x.countVowel_rec(List("This", "sentence", "contains", "zero", "vowel"))
    /*************************************************************************************/

    // Question 7 : Arrange the element (words) in the list acc to the number of Character in a word.
    //    println(x.sortWordList(List("one", "to", "three")));
    /*************************************************************************************/

    // Question 8 : Duplicate the elements of a list a given number of times
    //    println(x.duplicateElements_rec(List(1,2,3),3))

    /*************************************************************************************/

    // Question 9 : Drop every Nth element from a list.
    //    println(x.droptNth_rec_solve(List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15), 3))

    /*************************************************************************************/

    /* Question 10 : Split a list into two parts.
    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) -> (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))*/
    //    println(x.split_list(List(1,2,3,4,5), 2));


    /****************************************COMPLETE*********************************************/
}

// Practice
//object Main extends App {
//
////  val x = new LastElement ;
////  println(x.getLastElement(0,List(1,2,3,4,5))) ;
//
////  val x = new InsertElement ;
////  println(x.solve_rec(List(1,2,3,4,5),1,10)) ;
////  val y = new Questions ;
////  println("Splited List", y.split_list(List(1,2,3,4,5), 2)) ;
////  val syncValue = 1
////  val asyncValue: Future[Int] = Future.failed(new Exception("Task completed Succefully")) ;
////
////  asyncValue.onComplete match {
////    case Success(value) =>
////    case
////  }
////
////  case class MyValueClass(a: Int)
////
////  val ad = asyncValue.map { integer =>
////    integer
////    MyValueClass(integer)
////
////  }.recoverWith{
//////    case exception: Exception => throw new Exception("New Exception yay!!")
////    case exception: Exception =>
////      println("logging")
////      Future.failed(exception)
////  }
//  // CHAPTER 2 : PRACTICE
////  var x = new chapter2
////  x.greet()
//
//  //Scala cookbook chapter 3
////  val a = Array("banana", "Apple", "Orange") ;
////  val fruits = for (f<-a) yield f.toUpperCase
////  fruits.foreach(println)
////  for (i <- 0 until a.length )
////    println(s"${i} is ${a(i)}")
////  for((fruit, idx) <- a.zipWithIndex)
////    println(s"$idx is $fruit")
////  for(i<- 0 to 1 if i < 1 ) print(a(i))
////  val names = Map("fname" -> "Robert", "lname" -> "Goren")
//
////  for ((k, v) <- names) println(s"key: $k, value: $v")
//
//  // generates the whole output
////  scalac -Xprint:parse Main.scala
//
//  // Chapter 4: PRACTICE
//
//
//}

