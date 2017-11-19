package com.cjosan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        // Exercise 12.01

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the expression: ");
//        String expression = input.nextLine();
//        expression = expression.replaceAll(" ", "");
//
//        if (expression.length() != 3) {
//            System.out.println("Usage: operand1 operator operand2");
//            System.exit(0);
//        }
//
//        // The result of the operation
//        int result = 0;
//
//        // Determine the operator
//        try {
//            switch (expression.charAt(1)) {
//                case '+':
//                    result = Integer.parseInt(String.valueOf(expression.charAt(0))) +
//                            Integer.parseInt(String.valueOf(expression.charAt(2)));
//                    break;
//                case '-':
//                    result = Integer.parseInt(String.valueOf(expression.charAt(0))) -
//                            Integer.parseInt(String.valueOf(expression.charAt(2)));
//                    break;
//                case '*':
//                    result = Integer.parseInt(String.valueOf(expression.charAt(0))) *
//                            Integer.parseInt(String.valueOf(expression.charAt(2)));
//                    break;
//                case '/':
//                    result = Integer.parseInt(String.valueOf(expression.charAt(0))) /
//                            Integer.parseInt(String.valueOf(expression.charAt(2)));
//            }
//        } catch(NumberFormatException ex) {
//            System.out.print("Wrong operator type! ");
//            System.out.println(ex.getMessage());
//            System.exit(1);
//        }
//        // Display result
//        System.out.println(expression.charAt(0) + " " + expression.charAt(1) + " " + expression.charAt(2) + " = " + result);

//        System.out.print("Enter the expression: ");
//        String expression = input.nextLine();
//        expression = expression.replaceAll(" ", "");
//
//        if (expression.length() != 3) {
//            System.out.println("Usage: operand1 operator operand2");
//            System.exit(0);
//        }
//
//        if (!Character.isDigit(expression.charAt(0)) || !Character.isDigit(expression.charAt(2))) {
//            System.out.println("Wrong operator type!");
//            System.exit(1);
//        }
//
//        // The result of the operation
//        int result = 0;
//
//        // Determine the operator
//        switch (expression.charAt(1)) {
//            case '+':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) +
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//                break;
//            case '-':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) -
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//                break;
//            case '*':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) *
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//                break;
//            case '/':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) /
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//        }
//
//        // Display result
//        System.out.println(expression.charAt(0) + " " + expression.charAt(1) + " " + expression.charAt(2) + " = " + result);

        // Exercise 12.02

//        Scanner input = new Scanner(System.in);
//
//        Integer sum = null;
//        boolean isValid = false;
//        do {
//            System.out.println("Enter 2 integers");
//
//            try {
//                int num1 = input.nextInt();
//                int num2 = input.nextInt();
//                sum = num1 + num2;
//                isValid = true;
//            } catch (InputMismatchException ex) {
//                System.out.println("Your input is invalid. Try again.");
//                input.nextLine();
//            }
//        } while (!isValid);
//
//        System.out.println("Sum: " + sum);

        // Exercise 12.03

//        int[] numbers = new int[100];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int)(Math.random() * 101);
//        }
//
//        System.out.println("Enter a position (0 - 99):");
//        int index = input.nextInt();
//
//        try {
//            System.out.println("Number at position " + index + " is " + numbers[index]);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Out of bounds");
//            System.exit(1);
//        }

        // Exercise 12.06

        // Prompt the user to enter a string
//        System.out.print("Enter a hex number: ");
//        String hex = input.nextLine();
//
//        try {
//            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
//        } catch (NumberFormatException ex) {
//            System.out.println(ex.getMessage());
//        }

        // Exercise 12.07

//        System.out.print("Enter a binary number: ");
//        String bin = input.nextLine();
//
//        try {
//            System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin));
//        } catch (NumberFormatException ex) {
//            System.out.println(ex.getMessage());
//        }

        // Exercise 12.08

