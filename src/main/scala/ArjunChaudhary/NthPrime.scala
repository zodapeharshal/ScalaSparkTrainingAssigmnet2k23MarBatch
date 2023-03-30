package ArjunChaudhary

object NthPrime {
  def isPrime(num:Int,i:Int):Boolean={
    if (num%2==0) false
    else if(num%i==0) false
    else if(i*i>num) true
    else isPrime(num,i+2)
  }
  def nPrime(currentNum:Int,count:Int):Int ={  //count is actually counting down
    if(isPrime(currentNum,3)){
      if (count == 1) {
        currentNum
      } else {
        nPrime(currentNum + 2, count - 1)
      }
    }
    else nPrime(currentNum+2,count)
  }

  def nthPrime(n:Int):Int={

    if(n==1) 2
    else if (n==2) 3
    else nPrime(5,n-2)

  }

}
