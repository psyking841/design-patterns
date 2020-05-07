package example.factory.abstractfactory.dbexample

import example.factory.abstractfactory.dbexample.model.{IDepartment, IUser}

trait IFactory {
  def createUser: IUser

  def createDepartment: IDepartment
}
