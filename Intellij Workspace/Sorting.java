public class Sorting {
    public static void main(String[] args) {
        int[] num = new int[]{2, 3, 1, 4, 18, 8, 9, 10, 16, 12};
        int number=0;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        for (int i = 0; i < num.length; i++) { //for indexing from 0
            for (int j = i+1; j < num.length; j++) { //for starting from next index to compare
                if(num[i] > num[j]) {
                    number = num[i];
                    num[i] = num[j];
                    num[j] = number;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }

    }
    }

