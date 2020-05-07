package example.factory.abstractfactory.dbexample

import example.factory.abstractfactory.dbexample.model.{IDepartment, IUser}

class MySqlFactory extends IFactory {
  override def createDepartment: IDepartment = new MySqlDepartment
  override def createUser: IUser = new MySqlUser
}
