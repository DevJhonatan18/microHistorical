docker build -t servicio-historical:v1

docker run -d -p 8014:8014 --name servicio-historical --network demo_deposit_kafka-local servicio-historical:v1
