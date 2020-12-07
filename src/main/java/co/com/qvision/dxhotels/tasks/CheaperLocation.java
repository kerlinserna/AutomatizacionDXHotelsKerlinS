package co.com.qvision.dxhotels.tasks;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.DDL_CITY;
import  static co.com.qvision.dxhotels.user_interface.DxHotelHome.DDL_lOCATION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CheaperLocation implements Task {


    private String city;

    public CheaperLocation(String city) {
        this.city= city;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                        WaitUntil.the(DDL_lOCATION, isVisible()).forNoMoreThan(20).seconds(),
        		Click.on(DDL_lOCATION),
                            Click.on(DDL_CITY.of(city)));
    }

    public static CheaperLocation location(String city){
        return Tasks.instrumented(CheaperLocation.class, city);
    }
    
}
