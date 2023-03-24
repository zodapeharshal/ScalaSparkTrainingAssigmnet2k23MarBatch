import scala.annotation.tailrec
object Assignment3 {
  def fibanacci (n:Int) :Int ={
    @tailrec
    def helper(n:Int , a:Int ,b:Int):Int=
      if (n == 1)
        b;
      else if(n==0)
        a
      else {
        //print(a + " ");
        helper(n - 1, b, a + b)
        //print("fsdf" +b+"sa")
      }
      helper(n, 0, 1)


  }

  def main(args:Array[String]){
 print( fibanacci(3))

  }
}
