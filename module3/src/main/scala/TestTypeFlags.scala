
object TestTypeFlags {
  def main(args: Array[String]): Unit = {
    println(TestTypeFlagsMacros.typeInfo[p1.Side].mkString("\n"))
    // p1.Side
    // Flags.Enum | Flags.Final | Flags.JavaDefined
    // final class Side() extends java.lang.Enum[p1.Side]
    // TypeDef(Side, Template(DefDef(<init>,List(List()),TypeTree[TypeRef(ThisType(TypeRef(NoPrefix,module class p1)),class Side)],EmptyTree),List(TypeTree[AppliedType(TypeRef(ThisType(TypeRef(NoPrefix,module class lang)),class Enum),List(TypeRef(ThisType(TypeRef(NoPrefix,module class p1)),class Side)))]),ValDef(_,EmptyTree,EmptyTree),List()))


    println()
    println(TestTypeFlagsMacros.typeInfo[p2.Side].mkString("\n"))
    // p2.Side
    // Flags.Abstract | Flags.Enum | Flags.Final | Flags.JavaDefined | Flags.Sealed
    // @scala.annotation.internal.Child sealed final abstract class Side() extends java.lang.Enum[p2.Side]
    // TypeDef(Side, Template(DefDef(<init>,List(List()),TypeTree[TypeRef(ThisType(TypeRef(NoPrefix,module class p2)),class Side)],EmptyTree),List(TypeTree[AppliedType(TypeRef(ThisType(TypeRef(NoPrefix,module class lang)),class Enum),List(TypeRef(ThisType(TypeRef(NoPrefix,module class p2)),class Side)))]),ValDef(_,EmptyTree,EmptyTree),List()))

    
    p2.Side.BUY // the only difference between p1.Side and p2.Side is that `p2.Side.<entry>` gets referenced somewhere
  }
}
