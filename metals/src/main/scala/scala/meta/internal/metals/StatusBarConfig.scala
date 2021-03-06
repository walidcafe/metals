package scala.meta.internal.metals

final case class StatusBarConfig(value: String) {
  def isOff: Boolean = value == "off"
  def isOn: Boolean = value == "on"
  def isLogMessage: Boolean = value == "log-message"
}

object StatusBarConfig {
  def off = new StatusBarConfig("off")
  def on = new StatusBarConfig("on")
  def logMessage = new StatusBarConfig("log-message")
  def default = new StatusBarConfig(
    System.getProperty("metals.status-bar", "off")
  )
}
