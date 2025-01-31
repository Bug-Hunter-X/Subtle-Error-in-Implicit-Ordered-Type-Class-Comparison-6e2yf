# Subtle Error in Implicit Ordered Type Class Comparison

This repository demonstrates a common, yet subtle error in Scala when working with implicit `Ordered` type classes. The provided code snippet uses an implicit `Ordered` instance for comparison, but the comparison `value > value` will always result in `false`. The solution demonstrates the correct usage and a way to avoid this type of error.

## Bug Description
The code snippet includes a class `MyClass` with a method `myMethod` that utilizes an implicit `Ordered` instance for comparison. The comparison `value > value` within the method is incorrect because it always compares a value to itself resulting in `false` regardless of the value's magnitude.

## Solution
The solution provides a correct implementation using a meaningful comparison against another value.