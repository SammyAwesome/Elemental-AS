package com.example.sam.elemental;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by Sam on 12/18/2017.
 */

public class Obstacle extends GameObject{
    private Rect rectangle;
    private int color;
    public Obstacle(Rect rectangle, int color){
        this.rectangle = rectangle;
        this.color = color;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void update() {

    }
}
