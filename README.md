# springbootmultipledatabaseconnection
This application tells you to communicate with multiple databases with a single spring-boot application. Here I have used  two databases (test and demo) for MySQL. Please refer to this application if your requirements match in between that. 

1. Change application.yaml file based on your database configuration.

    spring.datasource.jdbc-url=jdbc:mysql://localhost/test
    spring.datasource.username=<your db username>
    spring.datasource.password=<your db password>
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    
    spring.seconddatasource.jdbc-url=jdbc:mysql://localhost/demo
    spring.seconddatasource.username=<your db username>
    spring.seconddatasource.password=<your db password>
    spring.seconddatasource.driver-class-name=com.mysql.cj.jdbc.Driver
  

2. Run the application, right click on SpringbootmultipledatabaseconnectionApplication.class Run as Java Application.
3. Try to access http://localhost:8080/

4. Need to call two API one for user and second for Product. fellow the below postman calls:-

   POST /users/save HTTP/1.1
   Host: localhost:8080
   Content-Type: application/json
   Content-Length: 48
  
   {
    "uname" : "Ram",
    "address" : "Ayoudhya"
   }
   
![Capture](https://github.com/vikuSingh/springbootmultipledatabaseconnection/assets/20941580/790f278d-6360-4d8e-9e3d-46372b4b5dff)

    GET /users/getUser HTTP/1.1
    Host: localhost:8080

![Capture](https://github.com/vikuSingh/springbootmultipledatabaseconnection/assets/20941580/61a486f8-5515-4462-bb8d-cb9e0ea8fcdf)

    POST /product/save HTTP/1.1
    Host: localhost:8080
    Content-Type: application/json
    Content-Length: 49
    
    {
        "pname": "banana",
        "prize": 500.00
    }

![Capture](https://github.com/vikuSingh/springbootmultipledatabaseconnection/assets/20941580/9ce991b0-f071-4365-ad40-a260f53b0cb0)

      GET /product/getAllProduct HTTP/1.1
      Host: localhost:8080
      Content-Type: application/json
      Content-Length: 1


![Capture](https://github.com/vikuSingh/springbootmultipledatabaseconnection/assets/20941580/b2885bef-bc91-41b6-b20d-e177fd063b6f)

Thanks.



   
