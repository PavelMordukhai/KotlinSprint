package org.example.lesson_22

class ViewModel(val mainScreenState: MainScreenState) {

    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    fun loadData(): MainScreenState {
        return if (mainScreenState.data == null)
            mainScreenState.copy(data = null, isLoading = false)
        else if (!mainScreenState.isLoading)
            mainScreenState.copy(isLoading = true)
        else
            mainScreenState.copy(isLoading = false)
    }
}
