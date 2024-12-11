package U6T2_Lab1;

public class ArrayAlgorithms {
    /** Returns the average of all values in numList as a double.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static double average(int[] numList) {
    double sum = 0.0;
    for (int i = 0; i < numList.length; i++) {
        sum += numList[i];
    }
    sum /= numList.length;
    return sum;
  }
  /** Returns the value in numList that represents the minimum
   * value in numList.
   *
   *  PRECONDITION: numList.length > 0
   */
  public static int minimum(int[] numList) {
    int min = numList[0];
    for (int i = 1; i < numList.length; i++) {
        if (numList[i] < numList[i - 1]) {
            min = numList[i];
        }
    }
    return min;
  }
   /** Returns the number of Strings in strList that contain the target.
   *
   *  PRECONDITION: strList.length > 0
   */
  public static int howManyContain(String[] strList, String target) {
    int count = 0;
    for (int i = 0; i < strList.length; i++) {
        if (strList[i].indexOf(target) != -1) {
            count++;
        }
    }
    return count;
  }
    /** Returns an array containing all characters in myStr, in order.
   *
   *  PRECONDITION: myStr.length() > 0
   */
  public static String[] stringToArray(String myStr) {
    String[] strArr = new String[myStr.length()];
    for (int i = 0; i < myStr.length(); i++) {
        String character = myStr.substring(i, i + 1);
        strArr[i] = character;
    }
    return strArr;
  }
  /**  This method checks each Person in the people array, and if they
    *  are an adult (at least 18 years old), they introduce themselves
    *  (i.e. by calling the introduce() method)
    *
    *  PRECONDITION: people.length > 0
    */
    public static void introduceAdults(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() >= 18) {
                people[i].introduce();
            }
        }
      }
        /** Prints each String in wordList, on its own line, in reverse order;
   *  the characters of each string are also reversed.
   *
   *  PRECONDITION: wordList.length > 0
   */
  public static void reversePrint(String[] wordList) {
    for (int i = wordList.length - 1; i >= 0; i--) {
        String currentStr = wordList[i];
        for (int j = currentStr.length() - 1; j >= 0; j--) {
            System.out.print(currentStr.substring(j, j + 1));
        }
        System.out.println();
    }
  }
    /** Returns a new array containing all elements from arr1 combined with 
   *  all elements from arr2; arr1's elements should be followed by
   *  arr2's elements
   *
   *  PRECONDITION: arr1.length > 0, arr2.length > 0
   */
  public static int[] combine(int[] arr1, int[] arr2) {
    int combinedLength = arr1.length + arr2.length;
    int[] combined = new int [combinedLength];
    for (int i = 0; i < arr1.length; i++) {
        combined[i] = arr1[i];
    }
    for (int j = arr1.length; j < combinedLength; j++) {
        combined[j] = arr2[j - arr1.length];
    }
    return combined;
  }


}
