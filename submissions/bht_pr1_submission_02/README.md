# Übung 2 – Sportratgeber

![Photo by Julia Larson from Pexels](pexels-julia-larson-6456305.jpg)
 *https://www.pexels.com/photo/crop-sportive-couple-clasping-hands-in-gym-6456305/*

## Einleitung

Wir schreiben ein Programm, das als Unterhaltungsroboter funktioniert. Erst fragt der Roboter (d.h. unser Programm), wie der Ratsuchende (d.h. der menschliche Benutzer) heißt. Der Roboter grüßt den Ratsuchenden mit einem "Hallo" und mit dem Namen des Ratsuchendes. Dann stellt der Roboter Fragen und gibt Rat nach diesen Regeln:

```mermaid
flowchart TD
    Alter? -- 0 bis 15 --> Frag deine Eltern
```

## codeboard.io 

Rufen Sie das Codeboard zur [Übung 1 im Moodle-Kurs](TODO) auf. 

Falls Sie in Codeboard nicht eingeloggt sind, melden Sie sich bitte mit dem Codeboard-Account ein, den Sie in der [Übung 0](../bht_pr1_submission_00/README.md) angelegt haben.

## Aufgabe

Es existiert eine Datei `Main.java`. In dieser kein Code enthalten. In dieser Date implementieren Sie ihre Lösung.

* Benutzen Sie geschachteltes `if`/`else`  um den Ablauf der Entscheidungen zu steuern.
* Benutzen Sie `System.out.println()` um Fragen zu stellen und den Rat des Roboters in der Konsole auszugeben.
* Benutzen Sie `Scanner` um Eingaben vom Benutzer zu verarbeiten.
* Benutzen Sie `String.equals()` um auf die Antworten zu reagieren.

### Code Konventionsn / Stil

* Beachten Sie die Einrückung (_indentation_) des Codes
* Schreiben Sie genug Kommentare, damit Sie oder jemand anderes ihr Programm besser verstehen kann.
* Vergeben sie sinnvolle Variablennamen, die zum Verständnis des Programms beitragen.
* Kein Hard-Coding
* Räumen Sie den `Scanner` ordentlich auf.

## Hinweis für die Auto-Bewertung

* Alle Eingaben des Benutzers müssen so verarbeitet werden wie im Diagramm. Beispielsweise muss die Antwort "ja" oder "nein" exakt in dieser Schreibweise (Kleinbuchstaben) erwartet werden.
* Die finale/letzte Ausgabe in der Konsole muss exakt dem Text eines der gelben Kästen entsprehen.
* Wenn Sie `Test` in codeboard bestätigen, werden 3 Testfälle gerüft. Sie sollten Ihren Code gründlich für verschiedene Randfälle für die Eingaben des Benutzers prüfen, weil beim Submit weitere, gründlichere Tests exitieren, die Sie nicht sehen können.

Beine Beispiel Ausgabe ihres Programms könnte sein:
```
Wie heisst du?
Anna
Hallo, Anna!
Wie alt bist du, Anna?
20
Liebst du Aufregung?
nein
Hast du viel Zeit?
ja
Golf
```

---

<a href="https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
<img src="../pexels-sevenstorm-juhaszimrus-704767.jpg" width="100" height="100" alt="Photo by SevenStorm JUHASZIMRUS: https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
</a>

Ich wünsche Ihnen viel Spaß bei der Übung! 

