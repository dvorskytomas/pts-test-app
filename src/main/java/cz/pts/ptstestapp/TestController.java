package cz.pts.ptstestapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String getHello() throws InterruptedException {
        Thread.sleep(1000L);
        logger.info("Call received");
        return "Hello";
    }

}
