package SamruddhiSelukar
//import org.scalatest.FunSuite
import org.scalatest.flatspec.AnyFlatSpec

class TestDuplicateList extends AnyFlatSpec {
  private val duplicateList = new DuplicateList

  behaviour of "Test for duplicate list"

  it should "duplicate each element of the list 3 times consecutively" in{
    val result = duplicateList.listDuplicationN(3, List('a', 'b', 'c'))
    assert(result == List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'))
  }

  it should "duplicate each element of the list 1 time consecutively" in {
    val result = duplicateList.listDuplicationN(1, List('a', 'b', 'c'))
    assert(result == List('a', 'b', 'c'))
  }

  it should "duplicate each element of the list 0 time consecutively" in {
    val result = duplicateList.listDuplicationN(3, List('a', 'b', 'c'))
    assert(result == List.empty)
  }
//  test("DuplicateList.listDuplicationN should return an empty list when n is 0") {
//    assert(duplicateList.listDuplicationN(0, List('a', 'b', 'c')) == List.empty)
//  }
//
//  test("DuplicateList.listDuplicationN should return the original list when n is 1") {
//    assert(duplicateList.listDuplicationN(1, List('a', 'b', 'c')) == List('a', 'b', 'c'))
//  }
//
//  test("DuplicateList.listDuplicationN should duplicate each element of the list n times") {
//    assert(duplicateList.listDuplicationN(3, List('a', 'b', 'c')) == List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'))
//  }
}
