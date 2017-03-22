package de.triplet.gradle.play

import org.gradle.api.Project
import java.io.File

fun String.normalize() = replace(Regex("\\r\\n"), "\n").trim()

fun File.readAndTrim(project: Project, maxLength: Int, throwOnLengthLimit: Boolean): String {
    if (exists()) {
        val message = readText().normalize()

        if (message.length > maxLength) {
            if (throwOnLengthLimit) {
                val relativePath = toRelativeString(project.file(RESOURCES_OUTPUT_PATH))
                throw IllegalArgumentException("File '$relativePath' has reached the limit of $maxLength characters")
            }

            return message.substring(0, maxLength)
        }

        return message
    }

    return ""
}

fun File.firstLine(): String {
    if (exists()) {
        return bufferedReader().use { it.readLine() }
    }

    return ""
}

