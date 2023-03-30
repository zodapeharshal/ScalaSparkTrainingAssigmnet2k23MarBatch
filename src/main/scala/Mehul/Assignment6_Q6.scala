package Mehul

object Assignment6_Q6 {
  def Count_Vowel_in_Words(list:List[String]):List[Int]={
    val vowel=List('a','e','i','o','u','A','E','I','O','U')
    list.map(_.count(x=>vowel.contains(x)))
  }
/*def main(args:Array[String]): Unit =
  {
    val a= List("apple","banana","waAtermelon","pear")
    print(Count_Vowel_in_Words(a))
  }
}*/
