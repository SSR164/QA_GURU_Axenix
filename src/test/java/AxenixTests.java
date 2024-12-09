import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import page.CareerPage;
import page.OfficePage;
import page.StartPage;

@Tag("axenix")
public class AxenixTests extends TestsBase {
    StartPage startPage=new StartPage();
    CareerPage careerPage=new CareerPage();
    OfficePage officePage=new OfficePage();

    @DisplayName("Поиск номера телефона")
    @Test
    void searchPhoneTests(){
            startPage.openPage();
            startPage.searchPhone();
    }
    @DisplayName("Поиск адреса электронной почты")
    @Test
    void searchMailTests(){
            startPage.openPage();
            startPage.searchMail();
    }
    @DisplayName("Поиск вакансию QAQ")
    @Test
    void searchVacanciesAqaTests(){
            startPage.openPage();
            startPage.clickCareer();
            careerPage.clickVacancies();
            careerPage.сlickQaAutomationEngineer();
            careerPage.searchQaAutomationEngineer();

    }
    @DisplayName("Поиск офиса в Москве")
    @Test
    void searchOfficeMoscovTests(){
            startPage.openPage();
            startPage.clickOffice();
            officePage.searchMoscovOffice();


    }
    @DisplayName("Поиск офиса в Твери")
    @Test
    void searchOfficeSpbTests(){
            startPage.openPage();
            startPage.clickOffice();
            officePage.searchTverOffice();
    }

}
