package com.example.parcialtp3_2.infraestructure.room

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class UserViewModel(private val repo: UserRepository) : ViewModel() {
    val users: StateFlow<List<UserEntity>> =
        repo.observeUsers().stateIn(viewModelScope, SharingStarted.Companion.Lazily, emptyList())

    fun refreshFromRemoteAndSave(fetcher: suspend () -> List<UserEntity>) {
        viewModelScope.launch {
            val fetched = try { fetcher() } catch (_: Exception) { emptyList() }
            if (fetched.isNotEmpty()) repo.persistUsers(fetched)
        }
    }
}