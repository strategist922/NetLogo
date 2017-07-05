// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim

import org.nlogo.agent.{ Patch, Turtle }
import org.nlogo.core.Nobody
import org.nlogo.nvm.{ Context, Reporter }

class _patchse extends Reporter {


  override def report(context: Context) = report_1(context)

  def report_1(context: Context): AnyRef = {
    val patch = context.agent match {
      case patch: Patch => patch.getPatchSouthEast
      case turtle: Turtle => turtle.getPatchHere.getPatchSouthEast
      case _ => world.fastGetPatchAt(1, -1)
    }
    if (patch != null) patch else Nobody
  }
}
