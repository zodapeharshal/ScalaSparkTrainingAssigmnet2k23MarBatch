package KaranAgrawal
import scala.util.Random
object RandomlySelectedElements extends App{
val list=List(1,2,3,4,5,6,7,8,9)
  val n=3
  val random = new Random()
  //println(list(random.nextInt(list.length)))
  def randomlySelectedElements(list:List[Int],n:Int,randList:List[Int]):List[Int]={
    if(n==0){
      randList
    }
    else{
      randomlySelectedElements(list,n-1,randList.::(list(random.nextInt(list.length))))
    }
  }
  println(randomlySelectedElements(list,n,List()))
}
