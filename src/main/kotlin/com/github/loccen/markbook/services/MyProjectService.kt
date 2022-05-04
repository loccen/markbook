package com.github.loccen.markbook.services

import com.intellij.openapi.project.Project
import com.github.loccen.markbook.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
