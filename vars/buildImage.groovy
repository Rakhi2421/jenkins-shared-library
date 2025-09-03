#!/usr/bin/env groovy

import com.example.Docker

def call(String imageName, String contextDir = ".") {
    return new Docker(this).buildDockerImage(imageName, contextDir)
}
