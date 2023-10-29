import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        {
            int[] colors = new int[]{1, 2, 3};
            float[] stars = new float[]{1.57f, 7.654f, 9.986f};
            int[] arr3 = new int[4];
            arr3[0] = 1;
            arr3[1] = 5;
            arr3[2]= 7;
            arr3[3] = 6;
            System.out.println("Массив 1 в правильном порядке: " + Arrays.toString(colors));
            System.out.println("Массив 2 в правильном порядке: " + Arrays.toString(stars));
            System.out.println("Массив 3 в правильном порядке: " + Arrays.toString(arr3));
            System.out.println("Массив 1 в неправильном порядке: ");
            for (int i = colors.length - 1; i >= 0; i--) {
                {if(colors[i] == colors[0])
                    System.out.print(colors[i] + " ");
                else System.out.print(colors[i] + ", ");}
            }
            System.out.println();
            System.out.println("Массив 2 в неправильном порядке: ");
            for (int i = stars.length - 1; i >= 0; i--) {
                {if(stars[i] == stars[0])
                    System.out.print(stars[i] + " ");
                else System.out.print(stars[i] + ", ");}
            }
            System.out.println();
            System.out.println("Массив 3 в неправильном порядке:  ");
            for (int i = arr3.length - 1; i >= 0; i--) {
                {{if(arr3[i] == arr3[0])
                    System.out.print(arr3[i] + " ");
                else System.out.print(arr3[i] + ", ");}}

            }
            for(int i = 0; i < colors.length; i++) {
                if(colors[i] % 2 == 1) {
                    colors[i]++;
                }
            }
            System.out.println();
            System.out.println(Arrays.toString(colors));
        }
    }
}