package example.iterator

object ClientApp extends App {
  val agg = new AggregatorImp[Int]
  agg.insert(1)
  agg.insert(2)
  agg.insert(3)
  agg.insert(4)
  agg.insert(5)

  val iterator: Iterator[Int] = new IteratorImp[Int](agg)
  while(iterator.hasNext) println(iterator.next)

}
