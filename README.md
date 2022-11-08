# Simple project for managment URL addresses

To run the project you have to start Zookeeper, Kafka and Postgres Database using docker-compose file.

To do it, go to /url-core/docker directory and run "docker-compose up" command in your terminal.

The next step will be liquibase migration database. Make sure that the parameter "spring.liquibase.drop-first" in application.properties is set on true, then you can run both applications:  UrlApiApplication and UrlCoreApplication.

When applications started you can make a simple test using the example below curl in your terminal or import to other fav tools:

curl --location --request POST 'localhost:8080/api/v1/url' \
--header 'Content-Type: application/json' \
--data-raw '{
"urlAddress": "http://google.com/"
}'
