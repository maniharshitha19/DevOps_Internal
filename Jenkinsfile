pipeline{
    agent any
    stages{
        stage('Compile'){
            steps{
                bat 'javac Factorial.java TestFactorial.java'
            }
        }
        stage('Test'){
            steps{
                bat 'java TestFactorial.java'
            }
        }
        stage('Run'){
            steps{
                bat 'java Factorial.java'
            }
        }
        stage('Package Jar'){
            steps{
                bat 'jar cvf Factorial.jar Manifest.txt Factorial.class TestFactorial.class'
            }
        }
        stage('Archive Jar'){
            steps{
                bat 'archive Artifacts artifacts: Factorial.jar'
            }

        }
    }
}