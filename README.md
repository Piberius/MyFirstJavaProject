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
2. **Import the Project into Eclipse**
   - Open Eclipse
   - Go to **File > Open Projects from File System... >**
   - Import Source - Select "MyFirstJavaProject" Folder and click **Finish**
3. **Move dependencies into lib folder**
4. ~~**Add dependencies to Build Path**~~
   - ~~[How to import dependencies in Eclipse](https://www.quora.com/How-do-I-import-dependencies-in-Eclipse)~~

## Running the Application in Eclipse
 1. Locate the main class in MyFirstJavaProject.java *(CTRL+SHIFT+R to search by filename)*
 2. Right-click and Select Run As > Java Application *(Application currently only prints a few lines in console and terminates)*

## Version Info

## Planned Changes
1. Add offline WSDL - country info - http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL
2. Generate Java classes with wsimport tool - https://javaee.github.io/metro-jax-ws/
3. Enable User to input - request key - request value
4. Fetch response based on user input
