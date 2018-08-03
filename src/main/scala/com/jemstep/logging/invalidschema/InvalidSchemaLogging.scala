package com.jemstep.logging.invalidschema

import org.apache.log4j.Logger

class InvalidSchemaLogging

object InvalidSchemaLogging {

  /* Get actual class name to be printed on *//* Get actual class name to be printed on */
  private val logger: Logger = Logger.getLogger(classOf[InvalidSchemaLogging].getName)

  @SuppressWarnings(Array("org.wartremover.warts.Null"))
  def islogInformation(log: String): Unit = {
    logger.info(log)
  }

  @SuppressWarnings(Array("org.wartremover.warts.Null"))
  def islogDebugging(log: String): Unit = {
    logger.debug(log)
  }

  @SuppressWarnings(Array("org.wartremover.warts.Null"))
  def islogErrorMessage(log: String): Unit = {
    logger.error(log)
  }

}
