import scala.quoted.*

object TestTypeFlagsMacros {
  inline def typeInfo[T]: Seq[String] = ${ typeInfoImpl[T] }

  def typeInfoImpl[T](using Type[T], Quotes): Expr[Seq[String]] =
    import quotes.reflect.*
    val T = TypeRepr.of[T]
    Expr(Seq(T.show, T.typeSymbol.flags.show, T.typeSymbol.tree.show, T.typeSymbol.tree.toString))
}
