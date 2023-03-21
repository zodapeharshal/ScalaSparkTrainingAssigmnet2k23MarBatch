package HarshKedia

object Question5 extends App {
  def duplicate[T](lst: List[T]): List[List[T]] = lst match {
    case Nil => Nil
    case head :: tail => {
      val (group, remaining) = allConsecutiveEqual(head, tail)
      group :: duplicate(remaining)
    }
  }
  def allConsecutiveEqual[T](x: T, lst: List[T]): (List[T], List[T]) = {
    def loop(xs: List[T], taken: List[T]): (List[T], List[T]) = xs match {
      case head :: tail if head == x => loop(tail, head :: taken)
      case _ => (taken.reverse, xs)
    }
    loop(lst, List(x))
  }
}