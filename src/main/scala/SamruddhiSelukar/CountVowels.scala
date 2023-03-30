package SamruddhiSelukar

class CountVowels {

  //RETURN LIST[Int]
//  def listOfVowels(s: String): List[Int] = {
//    val v = List('a', 'e', 'i', 'o', 'u')
//    s.filter(i => v.contains(i.toLower)).toList
//    list.map(_.filter(i => v.contains(i.toLower))).toList
//  }

  //RETURN LIST[String]
  def listOfVowels(list: List[String]): List[Int] = {
    val v = List('a','e','i','o','u')
    val newList = list.map(_.filter(i => v.contains(i.toLower)))
    newList.map(_.length)
  }
}

    //RETURN COUNT
//  def numOfVowels(s: String): Int = {
//    s.foldLeft(0)((count, alpha) => {
//      if(alpha == 'a'||alpha == 'e'||alpha=='i'||alpha=='o'||alpha=='u')
//        {
//          count + 1
//        }
//        else{
//        count
//      }
//    })

