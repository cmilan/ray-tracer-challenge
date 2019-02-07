package org.bbstilson.raytracer.models

import MatrixDouble._

class ScaleMatrix(m: Matrix) extends MatrixDouble(m)

object ScaleMatrix {
  def apply(x: Int, y: Int, z: Int): ScaleMatrix = {
    val vals = Vector(x, y, z, 1)
    val m = mkMatrix(4, 4, (r, c) => if (r == c) vals(r) else 0d)
    new ScaleMatrix(m)
  }
}
