# Blue-green / Canary deployment strategy Test

### Default Profile
application.yaml
```yaml
spring:
  profiles:
    active: blue
    value: blue
```
### Blue application
application-blue.yaml
```yaml
spring:
  profiles:
    value: blue
```
### Green application
application-green.yaml
```yaml
spring:
  profiles:
    value: green
```

### Docker build
```shell
docker build -e "SPRING_PROFILES_ACTIVE=blue" . 
```
### Deployment environment
> ref : [deployment-green.yaml](./manifests/deployment-green.yml)

Add env: **SPRING_PROFILES_ACTIVE** and **value** as below 
```yaml
### <생략> ###
      containers:
        - name: test
          image: testdockergin.azurecr.io/test:48
          ports:
            - containerPort: 8080
          env:
            - name: SPRING_PROFILES_ACTIVE
              value: green
```
