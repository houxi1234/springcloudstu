package cn.ce.st.register;

import io.undertow.UndertowOptions;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;


/**
* @Title:
* @Package
* @Description:
* @author hx
* @date 2018/12/22
*/
@SpringBootConfiguration
public class UndertowEmbeddedHttp2Configuration {

    @Bean
    public UndertowServletWebServerFactory undertowServletWebServerFactory() {
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
        factory.addBuilderCustomizers(builder -> builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true));
        return factory;
    }


}
