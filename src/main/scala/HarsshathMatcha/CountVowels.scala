package HarsshathMatcha
import scala.annotation.tailrec

object CountVowels  {


    def countVowelElements(str:String,count:Int):Int={
      val vowels=Set('a','e','i','o','u','A','E','I','O','U')
      if(str.isEmpty) count
      else if(vowels.contains(str.head)) countVowelElements(str.tail,count+1)
      else countVowelElements(str.tail,count)

    }

  def countVowels(list: List[String]): List[Int] = {
    @tailrec
    def countVowelsEle(list:List[String],count:Int,list2:List[Int]):List[Int]={
      if(list.isEmpty) list2
      else
        {
          countVowelsEle(list.tail,count=count+countVowelElements(list.head,0),list2.appended(countVowelElements(list.head,0)))
        }
    }
    countVowelsEle(list,0,Nil)

  }
  //val list=List("Shiva","Harsshath","Karna","ViratKohli","PrabhuTeja")
  //println(countVowels(list))

}
