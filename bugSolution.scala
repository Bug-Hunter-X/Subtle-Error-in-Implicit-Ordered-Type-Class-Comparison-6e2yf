```scala
class MyClass[T](val value: T) {
  def myMethod(other: T)(implicit ev: T => Ordered[T]): Boolean = {
    value > other
  }
}

val instance = new MyClass(10)
println(instance.myMethod(5)) //true
println(instance.myMethod(10))//false
println(instance.myMethod(15))//false
```