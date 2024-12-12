package U6T2_Lab1;

public class Main {
    public static void main(String args[]) {
        int[] temps = {32, 35, 40, 31, 29, 33, 50, 27};
boolean[] result = ArrayAlgorithms.isFreezing(temps);
for (int i = 0; i < result.length; i++) {
    System.out.print(result[i] + " ");
}
System.out.println();
// original array is NOT modified
for (int i = 0; i < temps.length; i++) {
    System.out.print(temps[i] + " ");
}
System.out.println();
int[] temps2 = {10, 20, 30, 0, -20};
boolean[] result2 = ArrayAlgorithms.isFreezing(temps2);
for (int i = 0; i < result2.length; i++) {
    System.out.print(result2[i] + " ");
}
System.out.println();
int[] temps3 = {40, 45, 50, 60, 55};
boolean[] result3 = ArrayAlgorithms.isFreezing(temps3);
for (int i = 0; i < result3.length; i++) {
    System.out.print(result3[i] + " ");
}

    }

}
