### 6. Creating Your First Jenkins Job

#### Creating a Freestyle Job

1. **Create a New Job**: From the Jenkins dashboard, click “New Item”. Enter a name for your job and select “Freestyle project”. Click “OK”.

2. **Configure Source Code Management**: Under the “Source Code Management” section, select “Git”. Enter the repository URL and credentials if required.

```sh
Repository URL: https://github.com/your-repo/your-project.git
```

3. **Build Triggers**: Configure how the job should be triggered. For example, you can trigger the job to run periodically, or when changes are pushed to the repository.

4. **Build Environment**: Configure the build environment settings if needed.

5. **Build Steps**: Add build steps to define the tasks the job should perform. For example, to build a Maven project, add a “Invoke top-level Maven targets” build step.

```sh
Goals: clean install
```

6. **Post-build Actions**: Configure post-build actions such as sending notifications or archiving artifacts.

7. **Save and Build**: Click “Save” to save the job configuration. To run the job, click “Build Now”.

### 7. Jenkins Pipelines

Jenkins pipelines are used to define the steps involved in building, testing, and deploying applications. Pipelines can be defined using a domain-specific language (DSL) based on Groovy.

#### Creating a Simple Pipeline

1. **Create a New Pipeline Job**: From the Jenkins dashboard, click “New Item”. Enter a name for your job and select “Pipeline”. Click “OK”.

2. **Pipeline Definition**: In the “Pipeline” section, define your pipeline using the Pipeline DSL.

```groovy
pipeline {
agent any
stages {
stage(‘Build’) {
steps {
echo ‘Building…’
}
}
stage(‘Test’) {
steps {
echo ‘Testing…’
}
}
stage(‘Deploy’) {
steps {
echo ‘Deploying…’
}
}
}
}
```

3. **Save and Build**: Click “Save” to save the pipeline configuration. To run the pipeline, click “

Build Now”.
