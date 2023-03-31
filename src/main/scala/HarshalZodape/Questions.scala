package HarshalZodape

class Questions {
  def split_list(lst: List[Int], split_index: Int) : Tuple2[List[Int], List[Int]] = {
    lst.splitAt(split_index) ;
  }
}
