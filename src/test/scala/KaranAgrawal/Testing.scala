package KaranAgrawal
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
class Testing extends AnyFlatSpec with Matchers {
private val nthHighest = new NthHighestElementsInList
private val countVowels = new CountVowels

  behavior of "Nth Highest Element in List"
  it should "match 5th Highest in (1,2,3,4,5,6,7,8,9) is 5" in {
    assert(nthHighest.nthHighestElement(List(1,2,3,4,5,6,7,8,9),5,1)==5)
  }

  behavior of "Count of Vowels in List"
  it should "count number of vowels in each element in list" in{
    assert(countVowels.countVowelsInList(List("hello","hi","great","sure","good","nice"),0,List())==List(2,1,2,2,2,2))
  }
}
