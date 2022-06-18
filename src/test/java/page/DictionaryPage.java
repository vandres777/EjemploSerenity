package page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://en.wiktionary.org/wiki/Wiktionary")
public class DictionaryPage extends PageObject {

    @FindBy(name = "search")
    WebElementFacade search;

    @FindBy(name="go")
    WebElementFacade go;

    public void  buscarPalabra(String palabra)
    {
        search.type(palabra);
    }
    public void clickgo()
    {
        go.click();
    }
    public List<String> getDefinitions()
    {
        WebElementFacade definitions = find(By.tagName("ol"));
      //  System.out.println(definitions.findElements(By.tagName("li")).stream().map(WebElement::getText).collect(Collectors));
        return definitions.findElements(By.tagName("li")).stream().map(WebElement::getText).collect(Collectors.toList());
    }
}
