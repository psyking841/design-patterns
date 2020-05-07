package example.factory.abstractfactory.dbexample.model

trait IDepartment {
  def insert(department: Department): Unit

  def getDepartment: Department
}
