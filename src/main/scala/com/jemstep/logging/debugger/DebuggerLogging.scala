package com.jemstep.logging.debugger

import org.apache.log4j.Logger

class DebuggerLogging

object DebuggerLogging {

  /* Get actual class name to be printed on *//* Get actual class name to be printed on */
  private val logger: Logger = Logger.getLogger(classOf[DebuggerLogging].getName)

  @SuppressWarnings(Array("org.wartremover.warts.Null"))
  def dlogInformation(log: String): Unit = {
    logger.info(log)
  }

  @SuppressWarnings(Array("org.wartremover.warts.Null"))
  def dlogDebugging(log: String): Unit = {
    logger.debug(log)
  }

  @SuppressWarnings(Array("org.wartremover.warts.Null"))
  def dlogErrorMessage(log: String): Unit = {
    logger.error(log)
  }

}
