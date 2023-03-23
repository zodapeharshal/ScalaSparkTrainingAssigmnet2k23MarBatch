package RitikKuril

object SplitArrray {

  /*def split(list:List[Int],n:Int):List[List[Int]]={
    val(x,y)=list.splitAt(n)   //using build in function
    val ans=List(x,y);
    ans
  }

   */

  def split(list:List[Int],n:Int,counter:Int,ans:List[List[Int]]):List[List[Int]] = list match {
    case Nil => ans
    case head::tail if(counter==n) => split(tail,n, counter+1, ans:::List(List(head)))

    case head::tail => split(tail,n,counter+1,ans.init:::List(ans.last:::List(head)))

  }
}
