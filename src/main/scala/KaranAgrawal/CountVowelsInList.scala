package KaranAgrawal

object CountVowelsInList extends App {
val list=List("hello","hi","good","nice","great")
  def countVowels(str: String, i: Int,cnt:Int):Int={
    if(i>=str.length){
      cnt
    }
    else{
      if(str(i)=='a' || str(i)=='e' || str(i)=='i' || str(i)=='o' || str(i)=='u' || str(i)=='A' || str(i)=='E' || str(i)=='I' || str(i)=='O' || str(i)=='U'){
        countVowels(str,i+1,cnt+1)
      }
      else{
        countVowels(str,i+1,cnt)
      }
    }
  }
  def countVowelsInList(list:List[String],index:Int,countList:List[Int]):List[Int]={
    if(index>=list.length){
      countList
    }
    else{
      val x=countVowels(list(index),0,0)
      countVowelsInList(list,index+1,countList:+x)
    }
  }
  println(countVowelsInList(list,0,List()))
}
