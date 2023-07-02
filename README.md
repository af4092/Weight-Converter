# Weight-Converter
Weight Conversion app built on Maven Eclipse Window builder, (kg, lb, oz, gr)

- Simple app which converts kg, lb, oz, gr - Kilogram, Pound, Ounce, Gram. Conversion wokrs among privously mentioned weight parameters, it works in any way.

<p align="center">
  <img src="3https://user-images.githubusercontent.com/24220136/226058594-c5d517f9-2288-41a5-bfcb-adcc616ef10a.png" alt="Image">
</p>

## [Implementation](https://github.com/af4092/Weight-Converter/blob/main/WeightConversionMaven/src/main/java/WeightConversionPCK/Main.java)

- The code represents a simple template for a Java Swing application. Here's how the code works:
- The code includes a package called `WeightConversionPCK`, which likely contains the classes related to the weight conversion functionality.
- The code includes a class called `Main` in the `WeightConversionPCK` package. This class serves as the entry point for the application.
- In the `Main` class, the `main` method is defined. This method is the starting point of the application. It uses the `EventQueue.invokeLater` method to schedule the execution of a `Runnable` object on the Event Dispatch Thread (EDT). The EDT is responsible for handling GUI events in Swing applications.
- Within the `run` method of the `Runnable` object, an instance of the `UI` class is created. This suggests that there is a class named `UI` which likely represents the graphical user interface (GUI) of the weight conversion application.
- The `UI` frame is set visible, which means the GUI window will be displayed to the user.
- If an exception occurs during the execution, it is caught in the `catch` block and a stack trace is printed.
