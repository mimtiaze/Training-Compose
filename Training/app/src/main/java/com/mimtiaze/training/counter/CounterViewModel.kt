package com.mimtiaze.training.counter

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val TAG = "CounterViewModel"
    private var _repository: CounterModel = CounterModel()

    private var _count = mutableStateOf(_repository.getCounterData().count)
    val count: MutableState<Int> = _count

    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounterData().count
        Log.d(TAG, "Count: ${count.value}")
    }

    fun decrement() {
        _repository.decrementCounter()
    }
}