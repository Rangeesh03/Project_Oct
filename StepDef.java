package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pom.PageObjectModel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	static WebDriver driver = new ChromeDriver();
	static PageObjectModel Pom = new PageObjectModel(driver);

	@Given("user launch the flipkart application {string}")
	public void userLaunchTheFlipkartApplication(String Url) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Url);
	}

	@When("user close the login popup")
	public void userCloseTheLoginPopup() {
		Pom.closePopup();
	}

	@And("user click on the banner")
	public void userClickOnTheBanner() {
		Pom.clickBanner();
	}

	@Then("user hover on electronics menu")
	public void userHoverOnElectronicsMenu() {
		Pom.hoverElectronics(driver);
	}

	@Then("user print all sub menues")
	public void userPrintAllSubMenues() throws InterruptedException {
		Pom.printText();
		Thread.sleep(500);
		driver.close();
	}

}
