package com.icolak.day34_abstraction;

import com.icolak.day34_abstraction.animalTask.Playable;
import com.icolak.day34_abstraction.animalTask.Swimmable;

public class Person implements Swimmable, Playable {
    @Override
    public void play() {
    }

    @Override
    public void swim() {
    }
}