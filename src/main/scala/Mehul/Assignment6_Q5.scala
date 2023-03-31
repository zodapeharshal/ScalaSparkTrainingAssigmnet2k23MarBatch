package Mehul
import scala.util.Random
object Assignment6_Q5 {

  // if n is equal t lekgth of string then print all elemnts
  // if nis greater then print or return as not possible
  // when n< length ho wto fetch these random elemnts
    def solve(list:List[Int],n:Int):List[Int]={
     // if(n>list.length)
      val random=new Random
      scala.util.Random.shuffle(list).take(n)
      //list(random.nextInt(list.length))
    }
    /*def main(args:Array[String]): Unit =
  {
    print(  solve(List(2,3,4,5,6,7,8,9,10),9))
  }*/

}
