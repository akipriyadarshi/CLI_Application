object Implement extends App {
  var result=""
  //method to print all the flags and its working
  def getHelp():String={
    for((v,k)<-myMap)  result= result+"    "+v+" --->>>  "+k+"\n"
    result
  }
  //using Map data structure to map my flags to its values
  val myMap = Map("-a" -> "Armenia", "-b" -> "Bermuda", "-c" -> "Canada", "-d" -> "Denmark"
    , "-e" -> "Egypt", "-f" -> "France", "-g" -> "Germany", "-h" -> "Hungary", "-i" -> "India"
    , "-j" -> "Japan", "-k" -> "Kenya", "-l" -> "Laos", "-m" -> "Maldives", "-n" -> "Nepal", "-o" -> "Oman"
    , "-p" -> "Philippines", "-q" -> "Qatar", "-r" -> "Russia", "-s" -> "Spain", "-t" -> "Tanzania"
    , "-u" -> "Uzbekistan", "-v" -> "Vietnam", "-w" -> "NONE", "-x" -> "NONE", "-y" -> "Yemen", "-z" -> "Zimbabwe")


//this method helps to find correct message that should be printed after giving argument with flag
  def find(len:Int,args:Array[String]):String={
   
    len match {
      case 0 => "Please enter argument as your name"
      case 1 => if (args(0)(0) != '-') "HELLO " + args(0).toUpperCase() else "Please provide argument with flag"
      case 2 => if (args(0)(0) == '-') {
        if (myMap.contains(args(0))) "HELLO " + args(1).toUpperCase() + " " + Utility.get(myMap(args(0)), args(0))else if (args(0) == "--help") getHelp() else "please enter a valid flag : type <your-name>--help or type --help <your-name> for help"
      }
      else {
        if (myMap.contains(args(1))) "HELLO " + args(0).toUpperCase() + " " + Utility.get(myMap(args(1)), args(1)) else if (args(1) == "--help") getHelp() else "Please enter valid flag:  type <your-name>--help type --help <your-name> for help"

      }
      case _ => "Please do not provide more than 2 flags"
    }

  }


     
    print(find(args.length,args))
  


}
