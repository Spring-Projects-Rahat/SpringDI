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
