package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class W3schoolStepdefinitions {




    @Given("kullanici w3schools sayfasina gider")
    public void kullanici_w3schools_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("w3school"));

    }

    @Then("kullanici ulke isimlerini alir")
    public void kullanici_ulke_isimlerini_alir() {
        List<WebElement> liste = ReusableMethods.getSutun(3);

        for(WebElement element : liste){
            System.out.println(element.getText());
        }
  
        
         System.out.println("basardik");
    }
}
