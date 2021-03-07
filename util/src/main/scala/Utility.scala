object Utility {
  def get(str: String, flag: String): String = {
    if (flag == "-x" || flag == "-w") {
      val result1: String = ", Sorry no country starting from letter " + flag(1)
      result1
    } else {
      val result2 = "from " + str + " which is a great country"
      result2
    }


  }

}
