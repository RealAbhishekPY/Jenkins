### 8. Integrating Jenkins with Version Control Systems

#### Integrating with Git

1. **Install Git Plugin**: Ensure the Git plugin is installed.

2. **Configure Source Code Management**: When creating or configuring a job, select “Git” under the “Source Code Management” section. Enter the repository URL and credentials if required.

```sh
Repository URL: https://github.com/your-repo/your-project.git
```

3. **Specify Branches**: Specify the branches to build. For example, to build the master branch:

```sh
Branches to build: */master
```

#### Integrating with GitHub

1. **Install GitHub Plugin**: Ensure the GitHub plugin is installed.

2. **Configure GitHub Repository**: When creating or configuring a job, select “GitHub project” and enter the repository URL.

```sh
Project URL: https://github.com/your-repo/your-project
```

3. **Configure GitHub Hook**: Set up a GitHub webhook to trigger Jenkins jobs when changes are pushed to the repository. In your GitHub repository settings, add a webhook with the following URL:

```sh
Payload URL: http://your-jenkins-server/github-webhook/
```
