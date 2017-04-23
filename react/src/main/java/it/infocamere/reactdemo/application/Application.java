package it.infocamere.reactdemo.application;

import javax.security.auth.message.config.AuthConfigFactory;

import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan({"it.infocamere.reactdemo.application","it.infocamere.reactdemo.controller"})




public class Application extends SpringBootServletInitializer {

	public Application() {
		super();
		setRegisterErrorPageFilter(false); // <- this one
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
		// bug con Tomcat 8
		if (AuthConfigFactory.getFactory() == null) {
			AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
		}
		System.setProperty("spring.devtools.restart.enabled", "true");

		SpringApplication.run(Application.class, args);
	}

}