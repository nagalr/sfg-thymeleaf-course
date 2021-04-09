package guru.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver(){

        // setting a 'Session-Locale-Resolver' (default is US Locale)
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.US);
        return sessionLocaleResolver;
    }

    @Bean
    LocaleChangeInterceptor localeChangeInterceptor(){

        /*
         'Local-Change-Interceptor' Bean
         will allow to set a Local through the parameter 'lang'
         if this param not present, it will use the http header Local
        */
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){

        /*
         Configuration that allows to pass-in a Language parameter
         on the url string, and set a different language
        */
        interceptorRegistry.addInterceptor(localeChangeInterceptor());
    }
}
