package com.jintin.autofactory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.jintin.autofactory.animal.Animal;
import com.jintin.autofactory.animal.AnimalFactory;
import com.jintin.autofactory.animal.AnimalTags;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal cat = AnimalFactory.createAnimal(AnimalTags.CAT);
        Animal dog = AnimalFactory.createAnimal(AnimalTags.DOG);

        TextView label = findViewById(R.id.label);
        label.setText(dog.bark());
    }
}
