public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,2,2,3,4,5};
        int [] returnUniqueArr = returnUnique(arr);
        for(int element : returnUniqueArr)
        {
            int i = 0;
            for(int element2 : arr)
            {
                if(element == element2)
                {
                    i++;
                }
            }
            System.out.println(element + " wysąpiła w liście pierwotniej "+ i + " razy");
        }

    }

    public static int[] returnUnique(int[] arr) {
        int [] returnUniqueArr = new int[0];
        boolean check = false;
        for(int i = 0; i < arr.length ; i++)
        {
            if(returnUniqueArr.length == 0) {
                int [] tmp = new int[returnUniqueArr.length +1];
                tmp[i] = arr[i];
                returnUniqueArr = tmp;
            }
            else {

                for (int j : returnUniqueArr) {
                    if (j == arr[i]) {
                        check = true;
                        break;
                    }
                }
                if(!check)
                {
                    int [] tmp = new int[returnUniqueArr.length +1];
                    System.arraycopy(returnUniqueArr, 0, tmp, 0, tmp.length - 1);
                    tmp[tmp.length-1] = arr[i];
                    returnUniqueArr = tmp;
                }
                check = false;

            }
        }
        return  returnUniqueArr;
    }
}