package com.stackroute.pe3;

public class ConsecutiveNum {

    public boolean checkCons(String in){

        String[] nums = in.split(",");

        for (int i=0;i<6;i++){
            if(Integer.parseInt(nums[i])>=Integer.parseInt(nums[i+1])){
                return false;
            }
        }

        return true;
    }

}