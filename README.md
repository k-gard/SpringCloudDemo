# Spring Cloud Demo

ConfigService: provides Eureka discovery service uri 
DiscoveryService: registers proxyService and UserService
ProxyService: Uses discovery service to find UserService uri and calls it's /users endpoint
UserService: /users endpoint returns Names String.
DemoRestApi: calls ProxyService /users endpoint. 
