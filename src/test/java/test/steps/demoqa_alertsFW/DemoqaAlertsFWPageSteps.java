package test.steps.demoqa_alertsFW;import io.qameta.allure.Step;import static test.Configuration.Config.demoqaAlertsFWPage;public class DemoqaAlertsFWPageSteps {    @Step("Нажать на «Browser Windows»")    public static void ClickOnBrowserWindowsCategory() {        demoqaAlertsFWPage.ClickOnBrowserWindowsCategory();    }    @Step("Нажать на «Alerts»")    public static void ClickOnAlertsCategory() {        demoqaAlertsFWPage.ClickOnAlertsCategory();    }}