package BookingMobile.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DashBoardResult extends PageObject {
    public static  Target TITLE_OF_DASHBOARD = Target.the("").locatedBy("//h1[@id='form_search_h1']");
}
