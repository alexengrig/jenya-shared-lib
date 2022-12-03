#!/usr/bin/env groovy

def call() {
    pipeline {
        agent {
            docker {
                image 'alexengrig/sdkman-gradle-java:snapshot'
            }
        }
        environment {
            MESSAGE = 'Hello, SDKMAN!'
        }
        stages {
            stage('Stage') {
                steps {
                    echo "${MESSAGE}"
                }
            }
        }
    }
}
