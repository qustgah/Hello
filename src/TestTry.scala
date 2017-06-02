import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

/**
  * Created by Administrator on 2017/6/2.
  */
class TestTry {

  try{
    val f = new FileReader("input.txt")
  }catch {
    case ex:FileNotFoundException =>
    case ex:IOException =>
  }finally {

  }

  def urlFor(path:String) =
    try{
      new URL(path)
    }catch {
      case e:MalformedURLException =>
        new URL("http://www.")
    }
}
