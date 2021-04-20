package uts;

import java.util.Scanner;

public class Nomor1 {
  public static void printData(String[] args) {
         int[] data={3, 10, 4, 2, 8, 13};
        for(int i=0;i<data.length;i++){
            System.out.print(data[i] +" ");
        }
  public static void insertionSort(int[] data){      
        for (int i=1;i<data.length;i++){
            int key=data[i];
            int j=i-1;
            while((j>=0)&&(data[j]>key)){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=key;
        }
        
        System.out.println("\nsorted");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        
    }  
}
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("nilai tengah = "+middle);
            if (key == data[middle]){
                System.out.println("nilai "+key+", berada di indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("kanan ->");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {2, 3, 4, 8, 10, 13};
        System.out.println("before");
        printData(nilai);
        insertionSort(nilai);
        System.out.println("\nafter");
        printData(nilai);
        
        System.out.println("\nmasukan data yang ingin di cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
        
        System.out.println();
        System.out.println("Nur Halisah Fasya");
    }
}
