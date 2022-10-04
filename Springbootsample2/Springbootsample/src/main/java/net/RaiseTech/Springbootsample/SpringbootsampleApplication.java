package net.RaiseTech.Springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class SpringbootsampleApplication {

	public static void main(String[] args){SpringApplication.run(SpringbootsampleApplication.class, args);}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "wourld") String name) {
		return String.format("Hello, %s!", name);
	}
}

