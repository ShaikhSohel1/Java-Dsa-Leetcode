package Generics;

import java.util.Arrays;

public class CustomGenericWithTemplate<T> {
        private Object[] data;
        private static final int DEFAULT_SIZE=10;
        private int size = 0;

        CustomGenericWithTemplate(){
        this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T num) {
            if (isFull()){
                resize();
            }
            data[size++]= num;
        }

        public T remove(){
            T removed = (T)(data[--size]);
            return removed;
        }

        public void set(int index, T value){
            data[index] = value;
        }

        public boolean isFull(){
            return size == data.length;
        }

        public void resize(){

            Object[] temp = new Object[data.length * 2];

            for (int i=0; i< data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        @Override
        public String toString(){
            return "data ="+ Arrays.toString(data) +
                    ", size = " + size ;
        }






    public static void main(String[] args) {
//            CustomGenericWithTemplate<Integer> list = new CustomGenericWithTemplate<>();
//            list.add(1);
//            list.add(2);
//            list.remove();
//            list.add(3);
//            list.set(5,14);
//        System.out.println(list.toString());
        int i = 0;
        int j = 0;
        for (int k = 0; k < 5; k++) {
            if ((++i > 2) || (++j > 2)) {
                i++;
            }
        }
        System.out.println("i: "+ i + " " + "J:" + j);

    }
}
