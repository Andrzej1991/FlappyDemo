package com.andrzejcom.states;

import com.andrzejcom.FlappyDemo;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Andrzej on 2017-06-13.
 */

public class MenuState extends State {
    private Texture backgound;
    private Texture playBtn;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        backgound = new Texture("bg.png");
        playBtn = new Texture("playBtn.png");
    }

    @Override
    public void handlerInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dr) {
        handlerInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(backgound, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(playBtn, (FlappyDemo.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyDemo.HEIGHT / 2);
        sb.end();
    }

    @Override
    public void dispose() {
        backgound.dispose();
        playBtn.dispose();
    }
}
