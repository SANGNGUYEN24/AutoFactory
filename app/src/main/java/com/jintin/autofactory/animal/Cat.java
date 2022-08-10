package com.jintin.autofactory.animal;

import com.jintin.autofactory.AutoElement;

@AutoElement(AnimalTags.CAT)
public class Cat implements Animal {
    @Override
    public String bark() {
        return "meow";
    }
}
