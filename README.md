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