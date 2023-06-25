package bbc.pages;

import bbc.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Driver {

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }


}
