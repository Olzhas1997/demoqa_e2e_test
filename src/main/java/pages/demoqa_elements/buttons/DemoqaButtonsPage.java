package pages.demoqa_elements.buttons;import com.codeborne.selenide.SelenideElement;import pages.demoqa_elements.DemoqaElementsPage;import static com.codeborne.selenide.Selectors.byText;import static com.codeborne.selenide.Selenide.$;import static com.codeborne.selenide.Selenide.page;public class DemoqaButtonsPage extends DemoqaElementsPage {    private final SelenideElement CLICK_ME_BUTTON = $(byText("Click Me"));    private final SelenideElement DOUBLE_CLICK_ME_BUTTON = $(            byText("Double Click Me"));    private final SelenideElement RIGHT_CLICK_ME_BUTTON = $(            byText("Right Click Me"));    public DemoqaButtonsPage checkTextThatAppears(String text) {        waitElementIsVisible(getTextElement(text)).scrollTo();        return page(DemoqaButtonsPage.class);    }    public DemoqaButtonsPage clickOnButtonClickMe() {        waitElementIsVisible(CLICK_ME_BUTTON).scrollTo().click();        return page(DemoqaButtonsPage.class);    }    public DemoqaButtonsPage clickOnButtonDoubleClickMe() {        waitElementIsVisible(DOUBLE_CLICK_ME_BUTTON).scrollTo().doubleClick();        return page(DemoqaButtonsPage.class);    }    public DemoqaButtonsPage clickOnButtonRightClickMe() {        waitElementIsVisible(RIGHT_CLICK_ME_BUTTON).scrollTo().contextClick();        return page(DemoqaButtonsPage.class);    }    private SelenideElement getTextElement(String text) {        return $(byText(text));    }}