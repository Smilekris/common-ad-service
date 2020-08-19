package zebra.ad.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.InMemoryRouteDefinitionRepository;
import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
import org.springframework.context.annotation.Bean;
import zebra.ad.gateway.reposity.MyTestReposity;

/**
 * @ClassName GatewayApplication
 * @Author yamei
 * @Date 2020/7/17
 **/
@SpringCloudApplication
public class GatewayApplication {
    @Bean
    public RouteDefinitionWriter routeDefinitionWriter() {
        return new InMemoryRouteDefinitionRepository();
    }
    @Bean
    public MyTestReposity myTestReposity() {
        return new MyTestReposity();
    }
        public static void main(String[] args) {
            SpringApplication.run(GatewayApplication.class,args);
        }
}
