package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        val dtoList = api.getTasks()

        return dtoList.map {
            Task(
                id = it.id,
                title = it.title,
                isCompleted = it.completed
            )
        }
    }
}
