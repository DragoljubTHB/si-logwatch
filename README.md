# System Integration
## Term Project

### Architecture overview: 
https://github.com/DragoljubTHB/designs/blob/master/si-proj-overview.xml

***
![image alt text][./si-proj-overview.png]
***

### Client UI
https://github.com/DragoljubTHB/si-web.git
- npm install
- npm start.dev
- npm start.test
- npm e2e.test


### Services
https://github.com/DragoljubTHB/si-logwatch.git
- mvn package dockerile:build
- mvn verify
- mvn spring-boot:run
- docker-compose up
- docker run -p 8080:8080 -t dado/si-logwatch
### Purpose
- use of centralized logging
- event driven architecture for nano/microservices### Requirements: 

### Features
- login with aws Cognito
- load balancing over a autoscaling group
- static web hosting
- dynamic server start ( waiting for domain name request )
- deployment with docker and docker-compose

### Test, build and deployment tools used
- cli:
  - npm, protractor, jasmine, lint
  - maven, failsafe, surefire
  - github
  - travis ci
  - aws cli, aws-shell
  - docker and docker-compose
  - serverless (framework cli)
  - sam-local (local lambda testing)
