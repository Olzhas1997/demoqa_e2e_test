package pages.demoqa_elements.buttons;import com.codeborne.selenide.SelenideElement;import org.openqa.selenium.By;import pages.base.BasePage;import pages.demoqa_elements.DemoqaElementsPage;import static com.codeborne.selenide.Condition.text;import static com.codeborne.selenide.Selectors.byText;import static com.codeborne.selenide.Selenide.$;import static com.codeborne.selenide.Selenide.page;public class DemoqaElementButtonsPage extends DemoqaElementsPage {    private SelenideElement clickMeButton = $(byText("Click Me"));    private SelenideElement rightClickMeButton = $(byText("Right Click Me"));    private SelenideElement doubleClickMeButton = $(byText("Double Click Me"));    private SelenideElement getTextElement(String text) {        return $(byText(text));    }    public DemoqaElementButtonsPage ClickOnButtonClickMe()    {        WaitElementIsVisible(clickMeButton).scrollTo().click();        return page(DemoqaElementButtonsPage.class);    }    public DemoqaElementButtonsPage ClickOnButtonRightClickMe()    {        WaitElementIsVisible(rightClickMeButton).scrollTo().contextClick();        return page(DemoqaElementButtonsPage.class);    }    public DemoqaElementButtonsPage ClickOnButtonDoubleClickMe()    {        WaitElementIsVisible(doubleClickMeButton).scrollTo().doubleClick();        return page(DemoqaElementButtonsPage.class);    }    public DemoqaElementButtonsPage CheckTextThatAppears(String text) {        WaitElementIsVisible(getTextElement(text)).scrollTo();        return page(DemoqaElementButtonsPage.class);    }}