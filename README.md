# 272-Hello_World-Microservices_Application

This demonstrates a simple microservices architecture using Spring Boot (Java), Docker, and Kubernetes. It consists of two microservices:

Hello Service: Returns a greeting message ("Hello").
World Service: Returns a message ("World").


Setting Up the Development Environment:
Ensure you have the following installed:

  Java Development Kit (JDK)
  Maven for building the project
  IDE
  Docker for containerization
  Minikube or Kubernetes cluster for deployment

Building Docker Images:

    Containerize the microservices by building the following Docker images:
        1. For Hello Service: 
            docker build -t hellodocker.jar .
        2. For World Service: 
            docker build -t worlddocker.jar .
      
Running Docker:
      1. For Hello Service: 
            docker run -p 8080:8080 hellodocker.jar
        2. For World Service: 
            docker run -p 8081:8081 worlddocker.jar

Pushing Docker Images to Docker Hub:

    After building the Docker images, push them to your Docker Hub repository:
        1. For Hello Service:
            docker push manish0981/hellodocker.jar:latest
        2. For World Service:
            docker push manish0981/worlddocker.jar:latest
        

Deploying Microservices on Kubernetes:

    Use Kubernetes to deploy the microservices by applying the respective YAML configuration files:
        1. For Hello Service:
            kubectl apply -f hello-deployment.yaml                 
            kubectl apply -f hello-service.yaml 
        2. For World Service:
            kubectl apply -f world-deployment.yaml                 
            kubectl apply -f world-service.yaml 
        

Starting Minikube :

    Start Minikube to run the local Kubernetes cluster:
        minikube start

Accessing the Services:

    Once the services are deployed, access them via the following Minikube commands:
        1. For Hello Service:
            minikube service hello-service 
            
            * Starting tunnel for service hello-service.
            |-----------|---------------|-------------|------------------------|
            | NAMESPACE |     NAME      | TARGET PORT |          URL           |
            |-----------|---------------|-------------|------------------------|
            | default   | hello-service |             | http://127.0.0.1:54144 |
            |-----------|---------------|-------------|------------------------|

<img width="1464" alt="Screenshot (241)" src="">


            http://127.0.0.1:54144/hello - Displays "Hello"
            
        2. For World Service:
            minikube service world-service 

           * Starting tunnel for service world-service.
           |-----------|---------------|-------------|------------------------|
           | NAMESPACE |     NAME      | TARGET PORT |          URL           |
           |-----------|---------------|-------------|------------------------|
           | default   | world-service |             | http://127.0.0.1:53941 |
           |-----------|---------------|-------------|------------------------|
            
<img width="1456" alt="Screenshot (240)" src="">

            http://127.0.0.1:53941/world - Displays "World"
            
       


Links to Docker Hub images:

    The Docker images for each service can be found at the following links:
        1. hello-service image
            https://hub.docker.com/repository/docker/manish0981/hellodocker.jar/general
        2. world-service image
            https://hub.docker.com/repository/docker/manish0981/worlddocker.jar/general
       
