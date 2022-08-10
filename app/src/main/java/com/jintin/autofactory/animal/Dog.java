package com.jintin.autofactory.animal;

import com.jintin.autofactory.AutoElement;

@AutoElement(AnimalTags.DOG)
public class Dog implements Animal {
    @Override
    public String bark() {
        return "woo";
    }
}
