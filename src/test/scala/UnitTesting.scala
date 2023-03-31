object UnitTesting
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import RitikKuril.Question2

class calculatorsuite extends AnyFunSuite{

  val calculator=new calculator

  test("4+5 is always equal to 9"){
    assert(calculator.add(4,5)==9)

  }
}

class calculatorFun extends AnyFunSpec{

  val calculator=new calculator

  describe("subtraction"){
    it("5 - 4 should be 1") {
      assert(calculator.sub(5, 4) == 1)
    }
  }
}


class testing extends AnyFunSpec{

  describe("Factorial check"){
    it("5 factorial is 120"){
      assert(Question2.factorial(5,1)==120)
    }
  }

}
class calculator {
  def add(a:Int,b:Int)= a+b
  def sub(a:Int,b:Int)= a-b

}
