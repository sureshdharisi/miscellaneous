## How to use the application

### Prerequisites to execute below application:

1. Docker
2. Java 17 (If we want to modify the code)
3. Maven (If we want to modify the code)


### Build docker image

```
mvn clean install
docker build . -t docker-eks-demo:1.0 
docker tag  docker-eks-demo:1.0 sureshdharisi123/docker-eks-demo:1.0
docker push sureshdharisi123/docker-eks-demo:1.0
```

### Run docker container

docker run -p 8080:8080 sureshdharisi123/docker-eks-demo:1.0