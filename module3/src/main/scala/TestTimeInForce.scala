import io.scalaland.chimney.dsl.*

object TestTimeInForce extends App {
  val t1: p2.TimeInForce = p2.TimeInForce.FILL_OR_KILL
  val t2: p1.TimeInForce = t1.transformInto
  println(t2) 
}
