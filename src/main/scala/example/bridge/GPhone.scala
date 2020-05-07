package example.bridge

class GPhone(apps: PhoneApp*) extends PhoneBrand {
  override val phoneApps: Seq[PhoneApp] = apps
}
