# payroll-ms
Microservice in Spring Boot (Spring Cloud, OpenFeign, Eureka Server/Client, Hystrix, Zuul API Gateway)

# project start

run eureka-server first and then do the same for the other projects 


# endpoints using zuul (api-gateway)

- localhost:8765/hr-worker/workers
- localhost:8765/hr-worker/workers/1
- localhost:8765/hr-payroll/payments/3/days/10


# endpoints for git repo (config server)

- http://localhost:8888/hr-worker/test
- http://localhost:8888/hr-worker/default 
