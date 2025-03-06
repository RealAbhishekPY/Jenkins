### 1. Installing Jenkins

#### Prerequisites

Before installing Jenkins, ensure you have the following prerequisites:
- A machine with a supported operating system (Windows, Linux, macOS)
- Java Development Kit (JDK) installed (Jenkins requires Java 8 or Java 11)
- Internet connection to download Jenkins and necessary plugins

#### Installing Jenkins on Windows

1. **Download Jenkins**: Go to the [official Jenkins website](https://www.jenkins.io/download/) and download the Windows installer.

2. **Run the Installer**: Double-click the downloaded `.msi` file to start the installation process. Follow the on-screen instructions to complete the installation.

3. **Start Jenkins**: After installation, Jenkins should start automatically. You can also start it manually by running the Jenkins service from the Services panel.

4. **Access Jenkins**: Open your web browser and navigate to `http://localhost:8080`. You should see the Jenkins setup wizard.

#### Installing Jenkins on Linux

1. **Add Jenkins Repository**: Open a terminal and run the following commands to add the Jenkins repository:

```sh
wget -q -O — https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
sudo sh -c ‘echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list’
```

2. **Install Jenkins**: Update your package index and install Jenkins:

```sh
sudo apt-get update
sudo apt-get install jenkins
```

3. **Start Jenkins**: Start the Jenkins service:

```sh
sudo systemctl start jenkins
```

4. **Enable Jenkins**: Enable Jenkins to start at boot:

```sh
sudo systemctl enable jenkins
```

5. **Access Jenkins**: Open your web browser and navigate to `http://your_server_ip_or_domain:8080`.

#### Installing Jenkins on macOS

1. **Install Homebrew**: If you don’t have Homebrew installed, install it by running the following command in your terminal:

```sh
/bin/bash -c “$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

2. **Install Jenkins**: Use Homebrew to install Jenkins:

```sh
brew install jenkins-lts
```

3. **Start Jenkins**: Start Jenkins by running:

```sh
brew services start jenkins-lts
```

4. **Access Jenkins**: Open your web browser and navigate to `http://localhost:8080`.

### 2. Setting Up Jenkins

#### Initial Setup

When you first access Jenkins, you will be prompted to unlock Jenkins using an initial admin password. Follow these steps:

1. **Locate the Initial Admin Password**: The password is stored in a file on your system. The location of this file is displayed on the setup screen. On Linux, it is usually found at `/var/lib/jenkins/secrets/initialAdminPassword`.

2. **Enter the Password**: Copy the password from the file and paste it into the setup wizard to unlock Jenkins.

3. **Install Suggested Plugins**: Jenkins will prompt you to install plugins. Choose the “Install suggested plugins” option. This will install a set of commonly used plugins.

4. **Create First Admin User**: After installing the plugins, you will be prompted to create the first admin user. Fill in the details and click “Save and Finish”.

5. **Jenkins is Ready**: Click “Start using Jenkins” to complete the setup.
