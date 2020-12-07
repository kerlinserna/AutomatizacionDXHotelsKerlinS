package co.com.qvision.dxhotels.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)


@CucumberOptions(
        features = "src/test/resources/features/CheaperPrice.feature",
        glue = {"co.com.qvision.dxhotels.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class CheaperPriceRunner {
}
