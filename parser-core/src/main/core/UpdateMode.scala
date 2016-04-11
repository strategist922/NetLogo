// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.core

sealed abstract class UpdateMode(val save: Int) extends Serializable

object UpdateMode {
  case object Continuous extends UpdateMode(0)
  case object TickBased extends UpdateMode(1)
  def load(mode: Int) = mode match {
    case 0 => Continuous
    case 1 => TickBased
  }
}

/**
 * Java can't (I don't think) access Scala inner objects without reflection, so we provide these
 * convenience vals for use from Java.
 */
object UpdateModeJ {
  import UpdateMode._
  val CONTINUOUS = Continuous
  val TICK_BASED = TickBased
}
