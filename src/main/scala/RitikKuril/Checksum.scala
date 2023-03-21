package RitikKuril

object Checksum {
  def total(list:List[Int],x:Int,sum:Int):Boolean= list match {
    case Nil => if(sum%x==0) true
                    else false
    case _ =>total(list.tail,x,sum+list.head)


  }



}
