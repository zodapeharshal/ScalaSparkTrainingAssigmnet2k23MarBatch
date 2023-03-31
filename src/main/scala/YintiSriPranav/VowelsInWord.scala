package YintiSriPranav

object VowelsInWord {
  final val VOWELS: String = "aeiou"

  def vowelsInAWord(s: String, count: Int = 0): Int = {
    if (s.length == 0) {
      count
    }
    else {
      if (VOWELS.contains(s.charAt(0))) {
        vowelsInAWord(s.substring(1), count + 1)
      }
      else {
        vowelsInAWord(s.substring(1), count)
      }
    }
  }


}
