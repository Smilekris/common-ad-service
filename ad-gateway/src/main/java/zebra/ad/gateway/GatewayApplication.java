package zebra.ad.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName GatewayApplication
 * @Author yamei
 * @Date 2020/7/17
 **/
@SpringCloudApplication
public class GatewayApplication {
        public static void main(String[] args) {
            SpringApplication.run(GatewayApplication.class,args);
        }
}
