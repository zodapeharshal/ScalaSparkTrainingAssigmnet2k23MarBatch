package SamruddhiSelukar
////import org.scalatest.FunSuite
import org.scalatest.flatspec.AnyFlatSpec

class DuplicateListTest extends AnyFlatSpec {
  private val duplicateList = new DuplicateList

//    behaviour of "Test for duplicate list"

    it should "duplicate each element of the list 3 times consecutively" in{
      val result = duplicateList.listDuplicationN(3, List('a', 'b', 'c'))
      assert(result == List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'))
    }

    it should "duplicate each element of the list 1 time consecutively" in {
      val result = duplicateList.listDuplicationN(1, List('a', 'b', 'c'))
      assert(result == List('a', 'b', 'c'))
    }
}
