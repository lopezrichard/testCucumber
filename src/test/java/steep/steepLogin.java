package steep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.model.Status;
import org.testng.Assert;

/**
 * Created by Richard Lopez on 03/06/2022
 * Visit Linkedin https://www.linkedin.com/in/richard-lopez-/
 **/
public class steepLogin {
    @Given("que ingresas a la web")
    public void queIngresasALaWeb() throws InterruptedException {
        Assert.assertTrue(true);
    }

    @When("el usuario ingresas sus credenciales validas")
    public void elUsuarioIngresasSusCredencialesValidas() {
        Assert.assertTrue(false);
    }

    @Then("ingresas sastifactoriamente al home")
    public void ingresasSastifactoriamenteAlHome() {
        Assert.assertTrue(false);
    }

    @Given("que ingresas a la webb")
    public void queIngresasALaWebb() throws InterruptedException {
        Assert.assertTrue(true);

    }

    @When("el usuario ingresas sus credenciales validass")
    public void elUsuarioIngresasSusCredencialesValidass() {
        Assert.assertTrue(true);
    }

    @Then("ingresas sastifactoriamente al homee")
    public void ingresasSastifactoriamenteAlHomee() {
        Assert.assertTrue(true);
    }
}
