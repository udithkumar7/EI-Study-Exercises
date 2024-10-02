Coding Assignment by Sana udith kumar About Me I am currently pursuing my final year in BTech in Computer communication engineering. My interests lie in Data structures, Database management system, java,sql which have motivated me to acquire various technical skills.
# Design Patterns in Java

## Overview
This repository contains implementations of various design patterns in Java. The following patterns are included:

1. Observer Pattern
2. Strategy Pattern
3. Singleton Pattern
4. Factory Pattern
5. Adapter Pattern
6. Composite Pattern

Each design pattern is demonstrated with a use case, code structure, and instructions on how to run the examples.

---

## 1. Observer Pattern

### Description
The Observer Pattern defines a one-to-many dependency between objects. When one object (the subject) changes its state, all registered observers are notified and updated automatically.

### Use Case
This example simulates a weather monitoring system where `WeatherStation` (the subject) notifies `MobileApp` and `WebApp` (the observers) about temperature changes.

### Code Overview
- **WeatherSubject**: Interface for the subject.
- **WeatherStation**: Concrete subject maintaining a list of observers.
- **WeatherObserver**: Interface for observers.
- **MobileApp** and **WebApp**: Concrete observers.

### How to Run
1. Compile the code.
2. Run the `ObserverPatternDemo` class.

---

## 2. Strategy Pattern

### Description
The Strategy Pattern enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

### Use Case
This example illustrates a payment processing system allowing users to choose different payment methods (Credit Card, PayPal) at checkout.

### Code Overview
- **PaymentStrategy**: Interface for payment methods.
- **CreditCardPayment** and **PayPalPayment**: Concrete strategies.
- **ShoppingCart**: Context class using a payment strategy.

### How to Run
1. Compile the code.
2. Run the `StrategyPatternDemo` class.

---

## 3. Singleton Pattern

### Description
The Singleton Pattern ensures a class has only one instance and provides a global point of access to it. It is useful for managing shared resources like database connections.

### Use Case
This example illustrates a database connection manager that restricts instantiation to a single object.

### Code Overview
- **DatabaseConnection**: Singleton class managing the database connection.

### How to Run
1. Compile the code.
2. Run the `SingletonPatternDemo` class.

---

## 4. Factory Pattern

### Description
The Factory Pattern provides an interface for creating objects but allows subclasses to alter the type of created objects.

### Use Case
This example demonstrates a shape factory that creates different types of shapes (Circle, Rectangle) based on user input.

### Code Overview
- **Shape**: Product interface.
- **Circle** and **Rectangle**: Concrete products.
- **ShapeFactory**: Factory class responsible for creating shape objects.

### How to Run
1. Compile the code.
2. Run the `FactoryPatternDemo` class.

---

## 5. Adapter Pattern

### Description
The Adapter Pattern allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.

### Use Case
This example shows a media player that can play various audio formats, using an adapter for new formats (VLC, MP4).

### Code Overview
- **MediaPlayer**: Target interface for playing media.
- **AdvancedMediaPlayer**: Interface for advanced media formats.
- **VlcPlayer** and **Mp4Player**: Concrete classes.
- **MediaAdapter**: Adapter class for using advanced media players.
- **AudioPlayer**: Context class using the adapter.

### How to Run
1. Compile the code.
2. Run the `AdapterPatternDemo` class.

---

## 6. Composite Pattern

### Description
The Composite Pattern allows composing objects into tree structures to represent part-whole hierarchies.

### Use Case
This example illustrates a file system where files and folders can be treated uniformly.

### Code Overview
- **FileSystem**: Component interface.
- **File**: Leaf class for individual files.
- **Folder**: Composite class representing folders containing files or other folders.

### How to Run
1. Compile the code.
2. Run the `CompositePatternDemo` class.

---

## Conclusion
This project serves as a practical demonstration of various design patterns in Java, showcasing their utility and implementation in real-world scenarios. Feel free to explore each pattern's code and understand its application.
