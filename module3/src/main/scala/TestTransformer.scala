import io.scalaland.chimney.dsl.*

object TestTransformer {

  def main(args: Array[String]): Unit = {
//    val s1: p1.Side = p1.Side.BUY
//    println(s1.into[p2.Side].enableMacrosLogging.transform)

    // transformation within the same module works fine
    val ss1: pp1.Side = pp1.Side.BUY
    println(ss1.into[pp2.Side].enableMacrosLogging.transform)
  }
}