package is.hail.expr.types.physical

import is.hail.annotations.CodeOrdering
import is.hail.expr.Nat
import is.hail.expr.ir.EmitMethodBuilder
import is.hail.expr.types.virtual.TNDArray

final case class PNDArray(elementType: PType, nDims: Int, override val required: Boolean = false) extends PType {
  lazy val virtualType: TNDArray = TNDArray(elementType.virtualType, Nat(nDims), required)

  def _toPretty = s"NDArray[$elementType,$nDims]"

  def codeOrdering(mb: EmitMethodBuilder, other: PType): CodeOrdering = throw new UnsupportedOperationException
}
