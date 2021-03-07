object Implement extends App {
  var res=""
  def getHelp():String={
    for((v,k)<-myMap)  res= res+"    "+v+" --->>>  "+k+"\n"
    res
  }
  val myMap = Map("-a" -> "Armenia", "-b" -> "Bermuda", "-c" -> "Canada", "-d" -> "Denmark"
    , "-e" -> "Egypt", "-f" -> "France", "-g" -> "Germany", "-h" -> "Hungary", "-i" -> "India"
    , "-j" -> "Japan", "-k" -> "Kenya", "-l" -> "Laos", "-m" -> "Maldives", "-n" -> "Nepal", "-o" -> "Oman"
    , "-p" -> "Philippines", "-q" -> "Qatar", "-r" -> "Russia", "-s" -> "Spain", "-t" -> "Tanzania"
    , "-u" -> "Uzbekistan", "-v" -> "Vietnam", "-w" -> "NONE", "-x" -> "NONE", "-y" -> "Yemen", "-z" -> "Zimbabwe")



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
