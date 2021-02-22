package je.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exam01Application {

	public static void main(String[] args) {
//		SpringApplication.run(Exam01Application.class, args);
		SpringApplication application = new SpringApplication(Exam01Application.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

}
