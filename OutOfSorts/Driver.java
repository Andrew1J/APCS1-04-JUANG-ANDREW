import java.util.Arrays;
import java.util.Collections;
public class Driver{
  public static void main(String[]args){
    if(args.length < 2){
      System.out.println("usage: java Driver SIZE ALGO [STYLE]");
      System.out.println("supported ALGO: bubble,selection,insertion,test");
      System.out.println("supported STYLE: random,equal,sorted,reversed");
    }else{


      int[] randData = new int[Integer.parseInt(args[0])];

      //overhead: 1 random array generation.
      if(args.length < 3 || args[2].equals("random")){
          for(int i = 0 ; i < randData.length; i++){
              randData[i] =(int)(Math.random()*10000);
          }
      }else if(args[2].equals("equal")){
          int num = (int)(Math.random()*10000);
          for(int i = 0 ; i < randData.length; i++){
              randData[i] = num;
          }
      }else if(args[2].equals("sorted")){
          for(int i = 0 ; i < randData.length; i++){
              randData[i] =(int)(Math.random()*10000);
          }
          Arrays.sort(randData);
      }else if(args[2].equals("reversed")){
          for(int i = 0 ; i < randData.length; i++){
              randData[i] =(int)(Math.random()*10000);
          }
	      Arrays.sort(randData);
          int temp;
          for(int i=0;i<randData.length/2;i++){
              temp = randData[i];
              randData[i] = randData[randData.length-i-1];
              randData[randData.length-i-1] = temp;
          }
      }

      if(args[1].equals("bubble")){
        Sorts.bubbleSort(randData);
      }
      else if(args[1].equals("selection")){
        Sorts.selectionSort(randData);
      }
      else if(args[1].equals("insertion")){
        Sorts.insertionSort(randData);
      }

      //TEST MODE! This lets you see if your algorithm fails
      //for a particular type of array, or size of array.
      //This is not meant to be a timed test...
      else if(args[1].equals("test")){

        int[] randDataBubble = Arrays.copyOf(randData,randData.length);
        int[] randDataSelection = Arrays.copyOf(randData,randData.length);
        int[] randDataInsertion = Arrays.copyOf(randData,randData.length);
        Arrays.sort(randData);
        Sorts.bubbleSort(randDataBubble);
        Sorts.selectionSort(randDataSelection);
        Sorts.insertionSort(randDataInsertion);

        if( Arrays.equals(randData,randDataBubble)){
          System.out.println("Bubble Correct!");
        }else{
         System.out.println("Bubble Not Correct!!!!!!!!!11oneeleven");
        }

        if( Arrays.equals(randData,randDataSelection)){
          System.out.println("Selection Correct!");
        }else{
         System.out.println("Selection Not Correct!!!!!!!!!11oneeleven");
        }

        if( Arrays.equals(randData,randDataInsertion)){
          System.out.println("Insertion Correct!");
        }else{
         System.out.println("Insertion Not Correct!!!!!!!!!11oneeleven");
        }
      }
    }
  }
}
