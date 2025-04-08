
object TestTypeFlags {
  def main(args: Array[String]): Unit = {
    println(TestTypeFlagsMacros.typeInfo[p1.Side].mkString("\n"))
    println()
    println(TestTypeFlagsMacros.typeInfo[p2.Side].mkString("\n"))
    
    p2.Side.BUY // the only difference between p1.Side and p2.Side is that `p2.Side.<entry>` gets referenced here
  }
}
