 // DESCRIPTION:
 // Purpose of program: Solve a number riddle
 // we are doing this using a positive and negative integer, zero and one,
 // along with using positive and negative doubles
 // Program will print every step
 // Program is meant to demonstrate compound assignments and data type conversions


public class NumberRiddle {

    public static void main(String[] args) {

        // Positive integer- Vansh
        int positiveInteger = 5;
        System.out.print("Positive integer: ");
        System.out.println(positiveInteger);
        // doubling the positive integer 
        int currentNumber = positiveInteger * 2; 
        System.out.print("Doubled: ");
        System.out.println(currentNumber);

        // adding 6 to the current number
        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);
        // dividing the current number by 2
        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);
        // subtracting the original positive integer from the current number
        currentNumber -= positiveInteger;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // Negative integer- Tyler
        int negativeInteger = -5;
        System.out.print("\nNegative integer: ");
        System.out.println(negativeInteger);
        // doubling the negative integer
        currentNumber = negativeInteger * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);
        // adding 6 to the current number
        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);
        // dividing the current number by 2
        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);
        // subtracting the original negative integer from the current number
        currentNumber -= negativeInteger;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // Zero- Vandhith
        int zero = 0;
        System.out.print("\nZero: ");
        System.out.println(zero);
        // doubling zero
        currentNumber = zero * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);
        // adding 6 to the current number
        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);
        // dividing the current number by 2
        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);
        // subtracting the original zero from the current number
        currentNumber -= zero;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // One-Fyeha
        int one = 1;
        System.out.print("\nOne: ");
        System.out.println(one);
        // doubling one
        currentNumber = one * 2;
        System.out.print("Doubled: ");
        System.out.println(currentNumber);
        // adding 6 to the current number
        currentNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(currentNumber);
        // dividing the current number by 2
        currentNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(currentNumber);
        // subtracting the original one from the current number
        currentNumber -= one;
        System.out.print("Subtracted original: ");
        System.out.println(currentNumber);


        // Positive double- Vansh
        double positiveDouble = 5.5;
        System.out.print("\nPositive double: ");
        System.out.println(positiveDouble);
        // doubling the positive double
        double doubleNumber = positiveDouble * 2;
        System.out.print("Doubled: ");
        System.out.println(doubleNumber);
        // adding 6 to the current number
        doubleNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(doubleNumber);
        // dividing the current number by 2
        doubleNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(doubleNumber);
        // subtracting the original positive double from the current number
        doubleNumber -= positiveDouble;
        System.out.print("Subtracted original: ");
        System.out.println(doubleNumber);


        // Negative double- Tyler
        double negativeDouble = -5.5;
        System.out.print("\nNegative double: ");
        System.out.println(negativeDouble);
        // doubling the negative double
        doubleNumber = negativeDouble * 2;
        System.out.print("Doubled: ");
        System.out.println(doubleNumber);
        // adding 6 to the current number
        doubleNumber += 6;
        System.out.print("Added 6: ");
        System.out.println(doubleNumber);
        // dividing the current number by 2
        doubleNumber /= 2;
        System.out.print("Divided by 2: ");
        System.out.println(doubleNumber);
        // subtracting the original negative double from the current number
        doubleNumber -= negativeDouble;
        System.out.print("Subtracted original: ");
        System.out.println(doubleNumber);


        // Converting an int to a double- Fyeha and Vandhith 
        double convertedNumber = (double) positiveInteger;
        System.out.print("\nInteger converted to double: ");
        System.out.println(convertedNumber);
    }
}
