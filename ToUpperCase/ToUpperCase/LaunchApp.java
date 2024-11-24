package ToUpperCase;

import java.util.Scanner;

class LaunchApp {
  public static void main(String[] args) {
    System.out.println("Введите строку");
    try (Scanner scanner = new Scanner(System.in)) {
      String inputStr = scanner.nextLine();
      System.out.println("Вы ввели строку: " + inputStr);
      System.out.println("Результат: " + toUpperCaseFirstLetter(inputStr));
    }
  }

  public static String toUpperCaseFirstLetter(String inputStr) {
    StringBuilder result = new StringBuilder();
    if (!Character.isWhitespace(inputStr.charAt(0)))
      result.append(Character.toUpperCase(inputStr.charAt(0)));
    else
      result.append(inputStr.charAt(0));
    for (int i = 1; i < inputStr.length(); i++) {
      if (!Character.isWhitespace(inputStr.charAt(i)) && Character.isWhitespace(inputStr.charAt(i - 1)))
        result.append(Character.toUpperCase(inputStr.charAt(i)));
      else
        result.append(inputStr.charAt(i));
    }
    return result.toString();
  }
}
