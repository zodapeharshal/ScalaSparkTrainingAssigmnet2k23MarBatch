package HarshalZodape

import org.scalatest.propspec.AnyPropSpec

class CalculatorPropSpec extends AnyPropSpec {
  val calc = new Calculator
  val multiplyByZeroExample = List((123, 0), (-123, 0), (0, 0))

  property("Calculator multiply by 0 should be 0 ") {
    assert(multiplyByZeroExample.forall {
      case (a, b) => calc.multiply(a, b) == 0
    })
  }

  property("divide by zero should throw an error") {
    assertThrows[ArithmeticException](calc.divide(123, 0))
  }

}
