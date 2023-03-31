package HarshalZodape

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.util.Random

class Questions {
  // Question 1 : Pack consecutive duplicates of list elements into sublists
  def packConsecutive_rec(list: List[Int]): List[List[Int]] = {

    @tailrec
    def solve(lst: List[Int], res : List[List[Int]] = Nil) : List[List[Int]] = lst match {
      case  Nil => res
      case head::tail => val (l, r) = lst.span(_==head)
           solve(r, res :+ l )
    }
    solve(list)
  }

  // This is doubt
//  def packConsecutive(list: List[Int]): List[List[Int]] =
//  list.foldRight(List[List[Int]]()) {
//    (e, l) =>
//      l match {
//        case (`e` :: xs) :: fs => (e :: e :: xs) :: fs
//        case _ => List(e) :: l
//      }
//  }

  def packConsecutive(list: List[Int]): List[List[Int]] = {
    val res = ListBuffer[List[Int]]() ;
    val tempres = ListBuffer[Int]()
    for (x <- list) {
      if(tempres.contains(x) || tempres.length == 0){
        tempres += x
      }else{
        res += tempres.toList
        tempres.clear()
        tempres += x

      }
    }

    if(tempres.nonEmpty)
      res += tempres.toList
    res.toList
  }

  // Question 2 : Find nth prime number from starting if 2 is the first prime number.
  def nthPrime_rec(n: Int): Int = {
    def isPrime(x: Int) = !(2 to Math.sqrt(x).toInt).exists(x % _ == 0)
    @tailrec
    def solve(num: Int, i: Int, res: Int) : Int = {
      if(i == n) {return res ;}
      if(isPrime(num))
        solve(num + 1, i+1, num)
      else
        solve(num + 1, i, res)
    }
    solve(3, 1, 2)
  }
  def nthPrime(n: Int):Int = {
    def isPrime(x: Int) = (2 to Math.sqrt(x).toInt).forall(x % _ != 0)
    return LazyList.from(2).filter(isPrime).drop(n-1).headOption.getOrElse(-1) ;
  }

  // Question 3 : Find the nth highest element of the list.
  def nthHighestElement(lst:List[Int], n:Int):Int={
    val x = lst.sorted ;
    return x(lst.length - n) ;

  }
  // Question 4 : check is sum of all the element in the list is divisible by X or not
  def checkDivisibility_rec(lst:List[Int], x:Int, idx:Int =0, acc:Int):Unit = {
    if(idx == lst.length){
      if(acc % x == 0) {
        println("Sum is divisible") ;
        return ;
      }else{
        println("Sum is not divisible") ;
        return ;
      }
    }
    checkDivisibility_rec(lst, x, idx + 1, acc + lst(idx))
  }
  def checkDivisibility(lst:List[Int], x:Int): Unit = {
    if(lst.sum % x == 0){
      println("Sum is divisible") ;
    }else{
      println("Sum is not divisible") ;
    }
  }

  // Question 5 : Extract a given number of randomly selected elements from a list.
  def randomSelect_rec(n:Int, lst:List[Char]) : List[Char] = {
    val lb = new ListBuffer[Char]()
    val rnd = new Random()
    def solve(n:Int):Unit = {
      if(n==0) {
        return;
      }
      lb += lst(rnd.nextInt(lst.length-1))
      solve(n-1)
    }
    solve(n)
    return lb.toList
  }
  def randomSelect(n:Int, lst:List[Char]): List[Char] = {
    val rnd = new Random() ;
    val lb = ListBuffer[Char]()
    for(i <- 0 to n-1){
      lb += lst(rnd.nextInt(lst.length-1))
    }
    return lb.toList
  }
  // Question 6 : Count number of vowels of english alphabet in each word of the list of string.
  val vowels = Set('a', 'e', 'i', 'o', 'u')

  def countVowel_rec(lst: List[String], idx:Int = 0): Unit = {
    if(idx== lst.length) {
      return;
    }
    val ones  = for(ch <- lst(idx) if vowels.contains(ch)) yield 1
    println(s"${lst(idx)} => ${ones.sum}")
    countVowel_rec(lst, idx+1)
  }
  def countVowel(lst: List[String]) : Unit = {
    lst.map(word => { val cnt = word.count(w => vowels.contains(w)); println(s"$word => $cnt") })
  }

  // Question 7 : Arrange the element (words) in the list acc to the number of Character in a word.
  def sortWordList(lst: List[String]) : List[String] = {
     return lst.sortBy(_.length)
  }

  // Question 8 : Duplicate the elements of a list a given number of times
  def duplicateElements_rec(lst: List[Int], n: Int): List[Int] = {
    @tailrec
    def solve(lst: List[Int], n: Int, res: List[Int], idx: Int) : List[Int] = {
      if(idx == lst.length){
        return res ;
      }
      solve(lst, n, res.concat(List.fill(n)(lst(idx))), idx + 1)
    }
    solve(lst, n , Nil, 0)
  }
  def duplicateElements(lst: List[Int], n: Int): List[Int] = {
    lst.flatMap(x => List.fill(n)(x))
  }
  // Question 9 : Drop every Nth element from a list.
  def droptNth_rec_solve(lst: List[Int], n: Int) = {
    @tailrec
    def dropNth_rec(lst: List[Int], res: List[Int], idx: Int): List[Int] = (idx, lst) match {
      case (_, Nil) => res
      case (1, head :: tail) => dropNth_rec(tail, res, n)
      case (i, head :: tail) => dropNth_rec(tail, head :: res, i - 1)
    }
    dropNth_rec(lst, Nil, n).reverse
  }
  def dropNth(lst:List[Int], n : Int): List[Int] = {
    // returns a vector
    val x = for (i <- 0 to lst.length - 1 if ((i+1) % n != 0) ) yield lst(i)
    // converting toList
    return x.toList
  }

  /* Question 10 : Split a list into two parts.
      split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) -> (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))*/

  def split_at(lst: List[Int], lb: ListBuffer[Int], idx: Int): (List[Int], List[Int]) = {
    if (idx == 0) {
      return (lb.toList, lst);
    }
    lb += lst.head;
    split_at(lst.tail, lb, idx - 1)
  }
  def split_list_rec(lst: List[Int], split_index: Int) : (List[Int], List[Int]) = {
    val b = new ListBuffer[Int]
    split_at(lst, new ListBuffer[Int], split_index)
  }
  def split_list(lst: List[Int], split_index: Int) : Tuple2[List[Int], List[Int]] = {
    lst.splitAt(split_index) ;
  }
  // Question 11 : Insert an element at a given position into a list.
  def insert_element_solve_rec(lst: List[Int], idx: Int, value: Int): List[Int] = {
    val b = new ListBuffer[Int]
    val result = split_at(lst, b, idx);
    List.concat(result._1, List(value), result._2)
  }

  def insert_element_solve_scala(lst: List[Int], idx: Int, value: Int): List[Int] = {
    val result = lst.splitAt(idx)
    List.concat(result._1, List(value), result._2)
  }
}
