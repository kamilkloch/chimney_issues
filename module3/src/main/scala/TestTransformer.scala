import io.scalaland.chimney.dsl.*

object TestTransformer {

  def main(args: Array[String]): Unit = {
    val s1: p1.Side = p1.Side.BUY
    println(s1.transformInto[p2.Side])
  }
}