package KaranAgrawal

object SumDivisibleByX extends App{
  val list=List(1,2,3,4,5,6)
  val x=3
def sumDivide(index:Int, sum:Int, x:Int, list:List[Int]):Boolean={
  if(index==list.length-1){
    if((sum)%x==0){
      true
    }
    else{
      false
    }
  }
  else{
    sumDivide(index+1,(sum+list(index+1))%x,x,list)
  }
}
  println(sumDivide(0,list(0),x,list))
}
