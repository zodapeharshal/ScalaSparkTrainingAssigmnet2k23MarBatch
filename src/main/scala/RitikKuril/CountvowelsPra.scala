package RitikKuril

object CountvowelsPra {

  def helper( head:String,n:Int,total:Int):Int= {

    if(n==0)
      total
    else if (head(n-1)=='a' || head(n-1)=='e' || head(n-1)=='i' || head(n-1)=='o' || head(n-1)=='u'
      || head(n-1)=='A' || head(n-1)=='E' || head(n-1)=='I' || head(n-1)=='O' || head(n-1)=='U')
      helper(head,n-1,total+1)
    else
    helper(head,n-1,total)
  }

// Count number of vowels of english alphabet in each word of the list of string.
  def calculate(list:List[String],ans:scala.collection.mutable.Map[String,Int]):scala.collection.mutable.Map[String,Int]=list  match {
    case Nil =>ans
    case head::tail => calculate(tail,ans+= head -> helper(head,head.length,0))
  }


}
