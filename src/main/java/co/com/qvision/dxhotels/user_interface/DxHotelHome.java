package co.com.qvision.dxhotels.user_interface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://js.devexpress.com/Demos/DXHotels/#home")
public class DxHotelHome extends PageObject {

    //Location
    public static final Target DDL_lOCATION= Target.the("usuario").locatedBy("//input[@name='location']/ancestor::div[1]/div/input");

    public static final Target DDL_CITY= Target.the("usuario").locatedBy("//*[@class='dx-scrollable-wrapper']//*[text()='{0}']");

    //Check in
    public static final Target CHK_CHECKIN= Target.the("usuario").locatedBy("//*[@name='checkIn']/ancestor::div[1]//*[@class='dx-dropdowneditor-icon']");

    public static final Target CHK_YEARS= Target.the("usuario").locatedBy("//*[@class='dx-calendar-body']/ancestor::*[1]//*[@class='dx-button-text']");

    public static final Target CHK_MONTH= Target.the("usuario").locatedBy("//*[@class='dx-calendar-body']/ancestor::*[1]//*[@class='dx-button-text']");

    public static final Target CHK_SELEYEAR= Target.the("usuario").locatedBy("//*[@class='dx-calendar-body']//*[contains(text(),'{0}')]");

    public static final Target CHK_SELEMONTH= Target.the("usuario").locatedBy("//*[@class='dx-calendar-body']//*[contains(text(),'{0}')]");
    public static final Target CHK_OUT= Target.the("usuario").locatedBy("//*[@name='checkOut']");
    public static final Target CHK_OUT_1= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-datebox-wrapper dx-datebox-wrapper-date dx-datebox-wrapper-calendar']//*[@class='dx-overlay-content dx-popup-normal dx-resizable']");

    
    
    public static final Target CHK_SELEDAY= Target.the("usuario").locatedBy("//*[@class='dx-calendar-body']//*[text()='{0}']");


    //check out
    public static final Target CHK_CHECKOUT= Target.the("usuario").locatedBy("//*[@name='checkOut']/ancestor::div[1]//*[@class='dx-dropdowneditor-icon']");//

    public static final Target CHK_YEARSOUT= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-datebox-wrapper dx-datebox-wrapper-date dx-datebox-wrapper-calendar']//*[@class='dx-calendar-body']/ancestor::*[1]//*[@class='dx-button-text']");

    public static final Target CHK_MONTHOUT= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-datebox-wrapper dx-datebox-wrapper-date dx-datebox-wrapper-calendar']//*[@class='dx-calendar-body']/ancestor::*[1]//*[@class='dx-button-text']");

    public static final Target CHK_SELEYEAROUT= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-datebox-wrapper dx-datebox-wrapper-date dx-datebox-wrapper-calendar']//*[contains(text(),'{0}')]");

    public static final Target CHK_SELEMONTHOUT= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-datebox-wrapper dx-datebox-wrapper-date dx-datebox-wrapper-calendar']//*[contains(text(),'{0}')]");

    public static final Target CHK_SELEDAYOUT= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-datebox-wrapper dx-datebox-wrapper-date dx-datebox-wrapper-calendar']//*[contains(text(),'{0}')]");

    //rooms
    public static final Target DDL_ROOMS= Target.the("usuario").locatedBy("//input[@name='rooms']/ancestor::div[1]/div/input");

    public static final Target DDL_CANTIDAD= Target.the("usuario").locatedBy("//*[@class='dx-scrollable-wrapper']//*[text()='{0}']");

    //adults
    public static final Target DDL_ADULTS= Target.the("usuario").locatedBy("//input[@name='adults']/ancestor::div[1]/div/input");

    public static final Target DDL_CANTIDADADUL= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']//*[@class='dx-scrollview-content']//*[text()='{0}']");

    //children
    public static final Target DDL_CHILDREN= Target.the("usuario").locatedBy("//input[@name='children']/ancestor::div[1]/div/input");

    public static final Target DDL_CANTIDADCHIL= Target.the("usuario").locatedBy("//*[@class='dx-overlay-wrapper dx-dropdowneditor-overlay dx-popup-wrapper dx-dropdownlist-popup-wrapper dx-selectbox-popup-wrapper']//*[@class='dx-scrollable-wrapper']//*[text()='{0}']");

    //search
    public static final Target BTN_SEARCH= Target.the("usuario").locatedBy("//*[@class='dx-button-content']//*[contains(text(),'SEARCH')]");


}
