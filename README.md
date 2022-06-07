# Generics Lab

## Learning Goals

- Create and work with static generic method

## Introduction

You'll be solving two problems to understand generics better. There are starter
code samples in this lab's repository.

## Convert generic array to String array

Declare a static method called `convertToString` that accepts a generic array
and returns the elements of the input array as a String.

Sample runner class:

```java
public class StringRunner {
    public static void main(String[] args) {
        Integer[] inputInt = {1, 2, 3};
        String[] inputStr = {"Cake", "Donut", "Cupcake"};

        System.out.println(Problem.convertToString(inputInt));
        System.out.println(Problem.convertToString(inputStr));
    }
}
```

Sample output:

```java
[1, 2, 3]
[Cake, Donut, Cupcake]
```

Here is the full solution for reference:

```java
class Problem {
    static <E> String convertToString(E[] array) {
        return Arrays.toString(array);
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] inputInt = {1, 2, 3};
        String[] inputStr = {"Cake", "Donut", "Cupcake"};

        System.out.println(Problem.convertToString(inputInt));
        System.out.println(Problem.convertToString(inputStr));
    }
}
```

## Return the first element of a generic array

Building on the same foundation as the previous lab, declare a static method
called `getFirstElement` that accepts a generic array and returns the first
element of the input array or `null` if the array is empty.

Sample runner class:

```java
public class FirstElement {
    public static void main(String[] args) {
        Integer[] inputInt = {1, 2, 3};
        Integer[] inputEmpty = new Integer[5];
        String[] inputStr = {"Cake", "Donut", "Cupcake"};

        System.out.println(Problem.getFirstElement(inputInt));
        System.out.println(Problem.getFirstElement(inputEmpty));
        System.out.println(Problem.getFirstElement(inputStr));
    }
}
```

Sample output:

```java
1
null
Cake
```
