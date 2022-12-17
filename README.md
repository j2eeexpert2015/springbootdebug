#build docker image 
docker build -t demo-image-for-debug .
#run docker container with debugging related parameters passed
docker run -p 8081:8080 -p 5005:5005  --name demo-container demo-image-for-debug

#Dcoker compose 
docker-compose up --build