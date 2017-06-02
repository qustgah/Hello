import scala.io.Source

/**
  * Created by Administrator on 2017/6/2.
  */
class Func {

  def processFile(filename : String ,width : Int): Unit ={
    val source = Source.fromFile(filename)
    def processLine(filename:String ,width:Int,line:String): Unit ={
      if (line.length > width)
        println(filename + ": " + line.trim)
    }
    for (line <- source.getLines())
      processLine(filename,width,line)
  }

  private def processLine(filename:String ,width:Int,line:String): Unit ={
    if (line.length > width)
      println(filename + ": " + line.trim)
  }




}
