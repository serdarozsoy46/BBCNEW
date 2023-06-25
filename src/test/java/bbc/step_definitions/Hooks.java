package bbc.step_definitions;

import bbc.utilities.ConfigurationReader;
import bbc.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        //  Driver.closeDriver();
    }
}
