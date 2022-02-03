public class Sorts{
    public static void bubbleSort(int[] data){
        boolean sorted = false;
        for(int i=0;i<data.length-1 && !sorted;i++){
            sorted = true;
            for(int j=1;j<data.length-i;j++){
                if(data[j-1]>data[j]){
                    int temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void selectionSort(int[] data){
        for(int i=0;i<data.length;i++){
            int indmin = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[indmin]){
                    indmin = j;
                }
            }
            int temp = data[i];
            data[i] = data[indmin];
            data[indmin] = temp;
        }
    }

    public static void insertionSort(int[] data){
        int indmin,val;
        for(int i=1;i<data.length;i++){
            indmin = i;
            val = data[i];
            while(indmin>0&&data[indmin-1]>val){
                data[indmin]=data[indmin-1];
                indmin--;
            }
            data[indmin] = val;
        }
    }

}
