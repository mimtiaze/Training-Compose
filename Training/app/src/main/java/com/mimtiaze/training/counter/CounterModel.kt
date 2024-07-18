package com.mimtiaze.training.counter

data class CounterData(var count: Int)

class CounterModel {
    private var _counter = CounterData(0)

    fun incrementCounter() = _counter.count++
    fun decrementCounter() = _counter.count--
    fun getCounterData(): CounterData = _counter
}