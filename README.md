# Spring Cloud Demo

ConfigService: provides Eureka discovery service URI to ProxyService and UserService.  
DiscoveryService: registers proxyService and UserService.  
ProxyService: Uses discovery service to find UserService URI and calls it's /users endpoint.  
UserService: /users endpoint returns Names String.  
DemoRestApi: calls ProxyService /users endpoint.   
