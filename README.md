# Kotlin_Practice

Welcome to my Kotlin Basics Practice repository! This repository contains simple Kotlin programs that I've written to practice and improve my Kotlin programming skills.

## Contents

- [Basic Calculator](src/main/kotlin/Calculator.kt): A simple calculator program using `if`-`else` statements to perform basic arithmetic operations.
- (Add descriptions of other files or programs as you add them)

## Getting Started

To run any of the Kotlin programs in this repository, you'll need to have the Kotlin compiler installed on your machine. Follow the instructions below to get started:

### Prerequisites

- [Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)

### Running the Programs

1. Clone the repository:
    ```sh
    git clone https://github.com/Sabbir45ali/Kotlin_practice.git
    cd Kotlin_practice
    ```

2. Navigate to the directory containing the Kotlin file you want to run.

3. Compile the Kotlin file:
    ```sh
    kotlinc filename.kt -include-runtime -d filename.jar
    ```

4. Run the compiled program:
    ```sh
    java -jar filename.jar
    ```

### Example

To run the basic calculator program:

```sh
cd src/main/kotlin
kotlinc Calculator.kt -include-runtime -d Calculator.jar
java -jar Calculator.jar
