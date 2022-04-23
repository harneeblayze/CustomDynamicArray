/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapi;

/**
 *
 * @author Harny
 */
public class ArrayApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayListApi arrayList = new ArrayListApi(2);
        System.out.println("array empty? "+arrayList.isEmpty());
        arrayList.add(2);
        arrayList.add("6");
        System.out.println("array contains value? " +arrayList.contains(2));
        System.out.println("array contains value? " +arrayList.contains(1));
        System.out.println("array get value? " +arrayList.get(1));
        arrayList.set(0, 7);
        System.out.println("array set value? " +arrayList.get(0));
        arrayList.insert(1, 4);
        System.out.println("size after insert is: " +arrayList.size);
        System.out.println("array get value? " +arrayList.get(1));
        arrayList.delete(0);
        System.out.println("size after delete is: "+ arrayList.size);
    }
    
}
