package com.jintin.autofactory.vehicle;

import com.jintin.autofactory.AutoElement;

@AutoElement(VehicleTags.BICYCLE)
public class Bicycle implements Vehicle{
    @Override
    public void getModel() {
        System.out.println("I am a bicycle");
    }
}
