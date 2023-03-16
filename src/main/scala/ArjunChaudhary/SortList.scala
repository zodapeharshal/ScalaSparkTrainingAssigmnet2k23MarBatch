package ArjunChaudhary
//question
// Arrange the element (words) in the list acc to the number of Character in a word.
object SortList extends App {
//  val lis = List("hi","hello","bye","last")
  def Sortlist(list: List[String]):List[String]= {
    val len = list.map(_.length)        //creating a list with length of words in original list
    val maplen = (len zip list).toMap   //mapping the length of words with the words

    def insertionSort(list: List[Int]): List[Int] = {
      def insert(element: Int, sortedList: List[Int]): List[Int] = {
        //if sorted list is empty or element is shortest then element is appended in front of list
        if (sortedList.isEmpty || element <= sortedList.head) element :: sortedList
        //else check for insertion place in tail
        else sortedList.head :: insert(element, sortedList.tail)
      }
      //if list is empty or has one element it is already sorted
      if (list.isEmpty || list.tail.isEmpty) list
      //sort the tail then insert head
      else insert(list.head, insertionSort(list.tail))
    }

    val lenSorted = insertionSort(len)
    // now that list with length of words is sorted, replace length with words
    val res = lenSorted.map(maplen(_))
    res
  }
  val l = Sortlist(List("hi","hello","bye","last"))

//  val l = list.sortWith(_.length < _.length)

  println(l)


}
