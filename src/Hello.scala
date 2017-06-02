object test{
  def main(args: Array[String]): Unit = {
    println("Hello World")
    val firstArg = if (args.length > 0) args(0) else ""

    firstArg match {
      case "Salt" => println("pepper")
      case "chips" => println("scala")
      case _ => println("default")
    }




  }
}