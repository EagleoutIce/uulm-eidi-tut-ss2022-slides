# EidI SS22 Uni Ulm --- Tutoriumsfolien

![latex](https://img.shields.io/badge/Made%20with-LaTeX-1f425f.svg) [![compile-slides](https://github.com/EagleoutIce/uulm-eidi-tut-ss2022-slides/actions/workflows/compile.yaml/badge.svg)](https://github.com/EagleoutIce/uulm-eidi-tut-ss2022-slides/actions/workflows/compile.yaml) ![maintenance](https://unmaintained.tech/badge.svg)

Dies sind die historisch gewachsenen LaTeX-Quellen für die Eidi-Tutoriums-Folien von Florian Sihler.
Diese Version hier ist eine aus dem Eidi-Repo extrahierte Quelle mit veränderter History und leicht modifizierten
Inhalten um Einzelpersonen anonym zu halten.

Andere Dateien wurden nachträglich entfernt und bleiben in der History, einfach nur weil, sie aus historischen Gründen keine Bedeutung mehr haben.

## 🐧Gimme

Die Folien finden sich hier durch die CI direkt im [Repository](https://github.com/EagleoutIce/uulm-eidi-tut-ss22-slides/tree/gh-pages/all_pdfs) (inklusive aller animierten Versionen).
Für die Schnellklicker:\
[<img src="https://github.com/EagleoutIce/uulm-eidi-tut-ss22-slides/blob/gh-pages/preview-01.png?raw=true" width="650"/>](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/eidi_tut_compact.pdf)

### Nicht animierte Versionen

Diese existieren in zwei Modi:
   * light: [org](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/eidi_tut_org-light.pdf), [0](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/eidi_tut_0-light.pdf).
   * dark: [org](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/eidi_tut_org-dark.pdf), [0](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/eidi_tut_0-dark.pdf).
### Animierte Versionen
[org](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/animated/eidi_tut_org.pdf),
[0](https://media.githubusercontent.com/media/EagleoutIce/uulm-eidi-tut-ss22-slides/gh-pages/all_pdfs/animated/eidi_tut_0.pdf).

## ⚒️ Build 'em yourself

Zum Kompilieren empfiehlt sich das Docker-Image. Basteln mit: `make docker`
Danach kann das Skript [`run-docker`](run-docker) verwendet werden (oder auf anderen Betriebssystemen ein vergleichbares Kommando zum Starten von Docker-Containern verwenden).

Sonst haben die Ordner folgende Bedeutung:

* `*-Tutorium`: Referenziert das Tutorium zum jeweiligen Blatt (sowie [`Org-Tutorium`](Org-Tutorium) für den Anfang :D)
* [`Dockerfile`](Dockerfile), [`rename-fb`](rename-fb) und [`run-docker`](run-docker): Damit es (hoffentlich) nicht nur bei mir läuft :D
* [`tikz-horner.sty`](tikz-horner.sty): Eine Altlast zum automatischen Generieren von Animationen für das Horner-Schema in LaTeX :D
* [`ttt.sty`](ttt.sty): Eine Semi-Altlast für Tic-Tac-Toe (brrrrh, Memories)
* [`makefile`](makefile): Wer weiß, was er tut, kann das auch direkt benutzen um seinen Spaß zu haben.
* [`global.src`](global.src): So etwas wie die gemeinsame Präambel aller Foliensätze. Zusammengetackert, damit es auch ohne ein ganzes Ökosystem funktioniert.

## 📜 Bonusfolien

Die Episoden und *manche* Boni sind auf Github:

* [Rekursion](https://github.com/EagleoutIce/Episode-Recursion)
* [Heaps](https://github.com/EagleoutIce/Episode-Heaps)
* [In-Place Merge-Sort](https://github.com/EagleoutIce/Episode-Inplace)
* [Traversierung](https://github.com/EagleoutIce/Episode-Traversierung)
* [Weihnachtswiederholung](https://github.com/EagleoutIce/christmas-eidi-recap)

Die Quellen für die Folien aus dem letzten Semester sind bereits öffentlich und finden sich [hier](https://github.com/EagleoutIce/uulm-eidi-tut-ws2021-22-slides).