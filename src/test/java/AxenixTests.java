import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.CareerPage;
import page.OfficePage;
import page.StartPage;

@Tag("axenix")
public class AxenixTests extends TestsBase {
    StartPage startPage=new StartPage();
    CareerPage careerPage=new CareerPage();
    OfficePage officePage=new OfficePage();

    @Test
    void searchPhoneTests(){
            startPage.openPage();
            startPage.searchPhone();
    }

    @Test
    void searchMailTests(){
            startPage.openPage();
            startPage.searchMail();
    }

    @Test
    void searchVacanciesAqaTests(){
            startPage.openPage();
            startPage.clickCareer();
            careerPage.clickVacancies();
            careerPage.сlickQaAutomationEngineer();
            careerPage.searchQaAutomationEngineer();

    }

    @Test
    void searchOfficeMoscovTests(){
            startPage.openPage();
            startPage.clickOffice();
            officePage.searchMoscovOffice();


    }

    @Test
    void searchOfficeSpbTests(){
            startPage.openPage();
            startPage.clickOffice();
            officePage.searchTverOffice();
    }

}
