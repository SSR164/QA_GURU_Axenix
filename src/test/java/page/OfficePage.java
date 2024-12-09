package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OfficePage {
    private SelenideElement office = $(".grid");

    @Step("Ищем офис в Москве")
    public OfficePage searchMoscovOffice() {
        office.shouldHave(text("115054, г. Москва, Павелецкая площадь, 2, стр. 2"));
        return this;
    }

    @Step("Ищем офис в Твери")
    public OfficePage searchTverOffice() {
        office.shouldHave(text("170006, г. Тверь, ул. Дмитрия Донского, 37"));
        return this;
    }
}
