package SamruddhiSelukar
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DivisibilityCheckOfSumTest extends AnyFlatSpec with Matchers {
    private val checkOfSum = new DivisibilityCheckOfSum

    behavior of "Test of checking divisibility"

    it should "a given number divide the sum of ele in list" in {
      val result = checkOfSum.checkDivOfSum(4, List(10,20,5,4,1))

      result shouldEqual true
    }
}
