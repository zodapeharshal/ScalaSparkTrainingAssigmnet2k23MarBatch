package HarshalZodape

import org.scalatest.funsuite.AnyFunSuite

// Basic
class CalculatorSuite extends AnyFunSuite {
  val calc = new Calculator

  test("multiplication by zero should always be zero") {
    assert(calc.multiply(123, 0) == 0)
    assert(calc.multiply(-123, 0) == 0)
    assert(calc.multiply(0, 0) == 0)
  }

  test("dividing by zero should throw an math error") {
    assertThrows[ArithmeticException](calc.divide(123, 0))
  }
}
