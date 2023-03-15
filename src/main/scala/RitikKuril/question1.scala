package RitikKuril
object Question1 {
  def Perfect(n:Int): Int = {


    val no = new Array[Int](n);

    println("Enter the array->");

    for (i <- 0 to n - 1) {
      val x = scala.io.StdIn.readInt();
      no(i) = x;
    }

    val count = no.count(x => Math.sqrt(x) % 1 == 0)
    println("total no of perfect sqaures are->")
    println(count);
    count;
  }
}