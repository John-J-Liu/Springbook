package SpamDetector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpamDetectorApplication {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpamAppConfig.class);
    context.getBean(ControlFlow.class).run(args);
  //context.getBean(ControlFlow.class).run(args);
  } 
}