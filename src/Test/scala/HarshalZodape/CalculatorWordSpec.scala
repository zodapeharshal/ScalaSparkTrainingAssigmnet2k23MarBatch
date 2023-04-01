package HarshalZodape

import org.scalatest.wordspec.AnyWordSpec

class CalculatorWordSpec extends AnyWordSpec {
  val calc = new Calculator
  "A calculator" should {
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
