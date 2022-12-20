import com.codeborne.selenide.selector.ByText;
import org.apache.hc.client5.http.entity.mime.Header;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Headers;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class  hmwrkslnd1 {
    @BeforeAll
    static void beforeall() {
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
    }
    @Test
    void scssflHmwrkTestSelenide1() {
        /// open selenide page on github
        open("/selenide/selenide");
        ///go to selenide wiki
        $("#wiki-tab").click();
        /// check if pages have Soft assertions text
        $(byText("Show 2 more pages…")).scrollTo().click();
        $(".wiki-pages-box").shouldHave(text("SoftAssertions"));
        ///open soft assertions page
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();


        ///check code example for JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
