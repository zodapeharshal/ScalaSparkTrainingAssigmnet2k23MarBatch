package HarshalZodape

import org.scalatest.freespec.AnyFreeSpec

// most flexible
class CalculatorFreeSpec extends AnyFreeSpec {
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
