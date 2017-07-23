package net.thumbtack.kolyada.lesson2.task1;


import java.util.Arrays;

public class Task1 {

    public static int getResultLength(final String string) {
        System.out.println("Length of string \"" + string + "\": " + string.length());
        return string.length();
    }

    public static char getResultCharAt(final String string, final int position) {
        System.out.println("A character on position " + position + " in string \"" + string + "\": " + string.charAt(position));
        return string.charAt(position);
    }

    public static int[] getResultFirstIndexOf(final String string, final char charIndexOf, final String stringIndexOf, final char charFromIndex, final String stringFromIndex, final int fromIndexOfChar, final int fromIndexOfString) {
        System.out.println("Index of first entry character " + charIndexOf + " in string \"" + string + "\": " + string.indexOf(charIndexOf));
        System.out.println("Index of first entry string " + stringIndexOf + " in string \"" + string + "\": " + string.indexOf(stringIndexOf));
        System.out.println("Index of first entry character " + charFromIndex + " starting at position " + fromIndexOfChar + " in string \"" + string + "\": " + string.indexOf(charFromIndex, fromIndexOfChar));
        System.out.println("Index of first entry string " + stringFromIndex + " starting at position " + fromIndexOfString + " in string \"" + string + "\": " + string.indexOf(stringFromIndex, fromIndexOfString));
        return new int[]{string.indexOf(charIndexOf), string.indexOf(stringIndexOf), string.indexOf(charFromIndex, fromIndexOfChar), string.indexOf(stringFromIndex, fromIndexOfString)};
    }

    public static int[] getResultLastndexOf(final String string, final char charIndexOf, final String stringIndexOf, final char charFromIndex, final String stringFromIndex, final int fromIndexOfChar, final int fromIndexOfString) {
        System.out.println("Index of last entry character " + charIndexOf + " in string \"" + string + "\": " + string.lastIndexOf(charIndexOf));
        System.out.println("Index of last entry string " + stringIndexOf + " in string \"" + string + "\": " + string.lastIndexOf(stringIndexOf));
        System.out.println("Index of last entry character " + charFromIndex + " starting at position " + fromIndexOfChar + " in string \"" + string + "\": " + string.lastIndexOf(charFromIndex, fromIndexOfChar));
        System.out.println("Index of last entry string " + stringFromIndex + " starting at position " + fromIndexOfString + " in string \"" + string + "\": " + string.lastIndexOf(stringFromIndex, fromIndexOfString));
        return new int[]{string.lastIndexOf(charIndexOf), string.lastIndexOf(stringIndexOf), string.lastIndexOf(charFromIndex, fromIndexOfChar), string.lastIndexOf(stringFromIndex, fromIndexOfString)};
    }

    public static boolean getResultEquals(final String string, final String stringToEquals) {
        System.out.println("Compares string \"" + string + "\" and string " + stringToEquals + ": " + string.equals(stringToEquals));
        return string.equals(stringToEquals);
    }

    public static boolean getResultEqualsIgnoreCase(final String string, final String stringToEquals) {
        System.out.println("Compares string \"" + string + "\" and string " + stringToEquals + " with ignore case: " + string.equalsIgnoreCase(stringToEquals));
        return string.equalsIgnoreCase(stringToEquals);
    }

    public static String getResultConcatenated(final String string, final String concatString) {
        System.out.println("Concatenated string \"" + string + "\" and string " + concatString + ": " + string.concat(concatString));
        return string.concat(concatString);
    }

    public static String getResultConcatenatedPl(final String string, final String concatString) {
        System.out.println("Concatenated string \"" + string + "\" and string " + concatString + " with (+): " + string + concatString);
        return string + concatString;

    }

    public static String getResultConcatenatedEq(String string, final String concatString) {
        System.out.println("Concatenated string \"" + string + "\" and string " + concatString + " with (+=): " + (string += concatString));
        return (string += concatString);

    }

    public static boolean getResultStartsWith(final String string, final String startString) {
        System.out.println("Does string \"" + string + "\" start with an argument \"" + startString + "\": " + string.startsWith(startString));
        return string.startsWith(startString);
    }

    public static boolean getResultEndsWith(final String string, final String endsString) {
        System.out.println("Does string \"" + string + "\" end with an argument \"" + endsString + "\": " + string.endsWith(endsString));
        return string.endsWith(endsString);
    }

    public static String getResultSubstring(final String string, final int beginIndex) {
        System.out.println("A substring starting with index " + beginIndex + " in the string  \"" + string + "\": " + string.substring(beginIndex));
        return string.substring(beginIndex);
    }

    public static byte[] getResultGetBytes(final String string) {
        System.out.println("String \"" + string + "\" represented as a bytes: " + string.getBytes());
        return string.getBytes();
    }

    public static char[] getResultGetChars(final String string, final int srcBegin, char[] arrayChars, final int dstBegin) {
        string.getChars(srcBegin, string.length(), arrayChars, dstBegin);
        System.out.println("String \"" + string + "\" represented as array chars: " + arrayChars);
        return arrayChars;
    }

    public static String getResultReplaceFirst(final String string, final String regex, final String replacement) {
        System.out.println("Replace substring \"" + regex + "\" on \"" + replacement + "\" in string \"" + string + "\":" + string.replaceFirst(regex, replacement));
        return string.replaceFirst(regex, replacement);
    }

    public static String getResultReplace(final String string, final char oldChar, final char newChar) {
        System.out.println("Replace a character '" + oldChar + "' on '" + newChar + "' in string \"" + string + "\": " + string.replace(oldChar, newChar));
        return string.replace(oldChar, newChar);
    }

    public static String[] getResultSplit(final String string, final String regex) {
        System.out.println("Array of strings obtained after splitting string \"" + string + "\": " + Arrays.toString(string.split(regex)));
        return string.split(regex);
    }

    public static String getResultTrim(final String string) {
        System.out.println("String with spaces removed at beginning and end of string \"" + string + "\": " + (string).trim());
        return string.trim();
    }

    public static String getResultValueOF(final int number) {
        System.out.println("A string representation: " + String.valueOf(number));
        return String.valueOf(number);
    }

    public static String getResultFormat(final int numberInt, final double numberDouble) {
        System.out.println("Format" + String.format("thumbtack %d %f", numberInt, numberDouble));
        return String.format("thumbtack %d %f", numberInt, numberDouble);
    }

    public static void main(String[] args) {
    }

}
