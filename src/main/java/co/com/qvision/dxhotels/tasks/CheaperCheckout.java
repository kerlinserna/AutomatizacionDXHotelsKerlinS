package co.com.qvision.dxhotels.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.*;
import static co.com.qvision.dxhotels.utils.ConvertMounth.convertMounth;


public class CheaperCheckout implements Task {

    private int year, day,month;

    public CheaperCheckout(int year, int day, int month){

        this.year= year;
        this.day =day;
        this.month = month;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        		   WaitUntil.the(CHK_OUT_1, isNotPresent()).forNoMoreThan(20).seconds(),
       		   WaitUntil.the(CHK_OUT, isPresent()).forNoMoreThan(20).seconds(),
        		   //WaitUntil.the(CHK_CHECKOUT, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CHK_CHECKOUT)
                );
        
        actor.attemptsTo(  
     		   WaitUntil.the(CHK_MONTHOUT, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Click.on(CHK_MONTHOUT),
      		   WaitUntil.the(CHK_YEARSOUT, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(CHK_YEARSOUT),
                Click.on(CHK_SELEYEAROUT.of(String.valueOf(year))),
                WaitUntil.the(CHK_SELEMONTHOUT.of(convertMounth(month)), isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CHK_SELEMONTHOUT.of(convertMounth(month))),
                WaitUntil.the(CHK_SELEDAYOUT.of(String.valueOf(day)), isVisible()).forNoMoreThan(20).seconds(),
        		Click.on(CHK_SELEDAYOUT.of(String.valueOf(day))));
    }

    public static CheaperCheckout checkout(int year, int day, int month){
        return Tasks.instrumented(CheaperCheckout.class, year, day, month);
    }
}
