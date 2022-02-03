public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean add(T element){
        if(element==null){
            super.add(element);
        }
        for(int i=0;i<this.size();i++){
            if(element.compareTo(this.get(i))<0){
                super.add(i,element);
                return true;
            }
        }
        return super.add(element);
    }

    public void add(int index, T element){
        add(element);
    }

    public T set (int index, T element){
        if(element==null){
            throw new IllegalArgumentException();
        }
        T old = get(index);
        remove(index);
        add(element);
        return old;
    }
}
