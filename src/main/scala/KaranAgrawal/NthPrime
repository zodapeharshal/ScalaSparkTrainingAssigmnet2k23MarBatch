package KaranAgrawal

object NthPrime extends App {
  val input=11
  def nthPrime(n:Int,count:Int,input:Int): Int = {
    if(count==input){
      n
    }
    else{
      if(isPrime(n,2)==true){
        if(count+1==input){
          n
        }
        else{
          nthPrime(n+1,count+1,input)
        }
      }
      else{
        nthPrime(n+1,count,input)
      }
    }
  }
 def isPrime(n:Int,i:Int):Boolean= {
  if(n%i==0){
    false
  }
  else if(i*i>n){
    true
  }
   else{
    isPrime(n,i+1)
  }
  }
if(input==1){
  println(2)
}
  else{
   println(nthPrime(3,1,input))
}

}