//        System.out.print("Enter a hex number: ");
//        String hex = input.nextLine();
//
//        try {
//            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
//        } catch (HexFormatException ex) {
//            System.out.println(ex.getMessage());
//        }

        // Exercise 12.09

//        System.out.print("Enter a binary number: ");
//        String bin = input.nextLine();
//
//        try {
//            System.out.println("The decimal value for binary number " + bin + " is " + bin2Dec(bin));
//        } catch (BinaryFormatException ex) {
//            System.out.println(ex.getMessage());
//        }

        // Exercise 12.10

//        try {
//            int[] array = new int[Integer.MAX_VALUE];
//        } catch (OutOfMemoryError error) {
//            System.out.println(error.getMessage());
//        }

        // Exercise 12.11
        // arguments for running: John src/com/cjosan/ex11.txt

//        if (args.length != 2) {
//            System.out.println("Usage: String FilePath");
//            System.exit(1);
//        }
//
//        String s = args[0];
//        File file = new File(args[1]);
//        File temp = new File ("src/com/cjosan/temp.txt");
//
//        try (Scanner input = new Scanner(file);
//             PrintWriter output = new PrintWriter(temp)){
//            while (input.hasNextLine()) {
//                String str = input.nextLine();
//                str = str.replaceAll(s, "");
//                output.println(str);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file " + args[1]);
//        }
//        file.delete();
//        temp.renameTo(file);

        // Exercise 12.12
        // run with argument src/com/cjosan/Test.java

//        if (args.length != 1) {
//            System.out.println("Usage: FilePath");
//            System.exit(1);
//        }
//
//        File file = new File(args[0]);
//        File temp = new File("src/com/cjosan/temp.java");
//
//        try (Scanner input = new Scanner(file);
//        PrintWriter output = new PrintWriter(temp)) {
//
//            output.print(input.nextLine());
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//
//                if (line.contains("{"))
//                    output.print(" {");
//                else
//                    output.print("\n" + line);
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file");
//        } finally {
//            file.delete();
//            temp.renameTo(file);
//        }

        // Exercise 12.13
        // run with argument src/com/cjosan/Test.java

//        if (args.length != 1) {
//            System.out.println("Usage: FilePath");
//            System.exit(1);
//        }
//
//        File file = new File(args[0]);
//
//        int wordCount = 0, charCount = 0, lineCount = 0;
//
//        try (Scanner input = new Scanner(file)) {
//
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                charCount += line.length();
//                lineCount++;
//
//                for (int i = 0; i < line.length(); i++) {
//                    if (line.charAt(i) != ' ')
//                        wordCount++;
//                    while (line.charAt(i) != ' ' && i < line.length() - 1) {
//                        i++;
//                    }
//                }
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file");
//        }
//
//        charCount += (lineCount - 1);
//        System.out.println("File " + file.getName() + " has\n" +
//                charCount + " characters\n" + wordCount + " words\n" +
//                lineCount + " lines");

        // Exercise 12.14
        // run with argument run with argument src/com/cjosan/scores.txt

//        if (args.length != 1) {
//            System.out.println("Usage: FilePath");
//            System.exit(1);
//        }
//
//        File file = new File(args[0]);
//        double sum = 0;
//        int numCount = 0;
//
//        try (Scanner input = new Scanner(file)) {
//            double temp;
//            while (input.hasNext()) {
//                try {
//                    temp = Integer.parseInt(input.next());
//                } catch (NumberFormatException ex) {
//                    continue;
//                }
//                numCount++;
//                sum += temp;
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file");
//        }
//
//        System.out.println("Sum: " + sum + "\nAverage: " + String.format("%.2f", sum / numCount));

        // Exercise 12.15

