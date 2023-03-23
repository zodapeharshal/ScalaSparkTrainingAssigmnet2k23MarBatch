package RitikKuril
// nth highest Element
object NthhighestElement {

  def nthhighestelement(list:List[Int],n:Int):Int={

    list.sorted.reverse(n-1)
  }

}
