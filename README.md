Check that Minikube is properly installed 

`minikube version`

Start the cluster

`minikube start`


### 2 Deploy

    kubectl run hello  --image=docker.io/abdennebi/hello:1.0.0 --port=8080


Check deployments
    
    kubectl get deployments
    
Show logs 

    kubectl logs $POD
    
### 3 Expose

    kubectl expose deployment hello --type="NodePort" --port 8080 "hello"
    

Run a shell from within the cluster

    kubectl run -i --tty tester --image=busybox /bin/sh

    wget -q -O- http://hello:8080 
    
### 4 Scale

    kubectl scale deployment hello --replicas=4
    

### 6 Autoscale

    exec tester-2937232101-vfkwm  -ti /bin/sh   
    
    

    kubectl get hpa
       
        
    