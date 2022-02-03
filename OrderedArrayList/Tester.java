public class Tester{
    public static void main(String[] args){
        /*NoNullArrayList Tests
        NoNullArrayList<Integer> nonulllist = new NoNullArrayList<Integer>();
        Integer[] list = new Integer[]{1,null,3,6,null};
        for(Integer i:list){
            try{
                nonulllist.add(i);
                System.out.println("Adding "+i);
            } catch (IllegalArgumentException e){
                System.out.println("Can't add nulls");
            }
        }
        for(Integer i:nonulllist){
            System.out.print(i+" ");
        }
        System.out.println();
        try{
            nonulllist.set(2,8);
            nonulllist.set(2,null);
        } catch(IllegalArgumentException e){
            System.out.println("Tried adding null");
        }
        for(Integer i:nonulllist){
            System.out.print(i+" ");
        }
        System.out.println();
        */
        //OrderedArrayList Tests
        OrderedArrayList<Integer> orderedlist = new OrderedArrayList<Integer>();
        orderedlist.add(50);
        orderedlist.add(30);
        orderedlist.add(80);
        try{
            orderedlist.add(null);
        } catch (IllegalArgumentException e){
            System.out.println("Tried adding null");
        }
        try {
            orderedlist.set(4,10);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
        try {
            orderedlist.add(2,null);
        } catch (IllegalArgumentException e){
            System.out.println("Tried adding null");
        }
        try {
            orderedlist.set(2,null);
        } catch (IllegalArgumentException e){
            System.out.println("Tried adding null");
        }
        orderedlist.add(4,50);
        orderedlist.add(100,34);
        orderedlist.add(4,28);
        for(Integer i:orderedlist){
            System.out.print(i+" ");
        }

    }
}
