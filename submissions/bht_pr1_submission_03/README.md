# Übung 3 – NotenUmwandler

![Photo by Julia Larson from Pexels](pexels-andy-barbour-6684372.jpg)
 *https://www.pexels.com/@andy-barbour/*

## Einleitung

Wir schreiben noch einen Roboter, der numerische Noten je nach Notensystem in textuelle Benotungen unwandelt. Die Tabelle unten stellt die Umwandlungen dar:

| Gymnasium | Hochschule | Textuelle Benotung |
| ----------| -----------|--------------------|
| 15        |            | ausgezeichnet      |
| 14 13     | 1,0 1,3    | sehr gut           |
| 12 11 10  | 1,7 2,0 2,3| gut                |
|  9  8  7  | 2,7 3,0 3,3| befriedigend       |
|  6  5     | 3,7 4,0    | ausreichend        |
|  4  3  2 1| 5,0        | mangelhaft         |

Der Roboter fragt den Benutzer erst nach dem Notensystem. Danach fragt der Roboter nach der Note. Am Ende sagt der Roboter die entsprechende textuelle Benotung.

Beispielsweise sind hier mögliche Abläufe des Programms:

```
Welches Notensystem?
Gymnasium
Welche Note (z.B. 10)?
12
gut
```

```
Welches Notensystem?
Hochschule
Welche Note (z.B. 1,0)?
2,7
befriedigend
```

Wenn der Benutzer mit einer falschen Note antwortet, sagt der Roboter “Falsche Eingabe”, z.B.:

```
Welches Notensystem?
Gymnasium
Welche Note (z.B. 10)?
100
Falsche Eingabe
```

Wir wollen noch ein Easter-Egg1 (Ein Easter-Egg in einem Computer-Spiel ist eine lustige Überraschung, die auftaucht, nur wenn der Spieler eine bestimmte aber geheime Eingabe macht.) einbauen! Wenn der Benutzer mit 42 als Note antwortet, sagt der Roboter `Don’t panic!` (siehe siehe https://en.wikipedia.org/wiki/Phrases_from_The_Hitchhiker%27s_Guide_to_the_Galaxy#D on’t_Panic), bevor er weiter “Falsche Eingabe” sagt, z.B.:

```
Welches Notensystem?
Gymnasium
Welche Note (z.B. 10)?
42
Don't panic!
Falsche Eingabe
```

## codeboard.io 

Rufen Sie das Codeboard zur [Übung 3 im Moodle-Kurs](https://lms.bht-berlin.de/mod/lti/view.php?id=898728) auf. 

Falls Sie in Codeboard nicht eingeloggt sind, melden Sie sich bitte mit dem Codeboard-Account ein, den Sie in der [Übung 0](../bht_pr1_submission_00/README.md) angelegt haben.

## Aufgabe

Es existiert eine Datei `Main.java`. Beachten Sie folgende Hinweise:

* Bei dieser Übung dürfen Sie ***kein if-else*** benutzen. Die `switch` Anweisung reicht für die Umsetzung.
* Für den Fall '*Gymnasium*', machen Sie das `switch` über eine `int`-Variable. Hinweis: Sie sollten die Note schon als `int` behandeln.
* Für den Fall '*Hochschule*', machen Sie das `switch` über eine `String`-Variable. Hinweis: Sie sollten die Note schon als `String` behandeln.
* Das *Easter-Egg* muss für beide Notensysteme funktionieren.

---


### Code Konvention / Stil

* Beachten Sie die Einrückung (_indentation_) des Codes
* Schreiben Sie genug Kommentare, damit Sie oder jemand anderes ihr Programm besser verstehen kann.
* Vergeben sie sinnvolle Variablen-Namen, die zum Verständnis des Programms beitragen.
* "Hard-Coden" Sie keine Lösungen.

## Hinweis für die Auto-Bewertung

* Alle Eingaben des Benutzers müssen so verarbeitet werden wie in der Tabelle (siebe weiter oben). Beispielsweise muss das Wort `Gymnasium` mit einem großen `G`, statt `gymnasium` mit einem kleinen `g` erwartet werden.

* Die Ausgaben in der Konsole müssen exakt dem Text in den Beispielen entsprechen.

* Wenn Sie den Schalter `Test` in codeboard betätigen, werden einige wenige Testfälle gerüft. Sie sollten Ihren Code aber gründlich für verschiedene Randfälle von Eingaben des Benutzers prüfen, weil beim `Submit` weitere, gründlichere Tests exitieren, die Sie nicht sehen können (über 15 weitere Tests).

---

<a href="https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
<img src="../pexels-sevenstorm-juhaszimrus-704767.jpg" width="100" height="100" alt="Photo by SevenStorm JUHASZIMRUS: https://www.pexels.com/photo/123-let-s-go-imaginary-text-704767/">
</a>

Ich wünsche Ihnen viel Spaß bei der Übung! 

