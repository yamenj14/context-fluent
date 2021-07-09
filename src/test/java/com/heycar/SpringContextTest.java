package com.heycar;

import com.heycar.parent.App;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.SetEnvironmentVariable;

@SetEnvironmentVariable(
        key = "application_country",
        value = "de")
public class SpringContextTest {

    @Test
    public final void testMain() throws Exception {
        App.main(new String[] {});
	}
}
