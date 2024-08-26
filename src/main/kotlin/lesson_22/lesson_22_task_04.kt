package org.example.lesson_22

class ViewModel(val mainScreenState: String) {

    data class MainScreenState(
        val data: String?,
        val isLoading: Boolean = false,
    )

    fun loadData(state: MainScreenState): MainScreenState {
        return if (state.data == null)
            state.copy(data = null, isLoading = false)
        else if (!state.isLoading)
            state.copy(isLoading = true)
        else
            state.copy(isLoading = false)
    }
}
