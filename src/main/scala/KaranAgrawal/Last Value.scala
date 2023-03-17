import scala.annotation.tailrec
object Main extends App{
val list = List(1,2,3,4,5,6)

  def last(arr:List[Int]):Int={
     @tailrec def lastVal(arr:List[Int],i:Int):Int={
       if(i==arr.length-1){
         arr(i)
       }
       else{
         lastVal(arr,i+1)
       }
     }
    lastVal(arr,0)
  }
  println(last(list))
}
