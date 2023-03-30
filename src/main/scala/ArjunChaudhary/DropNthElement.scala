package ArjunChaudhary

//Drop every nth element from list
object DropNthElement{

  def dropNthElement[A](list: List[A],n:Int,i:Int=1):List[A]= list match {
    case Nil=>Nil
    case x=> if(i==n) dropNthElement(x.tail,n,1) else x.head :: dropNthElement(x.tail,n,i+1)

  }


}
