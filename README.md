# About
A sample Spring Boot and Infinispan http session integration, where Infinispan holds all the http sessions which are generated by Spring Security. 

## Frameworks
- Spring Boot
- Spring Security
- Infinispan

## Code
Relying on below annotations to setting up automated configurations
```java
@EnableCaching
@EnableInfinispanRemoteHttpSession(cacheName = "app-session")
public class Application {
    
}
```
## Infinispan Configuration
We are using below XML configuration for setting up Infinispan cache for a 5 minutes session timeout.
```xml
<?xml version="1.0"?>
<distributed-cache name="app-session" owners="1" mode="SYNC" statistics="true">
	<encoding>
		<key media-type="application/x-protostream"/>
		<value media-type="application/x-protostream"/>
	</encoding>
	<locking isolation="REPEATABLE_READ"/>
	<expiration lifespan="-1" max-idle="300000"/>
</distributed-cache>
```