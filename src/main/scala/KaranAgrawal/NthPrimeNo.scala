package KaranAgrawal

class NthPrimeNo {
    //val input=9
    def nthPrime(n:Int,count:Int,input:Int): Int = {
      if(count==input){
        n
      }
      else{
        if(isPrime(n,3)==true){
          if(count+1==input){
            n
          }
          else{
            nthPrime(n+2,count+1,input)
          }
        }
        else{
          nthPrime(n+2,count,input)
        }
      }
    }
    def isPrime(n:Int,i:Int):Boolean= {
      if(i>n/2){
        true
      }
      else if (n % i == 0) {
        false
      }
      else{
        isPrime(n,i+2)
      }
    }
    //if(input==1){
    //  println(2)
    //}
    //  else{
    //   println(nthPrime(3,1,input))
    //}

  }

