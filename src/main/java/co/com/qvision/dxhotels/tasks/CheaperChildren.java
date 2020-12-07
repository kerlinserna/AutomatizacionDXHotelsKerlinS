package co.com.qvision.dxhotels.tasks;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.DDL_CANTIDADCHIL;
import static co.com.qvision.dxhotels.user_interface.DxHotelHome.DDL_CHILDREN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CheaperChildren implements Task {

    private int cantichil;


    public CheaperChildren(int cantichil){

        this.cantichil= cantichil;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DDL_CHILDREN),
                Click.on(DDL_CANTIDADCHIL.of(String.valueOf(cantichil))));
    }

    public static CheaperChildren children(int cantichil){
        return Tasks.instrumented(CheaperChildren.class, cantichil);
    }
}
