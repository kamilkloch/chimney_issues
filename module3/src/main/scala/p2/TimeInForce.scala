package p2

import enumeratum.{Enum, EnumEntry}
import io.scalaland.chimney.Transformer
import io.scalaland.chimney.dsl.*

sealed trait TimeInForce extends EnumEntry

object TimeInForce extends Enum[TimeInForce] {
  override val values: IndexedSeq[TimeInForce] = findValues

  case object FILL_OR_KILL extends TimeInForce

  // Replacing `implicit val` with `given` breaks compilation:
  // Ambiguous given instances: both given instance transformerIntoToMsTimeInForce in object TimeInForce and method deriveAutomatic in trait TransformerAutoDerivedCompanionPlatform match type io.scalaland.chimney.Transformer.AutoDerived[p2.TimeInForce, To] of parameter transformer of method transformInto in package io.scalaland.chimney.dsl
  implicit val transformerIntoToMsTimeInForce: Transformer[TimeInForce, p1.TimeInForce] =
    Transformer.define[TimeInForce, p1.TimeInForce]
      .withSealedSubtypeUnmatched(_.matching[p1.TimeInForce.NULL_VAL.type])
      .buildTransformer
}
