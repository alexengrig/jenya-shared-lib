#!/usr/bin/env groovy

def call() {
    pipeline {
        agent {
            docker {
                image 'sdkman-gradle-java'
            }
        }
        environment {
            MESSAGE = 'Hello!'
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
