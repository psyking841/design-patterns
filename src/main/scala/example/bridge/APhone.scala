package example.bridge

class APhone(apps: PhoneApp*) extends PhoneBrand {
  override val phoneApps: Seq[PhoneApp] = apps
}
