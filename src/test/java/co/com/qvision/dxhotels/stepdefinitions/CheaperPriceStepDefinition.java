package co.com.qvision.dxhotels.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.openqa.selenium.WebDriver;

import co.com.qvision.dxhotels.tasks.CheaperAdults;
import co.com.qvision.dxhotels.tasks.CheaperCheckin;
import co.com.qvision.dxhotels.tasks.CheaperCheckout;
import co.com.qvision.dxhotels.tasks.CheaperChildren;
import co.com.qvision.dxhotels.tasks.CheaperLocation;
import co.com.qvision.dxhotels.tasks.CheaperRooms;
import co.com.qvision.dxhotels.tasks.CheaperSearch;
import co.com.qvision.dxhotels.tasks.ChoosePrice;
import co.com.qvision.dxhotels.tasks.OpenHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class CheaperPriceStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver driver;

    @Before
    public void DoSomethingBefore(){//actor
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That the user is on the Homepage of the application DX Hotels$")
    public void thatTheUserIsOnTheHomepageOfTheApplicationDXHotels() {
        theActorCalled(".DoSomethingBefore");
        theActorInTheSpotlight().wasAbleTo(OpenHome.browser());

    }

    @When("^User click in select the Location (.*)$")
    public void userClickInSelectTheLocationNewYork(String location) {

        theActorInTheSpotlight().attemptsTo(CheaperLocation.location(location));

    }

    @When("^User click in select the Check in (\\d+)/(.*)/(\\d+)$")
    public void userClickInSelectTheCheckInDec(int year,int  month,int day) {
        theActorInTheSpotlight().attemptsTo(CheaperCheckin.checkin(year, day, month));

    }


    @When("^User click in select the Check out (\\d+)/(.*)/(\\d+)$")
    public void userClickInSelectTheCheckOutDec(int yearout,int monthout, int dayout) {
        theActorInTheSpotlight().attemptsTo(CheaperCheckout.checkout(yearout, dayout, monthout));
    }


    @When("^User click in select the Rooms (\\d+)$")
    public void userClickInSelectTheRooms(int cantroom) {

        theActorInTheSpotlight().attemptsTo(CheaperRooms.checkout(cantroom));

    }

    @When("^User click in select Aduls (\\d+)$")
    public void userClickInSelectAduls(int cantadul) {

        theActorInTheSpotlight().attemptsTo(CheaperAdults.adults(cantadul));
    }

    @When("^User click in select Childres (\\d+)$")
    public void userClickInSelectChildres(int cantchil) {

        theActorInTheSpotlight().attemptsTo(CheaperChildren.children(cantchil));
    }

    @When("^User click in Search Button$")
    public void userClickInSearchButton() {
        theActorInTheSpotlight().attemptsTo(CheaperSearch.search());
    }
    
    @When("^User click lower price$")
    public void userClickLowerPrice() {
        theActorInTheSpotlight().attemptsTo(ChoosePrice.less());

    }


}
