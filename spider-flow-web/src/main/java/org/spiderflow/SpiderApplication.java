package org.spiderflow;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

/**
 * @author whoami
 */
@SpringBootApplication
@EnableScheduling
public class SpiderApplication implements ServletContextInitializer {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpiderApplication.class, args);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 设置文本缓存1M
        servletContext.setInitParameter("org.apache.tomcat.websocket.textBufferSize", Integer.toString((1024 * 1024)));
    }

}
