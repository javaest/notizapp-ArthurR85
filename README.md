[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/X2_4AfAh)
# Aufgabenstellung: Planung eines digitalen Notizbuchs für Mitarbeiter

## Projektbeschreibung
Die Mitarbeiter einer Firma wünschen sich ein digitales Notizbuch, das sowohl persönliche Notizen als auch Notizen zu Gruppen und Projekten speichert. Das Ziel dieses Notizbuchs ist es, die Effizienz und Zusammenarbeit der Mitarbeiter zu verbessern, indem Informationen zentral gespeichert und ausgetauscht werden können. Dabei sind folgende Funktionen und Anforderungen besonders wichtig:

- **Authentifizierung**: Das System muss eine sichere Authentifizierung bieten, um den Zugriff auf die Notizen zu schützen.
- **Rollenmanagement**: Das System muss unterschiedliche Benutzerrollen unterstützen, nämlich Admin, User und Group Leader. Jede Rolle hat spezifische Berechtigungen und Verantwortlichkeiten.
- **Gruppenmanagement**: Das System muss die Möglichkeit bieten, Benutzer verschiedenen Gruppen zuzuordnen. Notizen können dann innerhalb dieser Gruppen geteilt und verwaltet werden.

Diese Funktionen sollen sicherstellen, dass die Mitarbeiter effizient zusammenarbeiten können und dass alle relevanten Informationen sicher und strukturiert verfügbar sind.
## Vorbereitende Aufgabe
Informieren Sie sich online über **UML- Use Case Diagramme, User Stories und UML-Komponentendiagramme**.
## Aufgabenstellung

### 1. **UML- Use Case Diagramm erstellen**
Erstellen Sie ein UML-Use-Case-Diagramm, das die wichtigsten Funktionen des digitalen Notizbuchs darstellt. Berücksichtigen Sie dabei die folgenden Benutzer:
- **Admin**: Kann Benutzer verwalten, Notizen erstellen und löschen, sowie Gruppen verwalten.
- **Group Leader**: Kann Notizen in Gruppen erstellen und verwalten.
- **User**: Kann persönliche Notizen erstellen und innerhalb von Gruppen auf Notizen zugreifen.

Das Diagramm sollte auch die wichtigsten Use Cases wie "Login", "Notiz erstellen", "Notiz teilen", "Gruppen verwalten" usw. darstellen.

### 2. **User Stories formulieren**
Erstellen Sie zwei **User Stories**, die die Anforderungen aus der Perspektive der verschiedenen Benutzerrollen beschreiben. Beispiel:
- "Als Admin möchte ich Benutzer verwalten können, um die Rechte innerhalb des Systems zu kontrollieren."
- "Als Group Leader möchte ich Notizen mit meiner Gruppe teilen können, um die Zusammenarbeit zu fördern."

### 3. **UML- Komponentendiagramm erstellen**
Erstellen Sie ein UML-Komponentendiagramm, das die Architektur des digitalen Notizbuchs darstellt. Das Diagramm sollte folgende Komponenten enthalten:
- **Frontend (HTML)**: Die Benutzeroberfläche, über die der Benutzer mit dem System interagiert.
- **Backend (Spring Boot)**: Das Backend, das die Geschäftslogik und Authentifizierung mit JWT übernimmt.
- **Datenbank**: Eine MySQL- oder PostgreSQL-Datenbank zur Speicherung von Benutzerdaten, Notizen und Gruppenzugehörigkeiten.
- **JWT Authentifizierung**: Die Komponente, die die Authentifizierung und Autorisierung übernimmt.
### 4. **Weitere Implementierung**
Beschreiben Sie, welche weiteren Überlegungen und Diagramme nötigen sind, bevor mit der Implementierung begonnen werden kann

### 5. **Werkzeuge zur Erstellung der UML-Diagramme**
Verwenden Sie ein geeignetes Tool, um die UML-Diagramme zu erstellen (z.B. draw.io)

### 6. **Zusätzliche Anforderungen**
- Die Diagramme sollten klar und strukturiert sein.
- Achten Sie darauf, dass Sie alle relevanten Aspekte der Projektbeschreibung abdecken.

## Abgabekriterien
- Alle Diagramme müssen als Bild- oder PDF-Datei abgegeben werden.
- Die **User Stories** und **Use Case Diagramme** müssen logisch und vollständig sein.
