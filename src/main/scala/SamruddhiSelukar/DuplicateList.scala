package SamruddhiSelukar

class DuplicateList {
  def listDuplicationN(n: Int, l: List[Char]): List[Char] = {
    l.flatMap(i => (List.fill(n)(i))) //fill can be used to duplicate any type of element any number of times
  }
}

