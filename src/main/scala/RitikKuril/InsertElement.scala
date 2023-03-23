package RitikKuril

object InsertElement {

  def insert(list:List[Int],n:Int,element:Int,counter:Int,ans:List[Int]):Any=list match {

    case Nil => ans
    case head::tail if(n==counter) => insert(list,n,element,counter+1,ans:::List(element))

    case _ =>insert(list.tail,n,element,counter+1,ans:::List(list.head))
  }
}
