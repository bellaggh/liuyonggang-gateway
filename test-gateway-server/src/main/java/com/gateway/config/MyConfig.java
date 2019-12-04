package com.gateway.config;

import com.gateway.filter.MyGateWayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder route = routeLocatorBuilder.routes().route(
                r->r.path("/api/client/**")
                    .filters(f->f.stripPrefix(2).filter(getMyFilter()))
                    .uri("http://localhost:10001")
                    .order(0)
                    .id("gateway-client1")

        );
        return route.build();
    }

    @Bean
    public MyGateWayFilter getMyFilter(){
        return new MyGateWayFilter();
    }
}
