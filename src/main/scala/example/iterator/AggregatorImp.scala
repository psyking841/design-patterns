package example.iterator

/**
 * The implementation of Aggregation produces an iterator
 * @param collection
 * @tparam T
 */
class AggregatorImp[T](private var collection: Seq[T] = Seq.empty[T]) extends Aggregator[T] {
  override def createIterator: Iterator[T] = new IteratorImp[T](this)

  def size: Int = collection.size

  def get(i: Int): T = collection(i)

  def insert(e: T): Unit = collection :+= e
}
