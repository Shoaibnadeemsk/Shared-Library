def call() {
    sh 'aws sts get-caller-identity'
}