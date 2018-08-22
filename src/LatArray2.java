/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edito
 */

/**
 *
 * @author ASUS
 */
public class LatArray2 {
    public static void main(String[] args){
        int nilai [] = {70,80,65};
        
        double ratarata =0.0;
        for (int i=0; i <nilai.length; i++)ratarata+=nilai[i];
        ratarata/=nilai.length;
        System.out.println("Nilai rata rata = "+ratarata);
    }
    }

