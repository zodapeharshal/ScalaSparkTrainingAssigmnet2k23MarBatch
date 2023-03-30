import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.propspec.AnyPropSpec
import org.scalatest.refspec.RefSpec
import org.scalatest.wordspec.AnyWordSpec

object ScalaTestingStyles

// Basic
class  CalculatorSuite extends  AnyFunSuite {
  val calc = new Calculator

  test("multiplication by zero should always be zero" ){
    assert( calc.multiply(123,0) == 0 )
    assert( calc.multiply(-123,0) == 0 )
    assert( calc.multiply(0,0) == 0 )
  }

  test ("dividing by zero should throw an math error") {
    assertThrows[ArithmeticException](calc.divide(123,0))
  }
}

// behaviour driven more specific : detailed ;
class CalculatorSpec extends  AnyFunSpec{
  val calc = new Calculator

  describe("multiplication"){

    // we can also do nested testing with describe
    // describe("some other test")

    // individual value provided by any fun spec
    it("should give back 0 if multiplying by zero "){
      assert(calc.multiply(123, 0) == 0)
      assert(calc.multiply(-123, 0) == 0)
      assert(calc.multiply(0, 0) == 0)
    }
  }

  describe("division"){
    it("It should throw an arithmetic error when dividing by zero") {
      assertThrows[ArithmeticException](calc.divide(123, 0))
    }
  }
}

class CalculatorWordSpec extends  AnyWordSpec {
  val calc = new Calculator
  "A calculator" should {
    "give back zero when multiplied by zero" in {
      assert(calc.multiply(123, 0) == 0)
      assert(calc.multiply(-123, 0) == 0)
      assert(calc.multiply(0, 0) == 0)
    }
  }
  "It should throw an arithmetic expression when divide by zero" in {
    assertThrows[ArithmeticException](calc.divide(123,0))
  }
}


// most flexible
class CalculatorFreeSpec extends  AnyFreeSpec {
  val calc = new Calculator
  "A calculator" - { // anything you want
    "give back zero when multiplied by zero" in {
      assert(calc.multiply(123, 0) == 0)
      assert(calc.multiply(-123, 0) == 0)
      assert(calc.multiply(0, 0) == 0)
    }
  }
  "It should throw an arithmetic expression when divide by zero" in {
    assertThrows[ArithmeticException](calc.divide(123, 0))
  }
}

// property-style checking

class CalculatorPropSpec extends  AnyPropSpec{
  val calc = new Calculator
  val multiplyByZeroExample = List((123,0),(-123,0),(0,0))

  property("Calculator multiply by 0 should be 0 "){
    assert(multiplyByZeroExample.forall{
      case(a, b) =>   calc.multiply(a,b) == 0
    })
  }

  property("divide by zero should throw an error"){
    assertThrows[ArithmeticException](calc.divide(123,0))
  }

}

class  CalculatorRefSpec extends  RefSpec {// based on reflection
    object `A calculator` {
      // test suite
      val calc = new Calculator
      def `multiply by 0 should be 0` : Unit = {
        assert(calc.multiply(123, 0) == 0)
        assert(calc.multiply(-123, 0) == 0)
        assert(calc.multiply(0, 0) == 0)
      }
      def `divide by zero should be 0`() : Unit = {
        assertThrows[ArithmeticException](calc.divide(123,0))
      }
    }
}



class Calculator{
  def add(a: Int, b: Int) = a  + b
  def subtract(a: Int, b: Int) = a - b
  def multiply(a: Int, b: Int) = a * b
  def divide(a: Int, b: Int) = a / b
}
