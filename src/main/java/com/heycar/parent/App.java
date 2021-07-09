package com.heycar.parent;

import com.heycar.de.DeConfig;
import com.heycar.es.EsConfig;
import com.heycar.fr.FrConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class App {
    public static void main(String[] args) {
        String applicationCountry = System.getenv("application_country");
        // create parent context
        SpringApplicationBuilder build = new SpringApplicationBuilder()
                .parent(ParentConfig.class).web(WebApplicationType.NONE);
        // create a child context
        switch (applicationCountry) {
            case "es":
                build.child(EsConfig.class).web(WebApplicationType.SERVLET).run(args);
                break;
            case "de":
                build.child(DeConfig.class).web(WebApplicationType.SERVLET).run(args);
                break;
            case "fr":
                build.child(FrConfig.class).web(WebApplicationType.SERVLET).run(args);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + applicationCountry);
        }
    }
}
