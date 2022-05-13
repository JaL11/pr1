# Übung 4 – Flexing mit Datentypen, if/else, Schleifen und Arrays

![Photo by Pixabay](pexels-pixabay-260352.jpg)
 *https://www.pexels.com/photo/bodybuilding-close-up-dumbbells-equipment-260352/*

## Einleitung

Wir üben in vier verschiedenen, kleinen Aufgaben unsere Fähigkeiten in Java. Dabei verwenden wir alles, was wir bisher gelernt haben (Datentypen, if/else, Schleifen, Arrays).

### Gerade Zahlen in einem Array zählen

Gegeben einem int-Array, geben Sie die Anzahl der geraden Werte im angegebenen Array in der Konsole aus. 
Hinweis: Der `%` "mod" Operator berechnet den Rest, z.B. `5 % 2` ist `1`.
      
Beispiele:
* countEvens([2, 1, 2, 3, 4]) -> `3`
* countEvens([2, 2, 0]) -> `3`
* countEvens([1, 3, 5]) -> `0`

### Prüfen ob Array keine 1er oder 3er enthält

Gegeben einem int-Array, geben Sie `true` auf der Konsole aus, wenn das Array keine 1en (einsen) und keine 3en (dreien) enthält. Ansonsten geben Sie `false` auf der Konsole aus.

Beispiele:
* lucky13([0, 2, 4]) -> `true`
* lucky13([1, 2, 3]) -> `false`
* lucky13([1, 2, 4]) -> `false`

### FizzBuzz

Gegeben ein int-Array, geben Sie den Inhalt des Arrays auf der Konsole aus, mit folgenden Ausnahmen:
* Fuer Vielfache von 3, geben Sie `Fizz` aus anstelle der Zahl.
* Fuer Vielfache von 5, geben Sie `Buzz` aus anstelle der Zahl.
* Und fuer Vielfache von 3 und 5 geben Sie `FizzBuzz` anstelle der Zahl aus.
      
* Trennen Sie die Elemente in der Konsolte mit einem Komma `,` und einem anschliessenden Leerzeichen.
* Beim letzten Element lassen sie das Komma und das Leerzeichen weg.

Beispiele: 
* fizzBuzz([1, 2, 3, 4, 5]) -> `1, 2, Fizz, 4, Buzz`
* fizzBuzz([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]) -> `1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16`

### Palindrome erkennen

Ein Palindrom ist ein String, der vorwärts wie rückwärts gelesen identisch ist. Zum Beispiel sind hier Palindrome:
 * "step on no pets"
 * "murder for a jar of red rum"
 * "I did, did I?"
        
Regeln:
* Leerzeichen (" ") werden ignoriert.
* Fragezeichen ("?") werden ignoriert.
* Kommata (",") werden ignoriert.
* Ein leerer String ("") ist kein Palindrom.
           
Gegeben einem String-Array, geben Sie `true` auf der Konsole aus, wenn die Zeichen im Array ein Palindrom bilden. Ansonsten geben Sie `false` auf der Konsole aus.

## codeboard.io 

Rufen Sie das Codeboard zur [Übung 4 im Moodle-Kurs](https://lms.bht-berlin.de/mod/lti/view.php?id=903665) auf. 

Falls Sie in Codeboard nicht eingeloggt sind, melden Sie sich bitte mit dem Codeboard-Account ein, den Sie in der [Übung 0](../bht_pr1_submission_00/README.md) angelegt haben.

## Aufgabe

Es existiert eine Datei `Main.java`. Beachten Sie folgende Hinweise:

* Neben der `main` existieren in dieser Datei die weiteren Methoden `countEvens`, `lucky13`, `fizzBuzz` und `palindrome`. Ihre Implementation schreiben Sie in der jeweiligen Methode.
* Jede dieser Methoden hat einen Eingabewert, z.B. `int[] input`. Dieser Wert dient als Eingabe, die Sie verarbeiten müssen. Beispiel:

```java
public static void countEvens(int[] nums) {
  // ...      
}
```

* In der jeweiligen Aufgabe müssen Sie ihre Antwort auf Basis des Eingabewerts in der Konsole ausgeben:

```java
public static void countEvens(int[] nums) {
  // Ihre Lösung berechnen ...

  // Ihre Lösung berechnen ausgeben
  System.out.println("_meine_loesung_");
}
```

---


### Code Konvention / Stil

* Beachten Sie die Einrückung (_indentation_) des Codes
* Schreiben Sie genug Kommentare, damit Sie oder jemand anderes ihr Programm besser verstehen kann.
* Vergeben sie sinnvolle Variablen-Namen, die zum Verständnis des Programms beitragen.
* "Hard-Coden" Sie keine Lösungen.

## Hinweis für die Auto-Bewertung

* Wenn Sie den Schalter `Test` in codeboard betätigen, werden einige wenige Testfälle gerüft. Sie sollten Ihren Code aber gründlich für verschiedene Randfälle von Eingaben des Benutzers prüfen, weil beim `Submit` weitere, gründlichere Tests exitieren, die Sie nicht sehen können.

---

<a href="https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
<img src="../pexels-sevenstorm-juhaszimrus-704767.jpg" width="100" height="100" alt="Photo by SevenStorm JUHASZIMRUS: https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
</a>

Ich wünsche Ihnen viel Spaß bei der Übung! 

