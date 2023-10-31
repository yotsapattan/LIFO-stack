# Stack Implementation - Source Code

This repository contains Java source code for a generic `Stack` class.

## Table of Contents

1. [Introduction](#introduction)
2. [Usage](#usage)
3. [Class Details](#class-details)
4. [Example Usage](#example-usage)
5. [Contributing](#contributing)
6. [License](#license)

## Introduction

The `Stack` class is a generic implementation of a stack data structure. It extends the `ArrayList` class to provide stack-specific functionalities.

## Usage

To use the `Stack` class, you need to have the following:

1. **Java Environment**: Ensure you have a Java runtime environment installed on your system.

2. **Incorporating Stack Class**: Include the `Stack` class in your project.

## Class Details

The `Stack` class provides the following methods:

- `push(D object)`: Pushes an element onto the stack.
- `pop()`: Pops and returns the top element from the stack.
- `peek()`: Returns the top element from the stack without removing it.
- `toArray()`: Converts the stack to an array.
- `toString()`: Returns a string representation of the stack.

## Example Usage

```java
public class MyApplication {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>(5); // Create a stack with a capacity of 5
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        System.out.println("Peek: " + myStack.peek()); // Output: 30
        
        System.out.println("Pop: " + myStack.pop()); // Output: 30
        
        System.out.println("Stack Contents:");
        System.out.println(myStack.toString());
    }
}
```

## Contributing

If you find any issues or have suggestions for improvement, please feel free to open an issue or create a pull request.

## License

This source code is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
