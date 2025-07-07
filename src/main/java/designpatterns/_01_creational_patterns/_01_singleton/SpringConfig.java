package designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SpringConfig {

    public String hello() {
        return "hello";
    }

}
