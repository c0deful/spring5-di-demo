package pl.dplewa.spring5.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.dplewa.spring5.di.controllers.MyController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		// access by name
        ((MyController) ctx.getBean("myController")).helloWorld();

		// access by class
		ctx.getBean(MyController.class).helloWorld();
	}
}
