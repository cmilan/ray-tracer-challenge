package org.bbstilson.raytracer.models

import org.bbstilson.raytracer.UnitSpec

class ScaleMatrixSpec extends UnitSpec {
  behavior of "ScaleMatrix"

  it should "scale a point" in {
    val transform = ScaleMatrix(2, 3, 4)
    val p = Point(-4, 6, 8)
    transform * p should be(Point(-8, 18, 32))
  }

  it should "scale a scene vector" in {
    val transform = ScaleMatrix(2, 3, 4)
    val v = SceneVector(-4, 6, 8)
    transform * v should be(SceneVector(-8, 18, 32))
  }

  it should "revert via its inverse" in {
    val transform = ScaleMatrix(2, 3, 4)
    val inv = transform.inverse
    val v = SceneVector(-4, 6, 8)
    inv * v should be(SceneVector(-2, 2, 2))
  }

  it should "reflect" in {
    val transform = ScaleMatrix(-1, 1, 1)
    val p = Point(2, 3, 4)
    transform * p should be(Point(-2, 3, 4))
  }
}
