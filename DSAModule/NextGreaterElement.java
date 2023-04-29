public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 4, 8, 1};
        int[] tempArray = new int[arr.length];
        int flag = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length - 1; j++) {
                if(arr[i] < arr[j+1]) {
                    tempArray[i] = arr[j+1];
                    flag = 0;
                    break;
                }
                else 
                    flag = 1;
            }
            if(flag == 1) 
                tempArray[i] = -1;
        }

        for(int i = 0; i < tempArray.length; i++) {
            System.out.print(tempArray[i] + " ");
        }
    }
}