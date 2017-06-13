package com.andrzejcom.states;

import com.andrzejcom.FlappyDemo;
import com.andrzejcom.sprites.Bird;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Andrzej on 2017-06-13.
 */

public class PlayState extends State {
    private Bird bird;

    protected PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Bird(50, 100);
        cam.setToOrtho(false, FlappyDemo.WIDTH / 2, FlappyDemo.HEIGHT / 2);
    }

    @Override
    protected void handlerInput() {

    }

    @Override
    public void update(float dr) {
        handlerInput();
        bird.update(dr);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bird.getBird(), bird.getPosition().x, bird.getPosition().y);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
