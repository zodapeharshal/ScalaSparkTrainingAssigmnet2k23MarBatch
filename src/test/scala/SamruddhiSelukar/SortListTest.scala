package SamruddhiSelukar
import org.scalatest.flatspec.AnyFlatSpec

class SortListTest extends AnyFlatSpec {
  private val sortListStr = new SortList

  //  behavior of "Test on Sort List"

    it should "Sort the list of string in ascending order of the number of characters in each string" in {
      val result = sortListStr.sortLessToMore(List("eat", "to", "fall", "dance"))
      assert(result == List("to", "eat", "fall", "dance"))
    }
}
