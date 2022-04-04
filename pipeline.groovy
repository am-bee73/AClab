#!Groovy

pipeline {
    agent any
    stages {
        stage("Build jar") {
            steps {
                script {
                    sh "cd /c/Users/aiordan/Desktop/AC\n " +
                            "/c/Maven/bin/mvn.cmd clean compile install\n"
                }
            }
        }
        stage("Build image") {
            steps {
                script {
                    sh "cd /c/Users/aiordan/Desktop/AC\n " +
                            '"C:\\Users\\aiordan\\AppData\\Local\\Programs\\Rancher Desktop\\resources\\resources\\win32\\bin\\docker.exe"' +
                            " build -t spring-boot-app . -t localhost:5000/spring-boot-app\n"
                }
            }
        }
        stage("Push image") {
            steps {
                script {
                    sh "cd /c/Users/aiordan/Desktop/AC\n " +
                            '"C:\\Users\\aiordan\\AppData\\Local\\Programs\\Rancher Desktop\\resources\\resources\\win32\\bin\\docker.exe"' +
                            " push localhost:5000/spring-boot-app\n"
                }
            }
        }
    }
}