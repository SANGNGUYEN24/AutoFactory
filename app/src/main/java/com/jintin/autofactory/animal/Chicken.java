package com.jintin.autofactory.animal;

import com.jintin.autofactory.AutoElement;

@AutoElement(AnimalTags.CHICKEN)
public class Chicken implements Animal {
    @Override
    public String bark() {
        return "chip chip";
    }
}
