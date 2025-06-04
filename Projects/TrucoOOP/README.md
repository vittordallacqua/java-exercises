# 🃏 TrucoOOP

A Java-based implementation of the traditional Brazilian card game **Truco**, emphasizing Object-Oriented Programming (OOP) principles.

---

## 🧩 Project Overview

**Purpose:**  
Simulate the card game Truco using Java, applying OOP concepts such as encapsulation, inheritance, and polymorphism to structure the game's components and logic.

**Technologies Used:**
- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)

---

## 🗂️ Project Structure

```
TrucoOOP/
├── src/
│ ├── model/
│ │ ├── Card.java
│ │ ├── Deck.java
│ │ ├── Player.java
│ │ └── Game.java
│ └── Main.java
├── resources/
│ └── game_rules.txt
└── README.md
```

### 💠 Main Components

- **`model/Card.java`**  
  Represents a playing card with attributes like suit and rank.

- **`model/Deck.java`**  
  Manages the deck of cards, including shuffling and dealing.

- **`model/Player.java`**  
  Defines player attributes and actions, such as playing a card or calling "Truco".

- **`model/Game.java`**  
  Contains the core game logic, managing rounds, scorekeeping, and enforcing rules.

- **`Main.java`**  
  Entry point of the application, initializing the game and handling user interactions.

- **`resources/game_rules.txt`**  
  Provides a textual description of the game's rules and instructions.

---

## 🎮 Gameplay Features

- **Card Dealing:**  
  Randomly shuffles and deals cards to players at the start of each round.

- **Turn-Based Play:**  
  Players take turns playing cards, with the game determining the winner of each hand.

- **Truco Calls:**  
  Implements the "Truco" challenge mechanism, allowing players to raise the stakes.

- **Score Tracking:**  
  Keeps track of each player's score, determining the winner when a player reaches the target score.

- **Rule Enforcement:**  
  Ensures that all game rules are followed, including valid card plays and responses to "Truco" calls.

---

## 🧪 How to Run the Project

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/vittordallacqua/SoftwareDevelpment-OOP.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd SoftwareDevelpment-OOP/Projects/TrucoOOP
   ```

3. **Compile the Java Files:**
   ```bash
   javac src/**/*.java
   ```

4. **Run the Application:**
   ```bash
   java -cp src Main
   ```

---

## 📌 Technical Notes

- The project is structured using OOP principles, with separate classes for different game components, promoting modularity and reusability.

- The game interacts with the user via the console, prompting for inputs and displaying game states.

- The codebase is designed to be extensible, allowing for future enhancements such as GUI integration or networked multiplayer support.

---

## 📎 License

This project is intended for educational purposes and does not have a specified license.

 





