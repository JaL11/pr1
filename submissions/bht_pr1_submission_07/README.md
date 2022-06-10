# Übung 7 – Serienbrief für Studenten

![Photo by Diana Light](../bht_pr1_submission_06/pexels-diana-light-4721999.jpg)
 *https://www.pexels.com/photo/beige-envelopes-on-symmetrical-positioning-4721999/*

## Einleitung

In dieser Übung erstellen Sie einen Serienbrief für Studenten. Dabei verwenden Sie Teile Ihres Codes aus der letzten wieder. Der Absender des Briefs ist in dieser Übung immer die BHT. Der Empfänger ist ein Student. Ein Beispiel für eine Ausgabe:

```
+----------------------------------------------------------+
|                                                          |
|   BHT Berlin                                             |
|   Luxemburger Str. 10                                    |
|   13353 Berlin                                           |
|                                                          |
|                                        John Doe          |
|                                        Doestreet 42      |
|                                        12212 Fancytown   |
|                                                          |
+----------------------------------------------------------+
```

Wenn mehrere Studenten den Brief erhalten sollten, entsteht ein Serienbrief. Ein Beispiel für eine Ausgabe mit zwei Briefen:

```
+----------------------------------------------------------+
|                                                          |
|   BHT Berlin                                             |
|   Luxemburger Str. 10                                    |
|   13353 Berlin                                           |
|                                                          |
|                                        John Doe          |
|                                        Doestreet 42      |
|                                        12212 Fancytown   |
|                                                          |
+----------------------------------------------------------+
+----------------------------------------------------------+
|                                                          |
|   BHT Berlin                                             |
|   Luxemburger Str. 10                                    |
|   13353 Berlin                                           |
|                                                          |
|                                       Bessie Clemente    |
|                                       Wilson Avenue 40   |
|                                       75081 Texas        |
|                                                          |
+----------------------------------------------------------+
```


## codeboard.io 

Rufen Sie das Codeboard zur [Übung 7 im Moodle-Kurs](https://lms.bht-berlin.de/mod/lti/view.php?id=910330 ) auf. 

Falls Sie in Codeboard nicht eingeloggt sind, melden Sie sich bitte mit dem Codeboard-Account ein, den Sie in der [Übung 0](../bht_pr1_submission_00/README.md) angelegt haben.

## Aufgabe

Das codeboard-projekt enthält bereits drei Klassen:
* `Student.java` ist eine Klasse die einen Studenten repräsentiert
* `Envelope.java` ist eine Klasse die einen Brief repräsentiert
* `Main.java` enthält (wie üblich) unsere Main-Methode, die bei Programmstart aufgerufen wird. In der Main-Methode werden zwei `Student` Objekte erzeugt und einem `Envelope` Objekt zum drucken übergeben.


### Student

* Die `Student` Klasse muss von Ihnen implementiert werden. 
* Es existiert bereits ein Konstruktor mit allen Parametern, die in Klassen-Attribute gespeichert werden müssen
* Schreiben Sie auch für jedes Attribut einen Getter

### Envelope

* `Envelope` enthält eine Methode, die Sie implementieren müssen:

```
public void printEnvelope(Student[] toStudents) {
   // ...     
}
```

* Hierbei ist Ihre Lösung aus der Übung 6, die in der Methode `public static void printEnvelope(String, String, String, String, String, String)` steht, in großen Teilen wiederverwendbar. In dieser Aufgabe ist jedoch der Parameter der Methode ein Array vom Typ `Student` (siehe `Stundent[] toStudents`).

---


### Code Konvention / Stil

***In dieser Übung speziell***
* Verwenden Sie kein `static` bei Methoden oder Attributen, wenn es nicht notwendig ist.
* Halten Sie möglichst alle Attribute `private`, bis Sie einen Grund haben es `public` zu machen. 
* Getter für private Attribute sind besser, als ein Attribut public zu machen.

***Generell***
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

