package com.blankzhu.v1.config;

import com.blankzhu.v1.VaasApi;
import com.blankzhu.v1.intercept.VaasHeaderInterceptor;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients
public class VaasApiClientConfiguration {
    @Value("${CTYUN_VAAS_API_AK:}")
    private String accessKey;

    @Value("${CTYUN_VAAS_API_SK:}")
    private String secretAccessKey;

    @Value("${CTYUN_VAAS_API_HOST:vaasapi.ctyun.cn}")
    private String vaasApiHost;

    @Value("${CTYUN_VAAS_API_URL:https://vaasapi.ctyun.cn}")
    private String vaasApiUrl;

    @Bean
    public VaasApi vaasApi() {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .requestInterceptor(new VaasHeaderInterceptor(accessKey, secretAccessKey, vaasApiHost))
                .logger(new Slf4jLogger(VaasApi.class))
                .target(VaasApi.class, vaasApiUrl);
    }
}
