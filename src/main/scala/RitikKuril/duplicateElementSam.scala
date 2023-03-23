package RitikKuril

object DuplicateElementSam {
  def dup(list:List[Any],n:Int,counter:Int,ans:List[Any]):List[Any]= list match{

    case Nil => ans
    case head::tail if(counter==n) => dup(tail,n,1,ans :::List(head))
    case head::tail => dup(list,n,counter+1,ans:::List(head))
  }

}
