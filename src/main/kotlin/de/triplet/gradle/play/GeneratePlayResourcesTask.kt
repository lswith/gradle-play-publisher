package de.triplet.gradle.play

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

open class GeneratePlayResourcesTask : DefaultTask() {
    var outputFolder: File? = null

    @TaskAction
    fun generate() {
        inputs.files.files
                .filter(File::exists)
                .forEach { it.copyRecursively(outputFolder ?: return@forEach, true) }
    }
}
