package pages.demoqa_asidebar;import com.codeborne.selenide.SelenideElement;import pages.base.BasePage;import pages.demoqa_alerts_frame_windows.DemoqaAlertsFrameWindowsPage;import static com.codeborne.selenide.Selectors.byText;import static com.codeborne.selenide.Selenide.$;import static com.codeborne.selenide.Selenide.page;public class DemoqaAsidebarPage extends BasePage {    private final SelenideElement ALERTS_FW_CATEGORY = $(byText(            "Alerts, Frame & Windows"));    public DemoqaAlertsFrameWindowsPage clickOnAlertsFwCategory() {        waitElementIsVisible(ALERTS_FW_CATEGORY).scrollTo().click();        return page(DemoqaAlertsFrameWindowsPage.class);    }}