# SpringDI
Spring DI java example

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




