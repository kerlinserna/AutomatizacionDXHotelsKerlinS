package co.com.qvision.dxhotels.tasks;

import static co.com.qvision.dxhotels.user_interface.DxHotelHome.CHK_CHECKIN;
import static co.com.qvision.dxhotels.user_interface.DxHotelHome.CHK_MONTH;
import static co.com.qvision.dxhotels.user_interface.DxHotelHome.CHK_SELEDAY;
import static co.com.qvision.dxhotels.user_interface.DxHotelHome.CHK_SELEMONTH;
import static co.com.qvision.dxhotels.user_interface.DxHotelHome.CHK_SELEYEAR;
import static co.com.qvision.dxhotels.user_interface.DxHotelHome.CHK_YEARS;
import static co.com.qvision.dxhotels.utils.ConvertMounth.convertMounth;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CheaperCheckin implements Task {

    private int year, day,month;


    public CheaperCheckin(int year, int day, int month){

        this.year= year;
        this.day =day;
        this.month = month;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CHK_CHECKIN),
                            Click.on(CHK_MONTH),
                             Click.on(CHK_YEARS),
                             Click.on(CHK_SELEYEAR.of(String.valueOf(year))),
                            Click.on(CHK_SELEMONTH.of(convertMounth(month))),
                            Click.on(CHK_SELEDAY.of(String.valueOf(day))));
    }

    public static CheaperCheckin checkin(int year, int day, int month){
        return Tasks.instrumented(CheaperCheckin.class,year, day, month );
    }
}
