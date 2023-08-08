package Temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class User {

    static Map<String,BUS> busMap = new HashMap<>(); 

    static  {
        busMap.put("A-D",new BUS("B1",50,50));
        busMap.put("A-C",new BUS("B2",10,100));
        busMap.put("A-B",new BUS("B3",10,80));
        busMap.put("A-D",new BUS("B4",15,100));
        busMap.put("A-D",new BUS("B5",40,80));

    }

    public static void main(String[] args) {
        User u1 = new User();
        u1.allocationBus(2,"A","D");
    }


    public void allocationBus(int noOfTickets, String src, String dest){
        String key = src+"-"+dest;
        BUS allocatedBus = busMap.get(key);

        if (allocatedBus!=null && allocatedBus.getBusCapacity() >= noOfTickets){
            int totalAmount = allocatedBus.getBusFare()* noOfTickets;
            System.out.println("Bus Allocated : " +  allocatedBus.getBusNumber());
            System.out.println("Total Fare  Of Jorney: "+ totalAmount);
        } else {
            System.out.println("No Bus Available For Given Criteria");
        }
    }







    static  class BUS{
        private String busNumber;
        private int busCapacity;
        private int busFare;

        public BUS(String busNumber, int busCapacity, int busFare){
            this.busCapacity = busCapacity;
            this.busNumber = busNumber;
            this.busFare= busFare;
        }

        public String getBusNumber(){
            return busNumber;
        }

        public int getBusCapacity(){
            return busCapacity;
        }

        public int getBusFare(){
            return busFare;
        }
    }


   }



