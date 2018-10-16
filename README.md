# SpringDI
Spring DI java example

We have simple spring project demonstrating of how we can use concept of dependency injection using annotaion.

com.java.springbasic.service.component-> This package contains basic service used in class. We are using EmailService and SMSService for sending message.
com.java.springbasic.component--> This package has consumer class which will consume service component.
com.java.springbasic.configuration--> This package contains configuration class which will used for DI.
com.java.springbasic.client--> This package will contains client class which will finally use the service.

######### Annotation ##############

@Configuration

@ComponentScan

@Component("name")
This Project is basic example of how you can use dependency injection (DI) concept in Spring Project.
I have used annotaion based class instead of XML file configuration.

@Configuration
This annotaion used to mark the class as configuration class(we can also use xml file to configure and inject dependency)

@ComponentScan
This is used to scan component class packages. Class marked with @Component annotaion is treated class as a bean so the component-scanning mechanism of spring can pick it up and pull it into the application context. 
Check class--- /src/main/java/com/java/springbasic/configuration/AppConfiguration.java for more reference.

@Component
The @Component annotation marks a java class as a bean so the component-scanning mechanism of spring can pick it up and pull it into the application context. 

Check package /src/main/java/com/java/springbasic/component/ for more reference

@Autowired
This annotation is used to inject dependency. It will create object for you of given class.

@Qualifier("nameOFBean")
This annotation is used to differentiate the type of bean we want to inject

To test this application we have also client class. Please find at below package

/src/main/java/com/java/springbasic/client/




