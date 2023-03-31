package ArjunChaudharyTests

import ArjunChaudhary.SortList.sortList
import org.scalatest.funspec.AnyFunSpec

class TestWithFunSpec extends AnyFunSpec{
    describe("Test case for sort elements of list based on word length"){
      it ("should sort the list1"){
        val list1 =List("hi","hello","bye","last")
        val expectedList =List("hi", "bye", "last", "hello")
        assert(sortList(list1)==expectedList)
      }
    }
}
