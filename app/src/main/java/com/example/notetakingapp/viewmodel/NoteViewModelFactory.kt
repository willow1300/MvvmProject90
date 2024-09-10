package com.example.notetakingapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notetakingapp.repository.NoteRepository

class NoteViewModelFactory(val app: Application,
                           private val repository: NoteRepository): ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(app, repository) as T

    }

}