//        File file = new File("src/com/cjosan/Exercise12_15.txt");
//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(1);
//        }
//
//        try(PrintWriter output = new PrintWriter(file);
//                Scanner input = new Scanner(file)) {
//
//            for (int i = 0; i < 100; i++) {
//                output.print((int)(Math.random() * 101) + " ");
//            }
//            output.flush();
//
//            int[] numbers = new int[100];
//            int i = 0;
//            while (input.hasNextInt()) {
//                numbers[i++] = input.nextInt();
//            }
//
//            Arrays.sort(numbers);
//            for (int n : numbers)
//                System.out.println(n);
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file!");
//        }

        // Exercise 12.16
        // run with arguments filePath odlString newString

//        if (args.length != 3) {
//            System.out.println("Usage: filePath odlString newString");
//            System.exit(1);
//        }
//
//        String oldString = args[1];
//        String newString = args[2];
//        File file = new File(args[0]);
//        File temp = new File ("src/com/cjosan/temp.txt");
//
//        try (Scanner input = new Scanner(file);
//             PrintWriter output = new PrintWriter(temp)){
//            while (input.hasNextLine()) {
//                String str = input.nextLine();
//                str = str.replaceAll(oldString, newString);
//                output.println(str);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file " + args[0]);
//        }
//        file.delete();
//        temp.renameTo(file);

        // Exercise 12.17

//        ArrayList<String> wordsList = new ArrayList<>();
//        try (Scanner input = new Scanner(new File ("src/com/cjosan/HangmanWords.txt"))) {
//            while (input.hasNext()) {
//                wordsList.add(input.next());
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("File not found!");
//        }
//
//        String[] words = wordsList.toArray(new String[0]);
//
//        while (true) {
//            Scanner input = new Scanner(System.in);
//            startGame(words);
//
//            System.out.print("\nDo you want to guess another word? Enter y or n > ");
//            String choice = input.nextLine();
//
//            // ask the player to continue
//            if (Character.toLowerCase(choice.charAt(0)) == 'n')
//                break;
//        }

        // Exercise 12.18

//        File rootDirectory = new File("src/com/cjosan");
//        File[] files = rootDirectory.listFiles();
//
//        for (File file : files) {
//            if (file.isDirectory() && file.getName().matches("chapter.*"))
//                addPackageStatement(file);
//        }

        // Exercise 12.19

//        try {
//            URL link = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
//            Scanner input = new Scanner(link.openStream());
//
//            int wordCount = 0;
//            while (input.hasNext()) {
//                String temp = input.next();
//
//                // Verify if string is a word
//                int count = 0;
//                for (int i = 0; i < temp.length(); i++) {
//                    if (Character.isLetterOrDigit(temp.charAt(i))) {
//                        count++;
//                    }
//                }
//
//                if (count > 0)
//                    wordCount++;
//            }
//
//            input.close();
//            System.out.println("Number of words: " + wordCount);
//        } catch (MalformedURLException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        // Exercise 12.20

//        File rootDirectory = new File("src/com/cjosan");
//        File[] files = rootDirectory.listFiles();
//
//        for (File file : files) {
//            if (file.isDirectory() && file.getName().matches("chapter.*"))
//                removePackageStatement(file);
//        }

        // Exercise 12.21

//        File file = new File("src/com/cjosan/SortedStrings.txt");
//
//        try (Scanner input = new Scanner(file)) {
//
//            String prevString = input.next();
//            while (input.hasNext()) {
//                String nextString = input.next();
//
//                if (prevString.compareTo(nextString) > 0) {
//                    System.out.println("Strings out of order:\n\t" + prevString + "\n\t" + nextString);
//                    System.exit(1);
//                }
//
//                prevString = nextString;
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file");
//        }
//
//        System.out.println("The strings in file are sorted");

        // Exercise 12.22
        // run with arguments dir oldString newString

