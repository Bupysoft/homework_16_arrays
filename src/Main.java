public class Main {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 17, 2, 55, 5, 2, 17};
        avgOfElements(numbers);
        maxOfElements(numbers);
        duplicateOfElements(numbers);
        sumOfElements(numbers);
        reversedElements();
        countOfSymbols();
        countOfSpaces();
        sumOfElementsWithWhile(numbers);
    }

    public static void avgOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = (double) sum / array.length;
        System.out.println("1. Average of Array = " + avg);
    }

    public static void maxOfElements(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("2. Max of Array = " + max);
    }

    public static void duplicateOfElements(int[] array) {
        boolean found = false;
        System.out.print("3. ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!found) {
                        System.out.print("Duplicate is found: ");
                    }
                    System.out.print(array[i]+", ");
                    found = true;
                }

            }
        }
        if (!found) {
            System.out.print("Duplicate is not found");
        }
        System.out.println("");
    }
    public static void sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("4. Sum of Elements = " + sum);
    }
    public static void reversedElements() {
        System.out.print("5. ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public static void countOfSymbols() {
        String str = "Hello, World!";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("6a. Number of symbols (without spaces): " + count);
    }
    public static void countOfSpaces() {
        String str = "All of The Times";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("6b. Number of spaces: " + count);
    }
    public static void sumOfElementsWithWhile(int[] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println("7. Sum of Elements With Using while = " + sum);
    }
}