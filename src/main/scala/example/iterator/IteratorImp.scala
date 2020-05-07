package example.iterator

import java.io.EOFException

/**
 * Iterator operators on the aggregator
 * @param agg
 * @tparam T
 */
class IteratorImp[T](agg: AggregatorImp[T]) extends Iterator[T] {
  var position: Int = 0

  override def hasNext: Boolean = position < agg.size

  override def next: T = {
    if (hasNext) {
      val res = agg.get(position)
      position += 1
      res
    } else {
      throw new EOFException("End of iteration.")
    }
  }
}
