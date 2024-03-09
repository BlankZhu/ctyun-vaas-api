# ctyun-vaas-api

`ctyun-vaas-api` is a client SDK for `CTYun VAAS API` based on spring cloud feign. You can easily integrate it with any spring boot project.

For the official API document of `CTYun VAAS`, check [here](https://vcn.ctyun.cn/document/vaas/api/index).

## Quick Start

```java
@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private VaasApi vaasApi;

    @GetMapping("/{deviceId}")
    private DescribeDeviceResult describeDevice(@PathVariable String deviceId) {
        var req = new DescribeDeviceRequest();
        req.setDeviceId(deviceId);
        return vaasApi.describeDevice(req);
    }
}
```

Beside, you should use `@ComponentScan` on your `@SpringBootApplication` to scan `com.blankzhu.v1.config` to enable autowired.

That's it.

## Compatibility

Currently this project is built and test on:

- JDK 21
- Spring Boot 3.2.3

But also, you can adapt the dependencies in `pom.xml` to meet your requirements, it would be better to keep identical dependencies version to **your own project**.

## Configuration

`ctyun-vaas-api` use the following ENVs:

- CTYUN_VAAS_API_AK, the access key for CTYun VAAS API
- CTYUN_VAAS_API_SK, the secret access key for CTYun VAAS API
- CTYUN_VAAS_API_HOST, host to the CTYun VAAS API, use `vaasapi.ctyun.cn` as default.
- CTYUN_VAAS_API_URL, URL to the CTYun VAAS API, use `https://vaasapi.ctyun.cn` as default.

Check `com.blankzhu.v1.config.VaasApiClientConfiguration` for detail.

## Import

`ctyun-vaas-api` is currently developed, built and tested by maven.
To use this SDK, you need to do install the project into your local maven repository, and then use:

```xml
<dependency>
    <groupId>com.blankzhu</groupId>
    <artifactId>ctyun-vaas-api</artifactId>
    <version>0.0.1</version>
</dependency>
```

## Others

This project is still under testing, feel free to make any PR.