package com.nttdata.petstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class CrearUsuarioStepsDefs {

    @Steps
    CrearUsuario crearUsuario;

    @When("creo el usuario con username{string}, firstname{string}, lastname{string}")
    public void crearUsuario(String username, String firstname, String lastname){
        crearUsuario.crearUsuario(username,firstname,lastname);

    }

    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("el type es {string}")
    public void elTypeEs(String type) {
        restAssuredThat(response -> response.body("'type'", equalTo(type)));
        System.out.println("type: "+SerenityRest.lastResponse().body().path("type").toString());
    }
}
