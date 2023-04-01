package HarshalZodape

import org.scalatest.funspec.AnyFunSpec

// behaviour driven more specific : detailed ;
class CalculatorSpec extends AnyFunSpec {
  val calc = new Calculator

  describe("multiplication") {

    // we can also do nested testing with describe
    // describe("some other test")

    // individual value provided by any fun spec
    it("should give back 0 if multiplying by zero ") {
      assert(calc.multiply(123, 0) == 0)
      assert(calc.multiply(-123, 0) == 0)
      assert(calc.multiply(0, 0) == 0)
    }
  }

  describe("division") {
    it("It should throw an arithmetic error when dividing by zero") {
      assertThrows[ArithmeticException](calc.divide(123, 0))
    }
  }
}
