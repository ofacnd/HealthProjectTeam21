package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Mine {

    public Mine() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "[class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement simge;

    @FindBy (css = "[id='login-item']")
    public WebElement sign; // Giris simgesine tıkladıktan sonra acilan menude signin secenegi

    @FindBy (css = "[name='username']")
    public WebElement userBox;

    @FindBy (css = "[name='password']")
    public WebElement paswordBox;

    @FindBy (css = "[class='btn btn-primary']")
    public WebElement singButonu; // Kullanici girisi kisminda bulunan signin butonu

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement mypages;

    @FindBy(xpath ="//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement mypagespatient;

    @FindBy(xpath ="//span[normalize-space()='Search Patient']")
    public WebElement searchpatient;

    @FindBy(xpath ="//span[normalize-space()='My Appointments']")
    public WebElement myappointmentpatiend;

    @FindBy(xpath ="//input[@name='ssn']")
    public WebElement ssnbox;

    @FindBy(xpath = "//td[normalize-space()='715-15-1516']")
    public WebElement aramasonucelemnt;


    @FindBy(xpath ="(//*[@class=\"d-none d-md-inline\"])[3]")
    public WebElement ShowAppoint;

    @FindBy(xpath ="(//*[@class=\"btn btn-primary btn-sm\"])[1]")
    public WebElement Showtest;

    @FindBy(xpath = "(//*[@class=\"d-none d-md-inline\"])[1]")
    public WebElement viewresult;

    @FindBy(xpath ="//span[normalize-space()='Test Results']")
    public WebElement Testresult;

    @FindBy(xpath ="//span[normalize-space()='ID']")
    public WebElement TestResultid;

    @FindBy(xpath ="//span[normalize-space()='Name']")
    public WebElement TestResultname;

    @FindBy(xpath ="//span[normalize-space()='Result']")
    public WebElement TestResultresult;

    @FindBy(xpath ="//span[normalize-space()='Default Min. Value']")
    public WebElement TestResultDefaultmin;

    @FindBy(xpath ="//span[normalize-space()='Default Max. Value']")
    public WebElement TestResultDefaultmax;

    @FindBy(xpath ="//span[normalize-space()='Description']" )
    public WebElement TestResultDescription;

    @FindBy(xpath ="//a[normalize-space()='312224']")
    public WebElement idnumara;

    @FindBy(xpath ="(//*[text()='Edit'])[1]")
    public WebElement TestResultEditbutonu;

    @FindBy(xpath ="//span[normalize-space()='Save']")
    public WebElement Savebutonu;

    @FindBy(xpath ="//*[@class='Toastify__close-button Toastify__close-button--success']")
    public WebElement updatedWithIdentifer;
    @FindBy(xpath ="//input[@id='c-test-result-result']" )
    public WebElement resultbox;



    @FindBy(xpath ="(//*[@class=\"btn btn-success btn-sm\"])[1]")
    public WebElement paymentInvoiceProcesbuton;

    @FindBy(xpath ="//th[normalize-space()='PAYMENT DETAIL']")
    public WebElement paymentdetailbaslik;

    @FindBy(xpath ="//*[@class=\"btn btn-success btn-sm\"]")
    public WebElement showInvoicebuton;

    @FindBy(xpath ="//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[4]")
    public WebElement completedstatusu;

    @FindBy(xpath ="(//*[@class=\"d-none d-md-inline\"])[6]")
    public WebElement paymentinvoicetwo;

    @FindBy(xpath ="//th[text()=\"Exam Fee:\"]")
    public WebElement muayeneucreti;

    @FindBy(css="body div[id='root'] thead thead td:nth-child(1)")
    public WebElement testucreti;
    @FindBy(xpath ="//th[normalize-space()='INVOICE']")
    public WebElement invoicebaslik;

    @FindBy(xpath ="//a[@class='btn btn-success btn-sm']")
    public WebElement ShowInvoicebuton;

    @FindBy(xpath ="(//td)[10]")
    public WebElement hastashowkars;
    @FindBy(xpath ="(//*[@class=\"d-none d-md-inline\"])[2]")
    public WebElement showtest;

    @FindBy(css ="a[href='/testresult/test/312430']")
    public WebElement viewresultuu;

    @FindBy(xpath ="//*//thead//tr//th")
    public List<WebElement> testbasliklari;

    @FindBy(xpath ="//th[1]")
    public WebElement ID;

    @FindBy(xpath ="(//*[@class=\"hand\"])[2]")
    public WebElement Name;

    @FindBy(xpath ="(//*[@class=\"hand\"])[3]")
    public WebElement Result;
    @FindBy(xpath ="(//*[@class=\"hand\"])[5]")
    public WebElement defaultmaxvalue;

    @FindBy(xpath ="(//*[@class=\"hand\"])[4]")
    public WebElement defaultminvalue;

    @FindBy(xpath ="//*[text()='Test']")
    public WebElement Test;

    @FindBy(xpath ="(//*[@class=\"hand\"])[6]")
    public WebElement description;

    @FindBy(xpath ="(//*[@class=\"hand\"])[7]")
    public WebElement date;

    @FindBy(xpath ="//span[normalize-space()='Test Results']")
    public WebElement testREbaslik;


    @FindBy(css ="a[class='btn btn-warning btn-sm'] span[class='d-none d-md-inline'] span")
    public WebElement Shwinvoice;

    @FindBy(css = "tr:nth-child(1) th:nth-child(1)")
    public WebElement faturayigoruyorum;



}
