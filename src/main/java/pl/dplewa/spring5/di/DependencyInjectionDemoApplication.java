package pl.dplewa.spring5.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.dplewa.spring5.di.controllers.ConstructorInjectedController;
import pl.dplewa.spring5.di.controllers.MyController;
import pl.dplewa.spring5.di.controllers.PropertyInjectedController;
import pl.dplewa.spring5.di.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		// context access demo
        ((MyController) ctx.getBean("myController")).helloWorld();
		ctx.getBean(MyController.class).helloWorld();

		// dependency injection demo
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
