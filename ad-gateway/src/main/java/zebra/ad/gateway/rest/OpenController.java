package zebra.ad.gateway.rest;

import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OpenController
 * @Author yamei
 * @Date 2020/8/6
 **/
@RestController
@RequestMapping("/open")
public class OpenController {

    private final OpenGatewayService openGatewayService;


    public OpenController(OpenGatewayService openGatewayService) {
        this.openGatewayService = openGatewayService;
    }

    @PostMapping("/add")
    public String open(){
        RouteDefinition test = new RouteDefinition();
        test.setId("test-dynamic");
        try {
            test.setUri(new URI("https://blog.csdn.net/smilecjw"));
        } catch (URISyntaxException e) {
            System.out.println(e);
        }
        List<PredicateDefinition> testPredicateDefiniton = new ArrayList<>();
        testPredicateDefiniton.add(new PredicateDefinition("Header=kris, cjw"));
        test.setPredicates(testPredicateDefiniton);
        return openGatewayService.add(test);
    }
}
