package ua.hillel.martyniuk.lesson01;

/*1. Написать метод считающий сколько в строке встречается определеный символ.
Посчитать в ваших инициалах из первой задачи сколько пробелов и звездочек.*/
public class Name {
    public static void main(String[] args) {

        String str0 = new String("* *         * *   * * * * * * *   * * * * * * ");
        String str1 = new String("*  *       *  *   *           *   *           *");
        String str2 = new String("*   *     *   *   *           *   *           *");
        String str3 = new String("*    *   *    *   *           *   *          *");
        String str4 = new String("*     * *     *   *           *   * * * * * *");
        String str5 = new String("*             *   *           *   *          *");
        String str6 = new String("*             *   *           *   *           *");
        String str7 = new String("*             *   *           *   *           *");
        String str8 = new String("*             *   * * * * * * *   * * * * * *");
        System.out.println(str0.length() + str1.length() + str2.length()
                + str3.length() + str4.length() + str5.length()
                + str6.length() + str7.length() + str8.length());

    }
}
