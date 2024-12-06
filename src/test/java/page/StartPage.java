package page;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.*;
public class StartPage {
    private  SelenideElement contact =$(".contacts");

    public StartPage openPage(){
        open("");
        return this;
    }
    public StartPage searchPhone(){
        contact.shouldHave(text("+7 (495) 755-97-70"));
        return this;
    }
    public StartPage searchMail(){
        contact.shouldHave(text("info-russia@axenix.pro"));
        return this;
    }
    public StartPage clickCareer (){
        $(byText("Карьера")).click();
        return this;
    }
    public StartPage clickVacancies (){
        $(byText("Открытые вакансии")).click();
        return this;
    }
    public StartPage сlickQaAutomationEngineer (){
        $(byText("QA Automation Engineer")).click();
        return this;
    }
    public StartPage searchQaAutomationEngineer (){
        $("._vacancy-details").shouldHave(text("приглашаем в команду специалистов по автоматизированному тестированию."));
        return this;
    }

    public StartPage clickOffice (){
        $(byText("СЕТЬ ОФИСОВ")).click();
        return this;
    }
    public StartPage searchMoscovOffice (){
        $(".grid").shouldHave(text("115054, г. Москва, Павелецкая площадь, 2, стр. 2"));
        return this;
    }
    public StartPage searchSpbOffice (){
        $(".grid").shouldHave(text("170006, г. Тверь, ул. Дмитрия Донского, 37"));
        return this;
    }
}
