package Generics;

import java.util.Arrays;

public class CustomGeneric {
        private int[] data;
        private static final int DEFAULT_SIZE=10;
        private int size = 0;

        CustomGeneric(){
        this.data = new int[DEFAULT_SIZE];
        }

        public void add(int num) {
            if (isFull()){
                resize();
            }
            data[size++]= num;
        }

        public boolean isFull(){
            return size == data.length;
        }

        public void resize(){

            int[] temp = new int[data.length * 2];

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
            CustomGeneric list = new CustomGeneric();
            list.add(1);
            list.add(2);
        System.out.println(list.toString());

    }
}
