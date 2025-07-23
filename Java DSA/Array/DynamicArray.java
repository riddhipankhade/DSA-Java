class DynamicArray {
    int size;
    int[] arr;
    int capacity;


    public DynamicArray(int capacity){
        if(capacity > 0){
            this.capacity = capacity;
            arr = new int[capacity];
        }else{
            System.out.println("Enter array size above 0");
        }
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
         if (size == capacity) {
        resize(); // make space
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        int lastElement = arr[size-1];
        size--;
        return lastElement;
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for(int i=0;i<size;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}

