package co.com.qvision.dxhotels.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class HotelsPage {
    public static final Target DATA_HOTELS= Target.the("usuario").locatedBy("//*[@class='current-hotels']");

    public static final Target HOTELS= Target.the("usuario").locatedBy("//*[@class='current-hotels']/*[{0}]//*[@class='rate-number']");

    public static final Target BTN_HOTELS_LESS_PRICE= Target.the("usuario").locatedBy("//*[@class='current-hotels']//*[contains(text(),'{0}')]/ancestor::div[3]//*[@class='dx-button-content']");

    public static final Target TITLE_HOTLES= Target.the("usuario").locatedBy("//*[@class='dx-content dx-content-content dx-transition-inner-wrapper dx-active-view']//*[@class='hotel-info']");

  
}
