package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {
 val tasks = mutableStateListOf(
        Task(id = 1, title = "gokberk", isCompleted = false),
        Task(id = 2, title = "kuscu", isCompleted = true)
    )
    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
         val index = tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = tasks[index]
            tasks[index] = task.copy(isCompleted = !task.isCompleted)
        }
    }
}
