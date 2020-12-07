package co.com.qvision.dxhotels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.BTN_SEARCH;

public class CheaperSearch implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_SEARCH));

    }

    public static CheaperSearch search()
    {
        return Tasks.instrumented(CheaperSearch.class);
    }
}
