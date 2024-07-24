package com.mimtiaze.training.counter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Counter(padding: PaddingValues) {
    val counterViewModel: CounterViewModel = viewModel()

    Column(
        modifier = Modifier.padding(padding),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = counterViewModel.count.value.toString())
        Button(onClick = { counterViewModel.increment() }) {
            Text(text = "Increment")
        }
    }

}