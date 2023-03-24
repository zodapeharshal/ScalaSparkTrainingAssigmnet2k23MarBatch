package Mehul

object Assignment1 {
  def main(args:Array[String]){

    val array=Array[Int](1,4 ,7,9,16,25,36,49)
    val count = array.count(x => Math.sqrt(x)%1==0)
    print(count)
  }
}

