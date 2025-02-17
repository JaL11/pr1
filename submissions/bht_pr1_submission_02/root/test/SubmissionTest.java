import static org.junit.Assert.*;
import org.junit.*;

/*
  Please do not edit this file. Edit Main.java to submit your assignment!
*/
public class SubmissionTest {

    @Before
    public final void setup() {
        Tester.initialize();
    }

    @Test
    public final void shouldAskParents() {
        Tester.prepareInput("Anna\n12\n");
        Main.main(null);
        Tester.containsText(
            "Fall 1: Anna, 12 -> sollte Eltern fragen",

            "Wie heisst du?",
            "Hallo, Anna!",
            "Wie alt bist du, Anna?",
            "Frag deine Eltern"
        );
    }

    @Test
    public final void shouldSkydive() {
        Tester.prepareInput("Bob\n22\nja\nnein\n");
        Main.main(null);
        Tester.containsText(
            "Fall 2: Bob, 22, keine Aufregung, nicht in einer Gruppe -> Fallschirmspringen",

            "Wie heisst du?",
            "Hallo, Bob!",
            "Wie alt bist du, Bob?",
            "Liebst du Aufregung?",
            "Machst du gerne Sport in einer Gruppe?",
            "Fallschirmspringen"
        );
    }

    @Test
    public final void shouldHandball() {
        Tester.prepareInput("Dieter\n22\nja\nja\n");
        Main.main(null);
        Tester.containsText(
            "Fall 2: Dieter, 22, liebt Aufregung, in einer Gruppe -> Handball",

            "Wie heisst du?",
            "Hallo, Dieter!",
            "Wie alt bist du, Dieter?",
            "Liebst du Aufregung?",
            "Machst du gerne Sport in einer Gruppe?",
            "Handball"
        );
    }

    @Test
    public final void shouldYoga() {
        Tester.prepareInput("Carla\n32\nnein\n");
        Main.main(null);
        Tester.containsText(
            "Fall 3: Carla, 32, liebt keine Natur -> Yoga",

            "Wie heisst du?",
            "Hallo, Carla!",
            "Wie alt bist du, Carla?",
            "Liebst du die Natur?",
            "Yoga"
        );
    }

}
