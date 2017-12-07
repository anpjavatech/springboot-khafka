# springboot-khafka
Springboot with Khafka

# Start Kafka server and zookeeper

To start the zookeper -->> C:\kafka_2.12-0.10.2.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
To start Kafka server -->> .\bin\windows\kafka-server-start.bat .\config\server.properties

# Start Springboot application

Start ur springboot application in any specified port

# API Calls

To send data to Kafka server.

http://localhost:8080/jsa/kafka/producer?data=Hello World

To consume data.

http://localhost:8080/jsa/kafka/consumer
