package javase03.t02.Resourсes;

import java.util.ListResourceBundle;

public class MyResources_en extends ListResourceBundle {
    @Override
    public Object[][] getContents() {
        return new Object[][]{
                {"RightOrder", "Images in right order: "},
                {"true", "true"},
                {"false", "false"},
                {"Locale", "Choose locale"},
                {"Rus", "Enter 1 to change locale to Russian"},
                {"Eng", "Enter 2 to change locale to English"},
                {"q0", "What is Java?"},
                {"q1", "What is JIT compiler?"},
                {"q2", "Is delete, next, main, exit or null keyword in java"},
                {"q3", "What if I write static public void instead of public static void?"},
                {"q4", "What is the default value of the local variables?"},
                {"u0", "Java is the high-level, object-oriented, robust, secure programming language, platform-independent, high performance, Multithreaded, and portable programming language. It was developed by James Gosling in June 1991. It can also be known as the platform as it provides its own JRE and API."},
                {"u1", "Just-In-Time(JIT) compiler: It is used to improve the performance. JIT compiles parts of the bytecode that have similar functionality at the same time, and hence reduces the amount of time needed for compilation. Here the term “compiler” refers to a translator from the instruction set of a Java virtual machine (JVM) to the instruction set of a specific CPU."},
                {"u2", "No."},
                {"u3", "The program compiles and runs correctly because the order of specifiers doesn't matter in Java."},
                {"u4", "The local variables are not initialized to any default value, neither primitives nor object references."},
                {"jcq", "The program contains 5 questions. Enter number of question (0-4) or 'exit' to quit the program"},
                {"NumberOfQuestion", "Question number: "},
                {"petc", "Press Enter to continue..."},
        };
    }
}
