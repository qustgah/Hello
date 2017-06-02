import scala.App
import ChecksumAccumulator.calculate

/**
  * Created by Administrator on 2017/6/2.
  */
object TestApplication extends App{

  for (season <- List("fall","winter","spring"))
    println(season + ":" + calculate(season))

}
