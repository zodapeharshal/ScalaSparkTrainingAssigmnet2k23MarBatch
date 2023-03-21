package RitikKuril

object  Packduplicatesublist{

  def helper(list:List[Any],ans:List[List[Any]]):List[List[Any]]= list match {
    case Nil=>
      print(ans)
      ans;
    case h::tail if(ans.isEmpty || ans.last.head!=h) => helper(tail,ans:::List(List(h)))
    case h::tail =>helper(tail,ans.init:::List(ans.last:::List(h)))
  }




}