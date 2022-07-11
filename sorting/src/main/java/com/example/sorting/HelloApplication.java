package com.example.sorting;

public class HelloApplication{

    public static void main(String[] args) {
        String nomi[];
        String appoggio;
        nomi=new String[6];
        nomi[1]="Alessio";
        nomi[0]="Bachisio";
        nomi[2]="Claudio";
        nomi[3]="Simone";
        nomi[4]="Luca";
        nomi[5]="Salvatore";
        int res;
        //nomi[1] inferiore a nomi[0]-> switch

        for(int i=0;i<nomi.length;i++){
            boolean flag=false;
            for(int j=0;j<nomi.length-1;j++){
                res=nomi[j].compareTo(nomi[j+1]);
                if(res>0){
                    appoggio=nomi[j];
                    nomi[j]=nomi[j+1];
                    nomi[j+1]=appoggio;
                    flag=true;
                }
            }
            if(!flag) break;
        }
    }
}