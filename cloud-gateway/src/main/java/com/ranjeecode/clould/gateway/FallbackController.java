//package com.ranjeecode.clould.gateway;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//@RestController
//public class FallbackController {
//
//    @RequestMapping("/orderFallcack")
//    public Mono<String> orderServiceFallback(){
//        return Mono.just("Order service is down ");
//
//    }
//    @RequestMapping("/paymentFallcack")
//    public Mono<String> paymentServiceFallback(){
//        return Mono.just("Payement service is down ");
//
//    }
//
//}
