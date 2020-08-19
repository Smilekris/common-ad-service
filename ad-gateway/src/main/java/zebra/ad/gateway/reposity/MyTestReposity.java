package zebra.ad.gateway.reposity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyTestReposity
 * @Author yamei
 * @Date 2020/8/6
 **/
//@Component
@Slf4j
public class MyTestReposity implements RouteDefinitionRepository {

    //返回路由使用
    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {
        log.info("调用时间：{}",System.currentTimeMillis());
        List<RouteDefinition> routeDefinitions = new ArrayList<>();
        RouteDefinition test = new RouteDefinition();
        test.setId("test-dynamic");
        try {
            test.setUri(new URI("https://blog.csdn.net/smilecjw"));
        } catch (URISyntaxException e) {
            System.out.println(e);
        }
        List<PredicateDefinition> testPredicateDefiniton = new ArrayList<>();
        testPredicateDefiniton.add(new PredicateDefinition("Header=name, cjw"));
        test.setPredicates(testPredicateDefiniton);
        routeDefinitions.add(test);
        return Flux.fromIterable(routeDefinitions);
    }

    @Override
    public Mono<Void> save(Mono<RouteDefinition> route) {
        System.out.println(route);
        return null;
    }

    @Override
    public Mono<Void> delete(Mono<String> routeId) {
        return null;
    }
}
