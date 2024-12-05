import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.StartPage;

import static io.qameta.allure.Allure.step;
public class AxenixTests extends TestsBase {
    StartPage startPage=new StartPage();
    @Test
    @Tag("axenix")
    void SearchPhoneTests(){
        step("Open page",()->{
            startPage.openPage();
        });
        step("Search phone",()->{
            startPage.searchPhone();
        });
    }
    @Test
    @Tag("axenix")
    void SearchMailTests(){
        step("Open page",()->{
            startPage.openPage();
        });
        step("Search mail",()->{
            startPage.searchMail();
        });
    }
    @Test
    @Tag("axenix")
    void SearchVacanciesAqaTests(){
        step("Open page",()->{
            startPage.openPage();
        });
        step("Search Vacancies",()->{
            startPage.clickCareer();
            startPage.clickVacancies();
            startPage.сlickQaAutomationEngineer();
            startPage.searchQaAutomationEngineer();
        });
    }
    @Test
    @Tag("axenix")
    void SearchOfficeMoscovTests(){
        step("Open page",()->{
            startPage.openPage();
        });
        step("Search Vacancies",()->{
            startPage.clickOffice();
            startPage.searchMoscovOffice();

        });
    }
    @Test
    @Tag("axenix")
    void SearchOfficeSpbTests(){
        step("Open page",()->{
            startPage.openPage();
        });
        step("Search Vacancies",()->{
            startPage.clickOffice();
            startPage.searchSpbOffice();

        });
    }

}
//step("",()->{});