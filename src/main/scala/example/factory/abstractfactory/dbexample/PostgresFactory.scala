package example.factory.abstractfactory.dbexample

import example.factory.abstractfactory.dbexample.model.{IDepartment, IUser}

class PostgresFactory extends IFactory {
  override def createDepartment: IDepartment = new PostgresDepartment
  override def createUser: IUser = new PostgresUser
}