//        if (args.length != 3) {
//            System.out.println("Usage: dir oldString newString");
//            System.exit(1);
//        }
//
//        String oldString = args[1];
//        String newString = args[2];
//        File directory = new File(args[0]);
//        File[] files = null;
//        if (directory.isDirectory())
//            files = directory.listFiles();
//        else {
//            System.out.println("The specified path is not a directory");
//            System.exit(1);
//        }
//
//        try {
//            for (File file : files) {
//                if (file.isFile()) {
//                    File temp = new File (directory.getAbsolutePath() + "/temp.txt");
//                    Scanner input = new Scanner(file);
//                    PrintWriter output = new PrintWriter(temp);
//                    while (input.hasNextLine()) {
//                        String str = input.nextLine();
//                        str = str.replaceAll(oldString, newString);
//                        output.println(str);
//                    }
//
//                    input.close();
//                    output.close();
//
//                    file.delete();
//                    temp.renameTo(file);
//                }
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file " + args[0]);
//            ex.printStackTrace();
//        }

        // Exercise 12.23

//        int sum = 0;
//        int numCount = 0;
//
//        try {
//            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
//            Scanner input = new Scanner(url.openStream());
//
//            int temp;
//            while (input.hasNextInt()) {
//                try {
//                    temp = input.nextInt();
//                } catch (NumberFormatException ex) {
//                    continue;
//                }
//                numCount++;
//                sum += temp;
//            }
//
//        } catch (MalformedURLException e) {
//            System.out.println("Cannot access the URL");
//            e.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        System.out.println("Sum: " + sum + "\nAverage: " + String.format("%.2f", (double)sum / numCount));

        // Exercise 12.24

//        File file = new File("src/com/cjosan/Salary.txt");
//        String[] ranks = {"assistant", "associate", "full"};
//
//        try (PrintWriter output = new PrintWriter(file)) {
//
//            for (int i = 1; i <= 1000; i++) {
//                String rank = ranks[(int)(Math.random() * 3)];
//                double salary;
//
//                switch (rank) {
//                    case "assistant":
//                        salary = 50000 + Math.random() * 30001;
//                        break;
//                    case "associate":
//                        salary = 60000 + Math.random() * 50001;
//                        break;
//                    case "full":
//                        salary = 75000 + Math.random() * 55001;
//                        break;
//                    default:
//                        salary = 0;
//                }
//
//                output.printf("%s %s %s %.2f\n", "FirstName" + i, " LastName" + i, rank, salary);
//            }
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("Cannot find the file");
//            ex.printStackTrace();
//        }

        // Exercise 12.25

//        double totalAssistantSalary = 0, totalAssociateSalary = 0, totalFullSalary = 0, totalSalary = 0;
//        int assistantCount = 0, associateCount = 0, fullCount = 0, employeesCount;
//
//        try {
//            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
//            Scanner input = new Scanner(url.openStream());
//
//            while (input.hasNext()) {
//                input.next();
//                input.next();
//
//                String rank = input.next();
//                double salary = Double.parseDouble(input.next());
//
//                switch (rank) {
//                    case "assistant":
//                        totalAssistantSalary += salary;
//                        assistantCount++;
//                        break;
//                    case "associate":
//                        totalAssociateSalary += salary;
//                        associateCount++;
//                        break;
//                    case "full":
//                        totalFullSalary += salary;
//                        fullCount++;
//                        break;
//                }
//            }
//
//        } catch (MalformedURLException ex) {
//            System.out.println("Cannot access the specified URL");
//        } catch (IOException ex) {
//            System.out.println("Cannot read data from specified source");
//            ex.printStackTrace();
//        }
//
//        totalSalary = totalAssistantSalary + totalAssociateSalary + totalFullSalary;
//        employeesCount = assistantCount + associateCount + fullCount;
//
//        System.out.printf("Assistant professors average salary: %.2f" +
//                "\nAssociate professors average salary: %.2f" +
//                "\nFull professors average salary: %.2f" +
//                "\nProfessors average salary: %.2f",
//                (totalAssistantSalary / assistantCount), (totalAssociateSalary / associateCount),
//                (totalFullSalary / fullCount), (totalSalary / employeesCount));

        // Exercise 12.26

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a directory name");
//        String dirName = input.nextLine();
//
//        File directory = new File("src/com/cjosan/" + dirName);
//
//        if (directory.mkdirs())
//            System.out.println("Directory succesfully created");
//        else
//            System.out.println("Directory already exists");

        // Exercise 12.27

