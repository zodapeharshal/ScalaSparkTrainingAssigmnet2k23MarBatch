package ArjunChaudhary

import scala.annotation.tailrec

object Question4 {
  @tailrec
  def lastelement(list:List[Int]):Option[Int]={
    if(list.isEmpty) None
    else if(list.length==1) Some(list.head)
    else lastelement(list.tail)
  }

}
