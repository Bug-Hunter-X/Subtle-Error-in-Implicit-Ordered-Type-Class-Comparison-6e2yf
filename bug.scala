```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Ordered[T]): Boolean = {
    if (value > value) {
      true
    } else {
      false
    }
  }
}

val instance = new MyClass(10)
println(instance.myMethod)
```