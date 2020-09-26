# Spectrum_RESTful

This is a take home assignment by Spectrum. The below are the project requirements were provided by Spectrum. 
```
This is a RESTful webservice implementation and using Spring Boot is a requirement:
§  A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

§  Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

§  Make up a data set to best demonstrate your solution
```

This is a REST service which performs the above logic, the API is barebones of the requirement. The data is in data.sql in application resources.

## Getting Started

Clone this repository into your local or host machinne using this link https://github.com/venkateshreddypala/Spectrum_RESTful.git

### Prerequisites

What things you need to install the software and how to install them

```
Java
Maven
```

### Installing

 Download Java 1.8 and greater (Open JDK prefered)and maven.

```
./src mvn clean build
```

### Test
Use postman to test the rest end points

```
> HTTP Method	Available URI	Summary
- POST	/transaction/{id} To post a Transaction.
- GET	/transaction/{id}	To get a specific transaction detail
- GET	/rewards	To get the details of all the rewards
```

### URI Method summary

Example Model to create a new notebook using POST method and then use GET method to see the contents:

```
{
  "name": "string"
  "description": "string",
}
```
This API also provides the following resources mapped to the respective HTTP methods which supports CRUD operations for a Transaction.
```
- POST	/transaction/{transaction}/user- To create a new Transaction
- GET	/transaction/{id}/rewards	To get all Rewards
- GET	/transaction/{transaction}/id	To get all the transaction associated to the specified user with an id.
- GET	/rewards/{name}/{id}	Given a reward, get filtered list of name that contain the given tag id
- PUT	/transaction/{transaction}/{id}	To update a specific transaction associated with the given id/user.
```

Example model to create a POST method  
```
- {
 -  "title": "string",
  - "body": "string",
  - "tags": ["string", "string", "string"]
  - "createdTime": null,
  - "lastModified": null
}

```
Example model outputs the following using GET method
```
- "tags" - This is a string Array
- "createdTime" - This is set with the LocalDateTime value when a new transaction is created
- "lastModified" - This is set with the LocalDateTime value when a transcation is updated

```

## Deployment

> Base URI: http://localhost:8080/

## Built With
* [Java] (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java Platform
* [Maven](https://maven.apache.org/) - Dependency Management
* [Postman](https://www.getpostman.com/)- HTTP client to test the REST calls


## Authors

* **Venkatesh Pala** - *Initial work* 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

