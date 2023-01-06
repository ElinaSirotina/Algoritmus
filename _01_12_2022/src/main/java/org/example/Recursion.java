package org.example;

public class Recursion {
    public static int countConsonantRecursion(String str){

        return 0;
    }

    private static boolean isConsonant(char ch) {
        char letter = Character.toUpperCase(ch);
        return letter == 'A' ||
                letter == 'E' ||
                letter == 'I'||
                letter == 'O' ||
                letter == 'U';

    }

}
// countConsonantOther("hello", res = 0 , n = 0)
// letter = "h"; count = 0
//      countConsonantOther("hello", res = 0, n = 1)
//      letter = "e", count = 1
//          countConsonantOther("hello", res = 1, n = 2)
//          letter = "l", count = 0
//              countConsonantOther("hello", res = 1, n = 3)
//              letter = "l", count = 0
//                  countConsonantOther("hello", res = 1, n = 4)
//                  letter = "o", count = 1
//                      countConsonantOther("hello", res = 2, n = 5)
//                      n == "hello".length (5 =5)
//                      return 2 (res)

