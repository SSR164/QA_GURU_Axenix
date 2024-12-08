package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CareerPage {
    private SelenideElement vacancies =$(".hero-text"),
                 qaAutomationEngineer =$(".vacancy-block.block-alt.bg-b"),
                       vacancyDetails =$("._vacancy-details");
    @Step("Переходим к вакансиям ")
    public CareerPage clickVacancies (){
        vacancies.$(byText("Открытые вакансии")).click();
        return this;
    }
    @Step("Открываем вакансию QAQ ")
    public CareerPage сlickQaAutomationEngineer (){
        qaAutomationEngineer.$(byText("QA Automation Engineer")).click();
        return this;
    }
    @Step("Проверяем описание ")
    public CareerPage searchQaAutomationEngineer (){
        vacancyDetails.shouldHave(text("приглашаем в команду специалистов по автоматизированному тестированию."));
        return this;
    }
}
