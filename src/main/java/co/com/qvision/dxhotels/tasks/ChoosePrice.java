package co.com.qvision.dxhotels.tasks;

import static co.com.qvision.dxhotels.user_interface.HotelsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.ArrayList;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.qvision.dxhotels.utils.LessPrice.lessPrice;

public class ChoosePrice implements Task {
	private int count=1;
	private ArrayList<String> values = new ArrayList<String>();


    @Override
    public <T extends Actor> void performAs(T actor) 
    {
    	actor.attemptsTo(
    			   WaitUntil.the(DATA_HOTELS, isVisible()).forNoMoreThan(20).seconds());
    	
    	boolean swith=true;
    	
    	do {
			
    	    if (HOTELS.of(String.valueOf(count)).resolveFor(actor).isVisible()) {
    	    	values.add(HOTELS.of(String.valueOf(count)).resolveFor(actor).getText());
    	    	count++;
			}else {
				swith=false;
			}
    	    
		} while (swith);
    	
    	actor.attemptsTo(
				Click.on(BTN_HOTELS_LESS_PRICE.of(lessPrice(values))),
 			   WaitUntil.the(TITLE_HOTLES, isVisible()).forNoMoreThan(20).seconds());


    }

    public static ChoosePrice less()
    {
        return Tasks.instrumented(ChoosePrice.class);
    }
}
