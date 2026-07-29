pipeline{
    agent any
    stages{
        stage('Build') {
            steps {
                echo 'Packaging Spring Boot application...'
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Clean Deployment') {
            steps {
                echo 'Stopping existing containers...'
                    sh 'docker compose down || true'
            }
        }

        stage('Deploy'){
            steps {
                echo 'Deploying the spring boot'
                    sh 'docker compose up --build -d'
            }
        }

    }
    post{
        success{
            mail(
                    to:"vamsitemp69@gmail.com",
                    subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body:"""
                    Hello,

                    Build Successfull
                    Job Name: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}

                    Build URL:
                    ${env.BUILD_URL}

                    Regards,
                    Jenkins
                    """
            )
        }
        failure{
            mail(
                    to:"vamsitemp69@gmail.com",
                    subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body:"""
                    Hello,

                    Build Failed
                    Job Name: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}

                    Build URL:
                    ${env.BUILD_URL}

                    Regards,
                    Jenkins
                    """

            )
        }
    }
}