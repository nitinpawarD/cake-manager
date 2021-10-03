# cake-manager

Please run below commands to run below commands from project root directory ::

Step 1) Build the project : mvn clean install

Step 2) Run the project :
        mvn spring-boot:run OR
        java -jar target/cake-manager-0.0.1-SNAPSHOT.jar

Step 3) Add a Cake using postman
        Method : POST
        URL :  http://localhost:8080/api/v1/cakes
        Body :  {
                    "cakeName" : "Black Forest",
                    "price" : "100",
                    "rating" : 5
                }

        Response :  {
                    "id": 1,
                    "cakeName": "Black Forest",
                    "price": 100.0,
                    "rating": 5
                }


Step 4) Add another Cake using postman
        Method : POST
        URL :  http://localhost:8080/api/v1/cakes
        Body :  {
                    "cakeName" : "Carrot",
                    "price" : "80",
                    "rating" : 4
                }

        Response :
                {
                    "id": 2,
                    "cakeName": "Carrot",
                    "price": 80.0,
                    "rating": 4
                }


5) Access all cakes present in the system using postman
Method : GET
URL :  http://localhost:8080/api/v1/cakes

Note* h2 in memory data path is set for windows environment : C:\\cake-manager\\data
