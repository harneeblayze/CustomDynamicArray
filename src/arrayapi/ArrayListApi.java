/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapi;

/**
 *
 * @author Harny
 * 3 key variables are initialCapacity: which is specified if you want to give a
 * size to your dynamic array.
 * data: of type object which is the data to be stored/held in this data structure
 * size: the size of the data at every point should be known
 */
public class ArrayListApi {
    int initialCapacity;
    Object[] data;
    int size;
    
    public ArrayListApi(int capacity){
        this.initialCapacity = capacity;
        this.data = new Object[initialCapacity];
    }
    
    //get, set, insert, delete, resize, isEmpty, contains, add
    
    public Object get(int index){
        //O(1)
        return data[index];
    }
    
    public void set(int index, Object value){
         //O(1)
        data[index]= value;
    }
    
    public boolean isEmpty(){
         //O(1)
        return size == 0;
    }
    
    private void resize(){
         //O(n)
         Object []newData = new Object[initialCapacity*2];
         //copy all elements in old to new array
         for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
            
        }
         this.data = newData;
        initialCapacity*=2;
    }
    
    public boolean contains(Object value){
        //at worst it iterates through the whole list till the end
        //the more the size of data, the longer it takes
        //O(n) time
        if(size == 0){
            return false;
        }
        for (Object data1 : data) {
            //Object object = data[i];
            if (data1 == value) {
                return true;    
            }
        }
        return false;
    }
    
    public void insert(int index, Object value){
        //O(n)
        if(size == initialCapacity){
            resize();
        }
        for (int i = size-1; i >= index; i--) {
            //Object object = data[i];
           // = ;
           //copy up values to create space for the specified index
            data[i+1] = data[i];
            
        }
        data[index] = value;
        size++;
    }
    
    public void delete(int index){
        //O(n)
        for (int i = index; i < size-1; i++) {
            //Object object = data[i];
            data[i] = data[i+1];
            
        }
        data[size-1] = null;
        size--;
    }
    
    public void add(Object value){
        //O(1)
        if(initialCapacity == size){
            resize();
        }
        data[size]= value;
        size++;
    }
    
}
