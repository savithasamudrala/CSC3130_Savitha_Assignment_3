public class Main {

    public static void main (String[] args){
        Book book1 = new Book("wireless networks", "Anke Berr", 14.99);
        Book book2 = new Book("crème waffles for dummies", "Piro Lane", 24.79);

        /*
        AList aList = new AList();
        SLList slList = new SLList();
        DLList dlList = new DLList();
         */


        AListGeneric aList = new AListGeneric();
        SLGeneric slList = new SLGeneric();
        DLGeneric dlList = new DLGeneric();


        System.out.println("Array:");
        System.out.println("Before adding book:");
        System.out.println(aList.toString());

        aList.listAdd(book1);
        aList.listAdd(book1);
        aList.listAdd(book2);
        System.out.println("After adding books:");
        System.out.println(aList.toString());


        aList.listRemove(1);
        System.out.println("After removing book at index 1:");
        System.out.println(aList.toString() + "\n");


        System.out.println("Singly Linked List:");
        System.out.println("Before adding book:");
        System.out.println(slList.toString());

        slList.listAdd(book1);
        slList.listAdd(book1);
        slList.listAdd(book2);
        System.out.println("After adding books:");
        System.out.println(slList.toString());


        slList.listRemove(1);
        System.out.println("After removing book at index 1:");
        System.out.println(slList.toString() + "\n");


        System.out.println("Doubly Linked List:");
        System.out.println("Before adding book:");
        System.out.println(dlList.toString());

        dlList.listAdd(book1);
        dlList.listAdd(book1);
        dlList.listAdd(book2);
        System.out.println("After adding books:");
        System.out.println(dlList.toString());


        dlList.listRemove(1);
        System.out.println("After removing book at index 1:");
        System.out.println(dlList.toString() + "\n");


    }


}
