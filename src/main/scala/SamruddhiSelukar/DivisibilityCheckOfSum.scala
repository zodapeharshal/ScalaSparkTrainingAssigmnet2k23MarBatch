package SamruddhiSelukar

class DivisibilityCheckOfSum {
  def checkDivOfSum(x: Int, list: List[Int]): Boolean = {
    val sumOfEle = list.sum
    sumOfEle % x == 0
  }
}
