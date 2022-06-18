package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.StepsDictionary;

@RunWith(SerenityRunner.class)
public class TestDictionary {
    @Steps
    StepsDictionary stepsDictionary;

    @Managed
    WebDriver driver;

    @Test
    public void testBuscarSignificado(){
        //STEP 1 ABRIR NAVEGADOR
        stepsDictionary.openBrowser();
        //STEP 2 BUSCAR TEXTO
        stepsDictionary.buscarSignificado("apple");
//STEP VERIFICAR RESULTADO
        stepsDictionary.shouldseeDefinitions("A common, ");

    }
}
