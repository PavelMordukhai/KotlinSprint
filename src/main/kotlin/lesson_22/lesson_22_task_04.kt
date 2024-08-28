package org.example.lesson_22

class ViewModel {
    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    ) {
        fun loadData(state: MainScreenState): MainScreenState {
            return if (state.data == null)
                state.copy(data = null, isLoading = false)
            else if (!state.isLoading)
                state.copy(isLoading = true)
            else
                state.copy(isLoading = false)
        }
    }
}

fun main() {

    val state = ViewModel.MainScreenState()
    println(state)
    println(state.loadData(state))
    println()

    val state2 = ViewModel.MainScreenState(isLoading = true)
    println(state2)
    println(state2.loadData(state2))
    println()

    val state3 = ViewModel.MainScreenState("some data")
    println(state3)
    println(state3.loadData(state3))
    println()

    val state4 = ViewModel.MainScreenState("some data", true)
    println(state4)
    println(state4.loadData(state4))
}
