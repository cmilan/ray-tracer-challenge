package org.bbstilson.raytracer.models

import org.bbstilson.raytracer.matrix.MatrixDouble

case class Ray(origin: Point, direction: Vector3) {
  def position(t: Double): Point = origin + direction * t
  def transform(m: MatrixDouble): Ray = Ray(m * origin, m * direction)
}
