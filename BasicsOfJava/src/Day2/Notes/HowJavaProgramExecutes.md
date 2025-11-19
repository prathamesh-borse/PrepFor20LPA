We write our program in a .java file, which is a human-readable format, but a machine cannot understand this program.
The machine only understands 0 and 1 formats.

First, we have to compile the .java file using the JVM (Java Virtual Machine). The JVM will convert our entire file into bytecode with a .class extension.

The JVM is platform-dependent, and then the interpreter comes into the picture, which executes line by line, converts the .class file into a machine-readable format, and the file will be executed.

### When our .java file gets converted into a .class file means the bytecode, which is why Java is platform independent.

![Screenshot 2025-11-10 at 8.17.39 AM.png](attachment:ffc30835-7e20-494c-990a-bdcc3e0c8750:Screenshot_2025-11-10_at_8.17.39_AM.png)

### Source Code → Compiler → .class (bytecode) → JVM (Interpreter) → line by line executes → Machine Code (0, 1)

## More About Platform Independence

- The Bytecode we got by compiling our .java file that we can run on all operating systems.
- We need to convert our source code into a machine-understandable format so that the machine can understand it
- The compiler helps in achieving this means converting our source code to bytecode
- When we run any program on c/c++, the compiler converts our source code to an .exe file, which is an executable file
- The .exe file executable file is platform dependent
- But, in Java, when the compiler converts our source code into a .class bytecode file, we can execute that file in all operating systems, which is a machine-understandable format.
- Java is platform-independent, but the JVM is platform-dependent

## Architecture Of Java

![Screenshot 2025-11-10 at 8.29.56 AM.png](attachment:49259c87-24ed-408e-a878-eacae669d585:Screenshot_2025-11-10_at_8.29.56_AM.png)

## JDK (Java Development Kit)

If you want to develop Java programs, you need the JDK for that.

- JDK provides the environment to run and develop Java programs
- JDK is a package that a developer can use to develop and run Java Programs and applications
- contains the .javac compiler
- JRE = Java Runtime Environment: to execute Java programs
- archiver - .jar
- docs generator - javadoc
- interpreter/loader

## JRE (Java Runtime Environment)

It contains all the source files, which will be useful for executing Java programs

- It consists of
    1. Deployment Strategies
    2. User Interface toolkits
    3. Integration Libraries
    4. Base Libraries
    5. JVM
- After we got the .class file, the next thing that happens at runtime is:
    1. The class loader loads the required classes to execute the program
    2. JVM sends the bytecode to the bytecode verifier to check the format of the code

## Compile Time

![Screenshot 2025-11-10 at 8.39.43 AM.png](attachment:e112c447-b474-42e8-bbaf-8d69fa3e9a53:Screenshot_2025-11-10_at_8.39.43_AM.png)

## JVM Execution:

### Interpreter:

- Code is executed line by line
- When one method is called many times, it will interpret it again and again.

### JIT (Just In Time) Compiler:

- Those methods that are reinterpreted by the JIT provide direct machine code so that re-interpretation is not required.
- makes execution faster

## Runtime:

![Screenshot 2025-11-10 at 8.43.12 AM.png](attachment:273476e6-4c78-4473-98f2-517a7d60a4aa:Screenshot_2025-11-10_at_8.43.12_AM.png)

## How JVM Works: Class Loader

- Loading:
    1. reads the .class file and generates binary data
    2. An object of this class is created in the heap memory
- Linking:
    1. JVM verifies the .class file
    2. JVM allocates memory for the class variables and default values
    3. Replace symbolic references with type to direct references
- Initialization:
    1. All static variables are assigned their values defined in the code and the static block.

### JVM contains the Stack and Heap memory allocations.

### Java Source Code → JDK → ByteCode → JVM → JRE