# Übung 6 – Umschlag drucken

![Photo by Diana Light](pexels-diana-light-4721999.jpg)
 *https://www.pexels.com/photo/beige-envelopes-on-symmetrical-positioning-4721999/*

## Einleitung

Schreiben Sie ein Programm, welches einen Umschlag mit Absender un Empfänger auf der Konsole ausgibt. Ein Beispiel-Ergebnis sieht folgermaßen aus:

```
+----------------------------------------------------------+
|                                                          |
|   Max Mustermann                                         |
|   Mustertr. 42                                           |
|   14242 Musterstadt                                      |
|                                                          |
|                                         Anna Jung        |
|                                         Spass-Str. 123   |
|                                         13353 Berlin     |
|                                                          |
+----------------------------------------------------------+
```

Die Ausmaße des Umschlags sind nicht statisch. Folge Werte sind dynamisch und änderbar:
- Breite (`width`)
- Innenabstand (`padding`)
- Das Zeichen für Freiflächen im Briefumschlag (z.B. ein Leerzeichen ` `)
- Das Zeichen für den Rahmen (vertikal und horizontal), z.B. `|` und `-`
- Das Zeichen für die Kanten des Briefumschlags (z.B. `+`)

Beispiel:

```
spaceChar = " ";
width = 50;
padding = 5;
borderHorizontalChar = "@";
borderVerticalChar = "=";
cornerChar = "O";

printEnvelope(
    "Max Mustermann", "Mustertr. 42", "14242 Musterstadt", 
    "Anna Lena Altmeier", "Spass-Str. 123", "13353 Berlin"
);
```

ergibt folgenden Briefumschlag:

```
O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O
=                                                =
=     Max Mustermann                             =
=     Mustertr. 42                               =
=     14242 Musterstadt                          =
=                                                =
=                         Anna Lena Altmeier     =
=                         Spass-Str. 123         =
=                         13353 Berlin           =
=                                                =
O@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@O
```

Ein besonderer Augenmerk wird auf den Innenabstand (`padding`) gelegt. Für den Absender (links-oben auf dem Briefumschlag) ist dies der linke Abstand zum Rand. Für den Empfänger (rechts-unten auf dem Briefumschlag) ist dies aber der ***rechte*** Abstand. Dabei bleiben die drei Zeilen des Empfängers linksbündig. Im folgenden Beispiel sind die Abstände durch Punkte (`.`) visualisiert:

```
+----------------------------------------------------------+
|                                                          |
|...Max Mustermann                                         |
|...Mustertr. 42                                           |
|...14242 Musterstadt                                      |
|                                                          |
|                                         Anna Jung     ...|
|                                         Spass-Str. 123...|
|                                         13353 Berlin  ...|
|                                                          |
+----------------------------------------------------------+
```

Erhöht man den Innenabstand, so verändert sich die Darstellung:

```
padding = 5;

printEnvelope(
    "Max Mustermann", "Mustertr. 42", "14242 Musterstadt", 
    "Anna Lena Altmeier", "Spass-Str. 123", "13353 Berlin"
);
```

ergibt

```
+----------------------------------------------------------+
|                                                          |
|.....Max Mustermann                                       |
|.....Mustertr. 42                                         |
|.....14242 Musterstadt                                    |
|                                                          |
|                                       Anna Jung     .....|
|                                       Spass-Str. 123.....|
|                                       13353 Berlin  .....|
|                                                          |
+----------------------------------------------------------+
```

wobei die Punkte nur zu Anschauungszwecken gezeichnet sind.

## codeboard.io 

Rufen Sie das Codeboard zur [Übung 5 im Moodle-Kurs](https://lms.bht-berlin.de/mod/lti/view.php?id=910330 ) auf. 

Falls Sie in Codeboard nicht eingeloggt sind, melden Sie sich bitte mit dem Codeboard-Account ein, den Sie in der [Übung 0](../bht_pr1_submission_00/README.md) angelegt haben.

## Aufgabe

Es existiert eine Datei `Main.java` mit einigen Variablen, die die Darstellung des Briefumschlags steuern. Die Testfälle, die bei `Submit` ausgeführt werden, ändern diese Werte um Ihren Code zu testen:

```
public class Main {
    public static int width = 60;
    public static int border = 2;
    public static int padding = 3;
    
    public static String spaceChar = " ";
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+";
    public static String lineBreak = "\n";

[...]
```

In der `Main.java` sind vier überladene Methoden mit dem Namen `printEnvelope` enthalten, die Sie bitte ausprogrammieren. Denken Sie daran, dass Sie so wenig wie möglich Code duplizieren. Methoden können sich gegenseitig aufrufen.

```
[...]

public static void printEnvelope() { }

public static void printEnvelope(String fromName, String toName) { }

public static void printEnvelope(String fromName, String fromAddress, String toName, String toAddress) { }

public static void printEnvelope(String fromName, String fromAddress, String fromZipCodeAndCity, String toName, String toAddress, String toZipCodeAndCity) { }
```

- Versuchen Sie bei Ihrer Implementation kein Hard-Coding zu machen. Zum Beispiel sollten die oben genannten Variablen (z.B. `spaceChar`) benutzt werden. 
- Auch sollte die Breite des Briefumschlags, sowie der Innenabstand variabel/dynamisch änderbar sein. Dazu sollten Sie die Variablen `width` und `padding`
- Die Länge eines Strings erhalten Sie mit `myVariableName.length()`
- Verändern Sie die Variablen in der `Main.java`, um die verschiedenen Auswirkungen zu testen.

---


### Code Konvention / Stil

* Beachten Sie die Einrückung (_indentation_) des Codes
* Schreiben Sie genug Kommentare, damit Sie oder jemand anderes ihr Programm besser verstehen kann.
* Vergeben sie sinnvolle Variablen-Namen, die zum Verständnis des Programms beitragen.
* "Hard-Coden" Sie keine Lösungen.

## Hinweis für die Auto-Bewertung

* Wenn Sie den Schalter `Test` in codeboard betätigen, werden einige wenige Testfälle gerüft. 
* Sie sollten Ihren Code aber gründlich für verschiedene Randfälle von Eingaben des Benutzers prüfen. In dieser Übung gibt es keine weiteren Extra-Tests, die bei `Submit` ausgeführt werden. Sie können also alle Tests sehen, mit denen Sie 100% der Punkte erreichen können.

---

<a href="https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
<img src="../pexels-sevenstorm-juhaszimrus-704767.jpg" width="100" height="100" alt="Photo by SevenStorm JUHASZIMRUS: https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
</a>

Ich wünsche Ihnen viel Spaß bei der Übung! 

