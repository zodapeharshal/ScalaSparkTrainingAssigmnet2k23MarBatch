package SamruddhiSelukar

class SevenKingdomsProb {
  //USING var
//  def squareRoot(a: Array[Int]): Int = {
//    var count = 0
//    for (i <- a) {
//      val squareNum = math.sqrt(i).toInt //function to calculate square root of i
//      if(squareNum * squareNum == i) {
//        count = count + 1 //if the double of square root is equal to i then count is incremented
//      }
//    }
//    count // and after looping we return count
//  }

  //WITHOUT USING var
  def squareRoot(a: Array[Int]): Int = {
    a.foldLeft(0)((count, i) => {  // foldLeft function takes the left value of the parameters as an accumulator that can be updated and returned at the last and the right parameter is the lambda function
      val sqrtNum = math.sqrt(i).toInt //the second value taken is the elements in the array
      if (sqrtNum * sqrtNum == i) {
        count + 1
      } else {
        count
      }
    })
  }
}
