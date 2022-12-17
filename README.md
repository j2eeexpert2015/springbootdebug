#build docker image 
docker build -t demo-image-for-debug .
#run docker container with debugging related parameters passed
docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8081:8080 -p 5005:5005  --name demo-container demo-image-for-debug