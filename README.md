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
    
    
### 5 Rolling Update

    kubectl set image deployment hello hello=abdennebi/hello:2.0.0
    

### 6 Autoscale

    kubectl autocale deployment hello --max=10 --min=1 --cpu-percent=50

    exec tester-2937232101-vfkwm  -ti /bin/sh
       
    while true; do wget -q -O- http://hello:8080/expensive; done
    
    kubectl get pod
    
    kubectl get hpa
       
        
    