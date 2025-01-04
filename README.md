## Prerequisites  
1. **Integrated Development Environment (IDE):**  
   - [Eclipse IDE 2024-09](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2024-09/R/eclipse-inst-jre-win64.exe).  
2. **Java Development Kit (JDK):**  
   - Ensure JDK version 23 is installed.  
   - [Download JDK 23](https://jdk.java.net/23/).
3. **Git** (Version Control Tool)
   - Ensure Git is installed on your machine
   - [Git Download](https://git-scm.com/downloads )
3. **Dependencies:**  
   - The application uses the following libraries, which need to be downloaded and added manually to the build path:
     - [Jakarta XML Bind (4.0.2)](https://mvnrepository.com/artifact/jakarta.xml.bind/jakarta.xml.bind-api/4.0.2)  
     - [Jakarta Activation (2.1.3)](https://mvnrepository.com/artifact/jakarta.activation/jakarta.activation-api/2.1.3)  
     - [JAXB Runtime (4.0.5)](https://mvnrepository.com/artifact/org.glassfish.jaxb/jaxb-runtime/4.0.5)  
     - [JAXB Core (4.0.5)](https://mvnrepository.com/artifact/org.glassfish.jaxb/jaxb-core/4.0.5)  
     - [TXW2 Runtime (4.0.5)](https://mvnrepository.com/artifact/org.glassfish.jaxb/txw2/4.0.5)  
     - [Istack Common Utility Code Runtime (4.2.0)](https://mvnrepository.com/artifact/com.sun.istack/istack-commons-runtime/4.2.0)

## Environment Setup
1. **Clone the Repository**
   - [How to clone a repository](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository)
2. **Import the Project into Eclipse** *(To verify steps)*
   - Open Eclipse
   - Go to **File > Import > General > Existing Projects into Workspace** *(To Do - Push project related files into repo).*
   - Select the project directory and click **Finish**
3. **Add dependencies to Build Path
   - [How to import dependencies in Eclipse](https://www.quora.com/How-do-I-import-dependencies-in-Eclipse)

## Running the Application in Eclipse
 1. Locate the main class in MyFirstJavaProject.java *(CTRL+SHIFT+R to search by filename)*
 2. Right-click and Select Run As > Java Application *(Application currently only prints a few lines in console and terminates)*

