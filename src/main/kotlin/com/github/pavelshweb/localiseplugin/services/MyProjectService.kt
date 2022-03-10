package com.github.pavelshweb.localiseplugin.services

import com.intellij.openapi.project.Project
import com.github.pavelshweb.localiseplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