//        File directory = new File("src/com/cjosan/test");
//        File[] files = directory.listFiles();
//
//        for (File file : files) {
//            if (file.isFile()) {
//                File temp = new File(directory.getAbsolutePath() + "/temp.txt");
//                try (Scanner input = new Scanner(file);
//                PrintWriter output = new PrintWriter(temp)) {
//                    while (input.hasNextLine()) {
//                        String str = input.nextLine();
//                        String[] tokens = str.split(" ");
//
//                        for (int i = 0; i < tokens.length; i++) {
//                            if (tokens[i].matches("Exercise[\\d]_[\\d]"))
//                                output.print("Exercise0" + tokens[i].charAt(8) + "_0" + tokens[i].charAt(10) + " ");
//                            else
//                                output.print(tokens[i] + " ");
//                        }
//                        output.print("\n");
//                    }
//                } catch (FileNotFoundException ex) {
//                    System.out.println("Cannot find the file " + file.getName());
//                } finally {
//                    file.delete();
//                    temp.renameTo(file);
//                }
//            }
//        }

        // Exercise 12.28

//        File directory = new File("src/com/cjosan/test");
//        File[] files = directory.listFiles();
//
//        for (File file : files) {
//            String fileName = file.getName();
//
//            if (fileName.matches("Exercise[\\d]_[\\d].*")) {
//                char firstDigit = fileName.charAt(8);
//                String newName = "Exercise0" + firstDigit + fileName.substring(9);
//                if (!file.renameTo(new File(directory.getAbsolutePath() + "/" + newName)))
//                    System.out.println("Cannot rename the file " + fileName + ". File already exists!");
//            }
//        }

        // Exrcise 12.29

