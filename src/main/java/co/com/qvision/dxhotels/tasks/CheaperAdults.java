package co.com.qvision.dxhotels.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.*;

public class CheaperAdults implements Task {

    private int cantadult;


    public CheaperAdults(int cantadult){

        this.cantadult = cantadult;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DDL_ADULTS),
     		   WaitUntil.the(DDL_CANTIDADADUL.of(String.valueOf(cantadult)), isVisible()).forNoMoreThan(20).seconds(),
                Click.on(DDL_CANTIDADADUL.of(String.valueOf(cantadult))),
      		   WaitUntil.the(DDL_CANTIDADADUL.of(String.valueOf(cantadult)), isNotPresent()).forNoMoreThan(20).seconds()
        		);
    }

    public static CheaperAdults adults(int cantadult){
        return Tasks.instrumented(CheaperAdults.class, cantadult);
    }

}
