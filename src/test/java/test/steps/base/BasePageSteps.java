package test.steps.base;import io.qameta.allure.Step;import static test.Configuration.Config.basePage;public class BasePageSteps {    @Step("Перейти на {url}")    public static void openWithUrl(String url)    {       basePage.open(url);    }}