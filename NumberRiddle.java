/*
 * The purpose of this program is to test the number riddle
 * using a positive integer, negative integer, zero, one,
 * positive double, and negative double.
 * The program prints every step of the calculation and
 * demonstrates compound assignment and data type conversion.
 */

public class NumberRiddle {

    public static void main(String[] args) {

        // Positive integer
        int positiveInteger = 5;
        System.out.print("Positive integer: ");
        System.out.println(positiveInteger);

        int currentNumber = positiveInteger * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);

        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);

        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);

        currentNumber -= positiveInteger;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // Negative integer
        int negativeInteger = -5;
        System.out.print("\nNegative integer: ");
        System.out.println(negativeInteger);

        currentNumber = negativeInteger * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);

        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);

        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);

        currentNumber -= negativeInteger;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // Zero
        int zero = 0;
        System.out.print("\nZero: ");
        System.out.println(zero);

        currentNumber = zero * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);

        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);

        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);

        currentNumber -= zero;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // One
        int one = 1;
        System.out.print("\nOne: ");
        System.out.println(one);

        currentNumber = one * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);

        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);

        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);

        currentNumber -= one;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // Positive double
        double positiveDouble = 5.5;
        System.out.print("\nPositive double: ");
        System.out.println(positiveDouble);

        double doubleNumber = positiveDouble * 2;
        System.out.print("Doubled: ");
        System.out.println(doubleNumber);

        doubleNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(doubleNumber);

        doubleNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(doubleNumber);

        doubleNumber -= positiveDouble;
        System.out.print("Subtracted original: ");
        System.out.println(doubleNumber);


        // Negative double
        double negativeDouble = -5.5;
        System.out.print("\nNegative double: ");
        System.out.println(negativeDouble);

        doubleNumber = negativeDouble * 2;
        System.out.print("Doubled: ");
        System.out.println(doubleNumber);

        doubleNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(doubleNumber);

        doubleNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(doubleNumber);

        doubleNumber -= negativeDouble;
        System.out.print("Subtracted original: ");
        System.out.println(doubleNumber);


        // Converting an int to a double
        double convertedNumber = (double) positiveInteger;
        System.out.print("\nInteger converted to double: ");
        System.out.println(convertedNumber);
    }
}