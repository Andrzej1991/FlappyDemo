package com.andrzejcom.states;

import com.andrzejcom.FlappyDemo;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Andrzej on 2017-06-13.
 */

public class PlayState extends State {
    private Texture bird;

    protected PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Texture("bird.png");
        cam.setToOrtho(false, FlappyDemo.WIDTH /2, FlappyDemo.HEIGHT / 2);
    }

    @Override
    protected void handlerInput() {

    }

    @Override
    public void update(float dr) {
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird, 50, 50);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
