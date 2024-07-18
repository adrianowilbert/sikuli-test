package my.sikuli.example.tests;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import my.sikuli.example.suites.AllSuites;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.sikuli.script.*;

public class MySikuliTest {

    @Test
    @Category(AllSuites.class)
    @DisplayName("Teste 9 + 9")
    @Description("Deve retornar valor 18 Quando somado 9 + 9")
    public void calc9Plus9() throws FindFailed {
        ImagePath.add(System.getProperty("user.dir"));

        String pathYourSystem = System.getProperty("user.dir");
        System.out.println(pathYourSystem);

        final Screen screen = new Screen();
        screen.initScreen(screen);

        Pattern btn9Img = new Pattern("src\\images\\numbers\\num09.png");
        Pattern calcImg = new Pattern("src\\images\\calculations\\calc9+9.png");
        Pattern igualImg = new Pattern("src\\images\\expressions\\equal.png");
        Pattern resultImg = new Pattern("src\\images\\results\\result18.png");
        Pattern somaImg = new Pattern("src\\images\\expressions\\sum.png");

        // Abre a calculadora
        App calculator = new App("C:\\Windows\\System32\\calc.exe");
        calculator.open();
        System.out.println(">>> Open calculator");

        // Clica no botão "9"
        screen.wait(btn9Img, 1000);
        screen.click();
        System.out.println(">>> Click in button (9)");

        // Clica no botão "+"
        screen.wait(somaImg, 1000);
        screen.click();
        System.out.println(">>> Click in button (+)");

        // Clica no botão "9"
        screen.wait(btn9Img, 1000);
        screen.click();
        System.out.println(">>> Click in button (9) again");

        // Clica no botão "="
        screen.wait(igualImg, 1000);
        screen.click();
        System.out.println(">>> Click in button (=)");

        // Valida a expressão do cálculo
        screen.wait(calcImg, 1000);
        System.out.println(">>> Validate expression (9+9=)");

        // Valida o resultado
        screen.find(resultImg);
        System.out.println(">>> Validate result (18)");

        // Fecha a calculadora
        screen.type(Key.F4, KeyModifier.ALT);
        System.out.println(">>> Close calculator");

    }

}
