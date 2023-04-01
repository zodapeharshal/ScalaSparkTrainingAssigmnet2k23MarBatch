package HarshalZodape

import org.scalatest.refspec.RefSpec

class CalculatorRefSpec extends RefSpec { // based on reflection
  object `A calculator` {
    // test suite
    val calc = new Calculator

    def `multiply by 0 should be 0`: Unit = {
      assert(calc.multiply(123, 0) == 0)
      assert(calc.multiply(-123, 0) == 0)
      assert(calc.multiply(0, 0) == 0)
    }

    def `divide by zero should be 0`(): Unit = {
      assertThrows[ArithmeticException](calc.divide(123, 0))
    }
  }
}
