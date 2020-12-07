package co.com.qvision.dxhotels.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.qvision.dxhotels.user_interface.DxHotelHome;

public class OpenHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new DxHotelHome()));
    }

    public static OpenHome browser() {

        return Tasks.instrumented(OpenHome.class);

    }

}
