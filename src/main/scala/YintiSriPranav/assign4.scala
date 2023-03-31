package YintiSriPranav

object assign4 {
  final val vowels :String = "aeiou"
  def VowelsInAWord(s:String,count:Int =0): Int =
    {
      if(s.length==0)
        {
          count
        }
      else
        {
          if(vowels.contains(s.charAt(0)))
            {
              VowelsInAWord(s.substring(1),count+1)
            }
            else
            {
              VowelsInAWord(s.substring(1),count)
            }
        }
    }

}
