package example.iterator

/**
 * Decouple the implementation of underlying collection from client
 * @tparam T
 */
trait Aggregator[T] {
  def createIterator: Iterator[T]
}
