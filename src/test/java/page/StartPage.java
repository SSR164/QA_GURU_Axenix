package page;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.*;
public class StartPage {
    private  SelenideElement contact =$(".contacts"),
                        headerMenu=$(".header-menu");
@Step("Открываем сайт Axenix")
    public StartPage openPage(){
        open("");
        return this;
    }
    @Step("Ищем контактный телефон")
    public StartPage searchPhone(){
        contact.shouldHave(text("+7 (495) 755-97-70"));
        return this;
    }
    @Step("Ищем электронную почту")
    public StartPage searchMail(){
        contact.shouldHave(text("info-russia@axenix.pro"));
        return this;
    }
    @Step("Переходим на вкладку \"Карьера\"")
    public StartPage clickCareer (){
        headerMenu.$(byText("Карьера")).click();
        return this;
    }

    @Step("Переходим на вкладку \"СЕТЬ ОФИСОВ\"")
    public StartPage clickOffice (){
       headerMenu.$(byText("СЕТЬ ОФИСОВ")).click();
        return this;
    }

}
