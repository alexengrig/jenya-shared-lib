#!/usr/bin/env groovy

def call() {
    pipeline {
        agent any
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
