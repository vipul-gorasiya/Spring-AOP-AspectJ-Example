# Spring AOP with AspectJ example

## How is it used in example

- [LoggingAspect](SpringCustomEventExample/src/main/java/com/vipul/aspect/LoggingAspect.java) - Aspect
	- Defines a point cut "allVipulPublicMethods" to have aspect running for execution of all public methods defined for com.vipul.*
	- Define Advice @Around to run the aspect around all public methods
	- logAroundMethod() method adds a log entry around method.
- [ExampleService](SpringCustomEventExample/src/main/java/com/vipul/service/ExampleService.java) - Service having one public method to get welcome message
- [ExampleController](SpringCustomEventExample/src/main/java/com/vipul/controller/ExampleController.java) - Controller handling root mapping to get message from service and return to caller.

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Launch URL: "http://localhost:8080/". This will call ExampleController which calls ExampleService in turn to get message and return.
4. Since ExampleController and ExampleService are having public methods which are getting executed, log statements will be shown around its call in console/log.
5. Observe log to see the sequence of logging and relate it with defined Aspect