//        File directory = new File("src/com/cjosan/test");
//        File[] files = directory.listFiles();
//
//        for (File file : files) {
//            String fileName = file.getName();
//
//            if (fileName.matches("Exercise[\\d]_[\\d].*")) {
//                char firstDigit = fileName.charAt(8);
//                String newName = "Exercise0" + firstDigit + fileName.substring(9);
//                if (!file.renameTo(new File(directory.getAbsolutePath() + "/" + newName)))
//                    System.out.println("Cannot rename the file " + fileName + ". File already exists!");
//            }
//        }

        System.out.println("Exercise2_22".matches("Exercise[\\d]+_[\\d]{1}"));




    }

    ///////////////////////////////////////////// Exercise 12.19 /////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void removePackageStatement(File directory) {
        File[] files = directory.listFiles();

        for (File file : files) {
            if (file.getName().matches(".*java")) {
                File temp = new File(directory.getAbsolutePath() + "/temp.txt");
                try (Scanner input = new Scanner(file);
                     PrintWriter output = new PrintWriter(temp)) {

                    input.nextLine();
                    input.nextLine();
                    while (input.hasNextLine()) {
                        String line = input.nextLine();
                        output.println(line);
                    }

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } finally {
                    file.delete();
                    temp.renameTo(file);
                }
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////// Exercise 12.18 /////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void addPackageStatement(File directory) {
        File[] files = directory.listFiles();

        for (File file : files) {
            if (file.getName().matches(".*java")) {
                File temp = new File(directory.getAbsolutePath() + "/temp.txt");
                try (Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(temp)) {

                    output.println("package com.cjosan." + directory.getName() + ";\n");
                    while (input.hasNextLine()) {
                        String line = input.nextLine();
                        output.println(line);
                    }

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } finally {
                    file.delete();
                    temp.renameTo(file);
                }
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////// Exercise 12.17 /////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int startGame(String[] words) {
        Scanner input = new Scanner(System.in);
        int miss = 0; // number of misses
        char letter;  // letter entered by user
        String guess; // user input
        char[] word = generateWord(words);
        char[] userGuess = new char[word.length];
        ArrayList<Character> guessedLetters = new ArrayList<>();

        // fill the word with stars
        for (int i = 0; i < userGuess.length; i++) {
            userGuess[i] = '*';
        }

        System.out.println("If you want to enter the whole word insert the space character\n");

        while (!Arrays.equals(word, userGuess)) {
            System.out.print("(Guess) enter a letter in word ");
            display(userGuess);
            System.out.print(" > ");

            guess = input.nextLine();
            letter = Character.toLowerCase(guess.charAt(0));

            // possibility to enter the whole word if space is pressed
            if (letter == ' ') {
                System.out.println("Enter the word > ");
                char[] tryWord = input.nextLine().toCharArray();

                if (Arrays.equals(tryWord, word)) {
                    System.out.print("The word is ");
                    display(word);
                    System.out.println(". You missed " + miss + " times");
                    return 0;
                } else {
                    System.out.print("The word was ");
                    display(word);
                    return -1;
                }
            }

            // verify if the letter is not already in the word
            if (guessedLetters.contains(letter)) {
                System.out.println("\t" + letter + " is already in the word");
                continue;
            }

            if (contains(word, letter)) {
                updateWord(word, userGuess, letter);
                guessedLetters.add(letter);
            }
            else {
                miss++;
                System.out.println("\t" + letter + " is not in the word");
            }
        }

        System.out.print("The word is ");
        display(word);
        System.out.println(". You missed " + miss + " times");

        return 0;
    }

    // generate a random word from array
    public static char[] generateWord(String[] words) {
        int index = (int)(Math.random() * words.length);
        String word = words[index];

        return word.toCharArray();
    }

    // display an array
    public static void display(char[] array) {
        for (char element : array) {
            System.out.print(element);
        }
    }

    // return true if the letter is in the array, and false if not
    public static boolean contains(char[] word, char letter) {
        for (int i = 0; i < word.length; i++) {
            if (letter == word[i])
                return true;
        }
        return false;
    }

    // change * to letter
    public static void updateWord(char[] word, char[] guess, char letter) {
        for (int i = 0; i < word.length; i++) {
            if (letter == word[i])
                guess[i] = letter;
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////



    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimalValue = 0;

        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
            int binDigit = Character.getNumericValue(binaryString.charAt(i));
            if (binDigit < 0 || binDigit > 1)
                throw new BinaryFormatException("Is not a binary number");

            decimalValue += (binDigit * Math.pow(2, j));
        }

        return decimalValue;
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        try {
            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }
        } catch (HexFormatException ex) {
            throw new HexFormatException(hex + " " + ex.getMessage());
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if (ch >= 0 && ch <= 9) // ch is '0', '1', ..., or '9'
            return ch - '0';
        else
            throw new HexFormatException("is not a hex number");
    }

//    public static int bin2Dec(String binaryString) throws NumberFormatException {
//        int decimalValue = 0;
//
//        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
//            int binDigit = Character.getNumericValue(binaryString.charAt(i));
//            if (binDigit < 0 || binDigit > 1)
//                throw new NumberFormatException("Is not a binary number");
//
//            decimalValue += (binDigit * Math.pow(2, j));
//        }
//
//        return decimalValue;
//    }

//    public static int hexToDecimal(String hex) throws NumberFormatException {
//        int decimalValue = 0;
//        try {
//            for (int i = 0; i < hex.length(); i++) {
//                char hexChar = hex.charAt(i);
//                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
//            }
//        } catch (NumberFormatException ex) {
//            throw new NumberFormatException(hex + " " + ex.getMessage());
//        }
//
//        return decimalValue;
//    }
//
//    public static int hexCharToDecimal(char ch) throws NumberFormatException {
//        if (ch >= 'A' && ch <= 'F')
//            return 10 + ch - 'A';
//        else if (ch >= 0 && ch <= 9) // ch is '0', '1', ..., or '9'
//            return ch - '0';
//        else
//            throw new NumberFormatException("is not a hex number");
//    }

}