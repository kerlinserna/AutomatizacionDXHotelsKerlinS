package co.com.qvision.dxhotels.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.*;

public class CheaperRooms implements Task {

    private int cantrooms;


    public CheaperRooms(int cantrooms){

        this.cantrooms = cantrooms;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DDL_ROOMS),
                Click.on(DDL_CANTIDAD.of(String.valueOf(cantrooms))),
       		   WaitUntil.the(DDL_CANTIDAD.of(String.valueOf(cantrooms)), isNotCurrentlyVisible()).forNoMoreThan(20).seconds());
    }

    public static CheaperRooms checkout(int cantrooms){
        return Tasks.instrumented(CheaperRooms.class, cantrooms);
    }
}
