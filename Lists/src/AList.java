public class AList {

    Book[] AList;
    int size;
    private static final int DEFAULT_CAPACITY = 10;


    public AList(){
        this.AList = new Book[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void listAdd(Book p){
        if(size < AList.length){
            AList[size] = p;
            size++;
        }else{
            int newMax = AList.length*2;
            Book[] newAList = new Book[newMax];
            for(int i = 0; i < size; i++){
                newAList[i] = AList[i];
            }
            AList = newAList;
            AList[size] = p;
            size++;
        }
    }

    public void listRemove(int pos){
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
        }
        AList[pos] = null;
        for (int i = pos; i < size - 1; i++) {
            AList[i] = AList[i + 1];
        }
        AList[--size] = null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(AList[i]).append("\n");
        }
        return sb.toString();
    }

}
