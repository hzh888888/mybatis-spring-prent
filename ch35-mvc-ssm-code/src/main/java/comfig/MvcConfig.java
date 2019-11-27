package comfig;

import com.interceptor.FirstInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@EnableWebMvc
@ComponentScan({"com.controller","com.interceptor"})
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resourceViewResolver=new InternalResourceViewResolver();
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setPrefix("/WEB-INF/views/");
        return resourceViewResolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistry =   registry.addInterceptor(new FirstInterceptor());
        interceptorRegistry.addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration registration=registry.addResourceHandler("/static/**");
        registration.addResourceLocations("classpath:/static/");
    }
}
