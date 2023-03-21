package RitikKuril

object DropNelement{

 /* def drop(list:List[Int],n:Int):List[Int]={

  //  list.patch(n-1,Nil,1); (in build method)

   val(x,y)= list.splitAt(n-1);

   val ans=  x++y.tail;
    println(ans);
    ans;




  }

  */
  def drop(list:List[Int],n:Int,counter:Int,ans:List[Int]):Any= list match {

    case Nil =>  ans
    case h::tail if(counter==n) => drop(list.tail,n,counter+1,ans)
    case _ => drop(list.tail,n,counter+1,ans:::List(list.head))
  }


}
