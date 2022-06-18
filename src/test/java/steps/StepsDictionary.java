package steps;

import net.thucydides.core.annotations.Step;
import page.DictionaryPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class StepsDictionary {
    DictionaryPage dictionaryPage;
    @Step
    public void openBrowser(){dictionaryPage.open();}

    @Step
    public void buscarPalabra(String palabra){dictionaryPage.buscarPalabra(palabra);}

    @Step
    public void clickGo(){dictionaryPage.clickgo();}

    @Step
    public void buscarSignificado(String palabra)
    {
        buscarPalabra(palabra);
        clickGo();
    }
    @Step
    public void shouldseeDefinitions(String definition)
    {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));

    }
}
