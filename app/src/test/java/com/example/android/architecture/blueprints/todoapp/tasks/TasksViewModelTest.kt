package com.example.android.architecture.blueprints.todoapp.tasks

import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.statistics.getActiveAndCompletedStats
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.Test

 class TasksViewModelTest{

     @Test
     fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
         // Create an active task
         val tasks = listOf<Task>(
             Task("title", "desc", isCompleted = false)
         )

         // Call your function
         val result = getActiveAndCompletedStats(tasks)

         // Check the result
         assertThat(result.activeTasksPercent, `is`(100f))
         assertThat(result.completedTasksPercent, `is`(0f))
     }
}