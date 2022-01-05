pipeline {

    agent any

    stages {
        stage('init'){
            steps {
                echo "Calling A.a()"
            }
        }
//        stage('Build') {
//            steps {
//                sh '''
//                    gradle wrapper --gradle-version 6.6.1
//                    ./gradlew build
//                '''

//            }
//        }
//        stage('Tests'){
//            steps{
//                println('Running Tests')
//                sh './gradlew test'
//            }
//        }
    }
}