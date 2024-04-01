package cz.pts.ptstestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public String getHello() throws InterruptedException {
        Thread.sleep(1000L);
        return "Hello";
    }

}
