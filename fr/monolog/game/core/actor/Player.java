package fr.monolog.game.core.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;


public class Player extends Actor{
    Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));
    float actorX = 0, actorY = 0;
    public boolean started = false;

    public Player(){

        this.setTouchable(Touchable.enabled);
        setBounds(actorX,actorY,texture.getWidth(),texture.getHeight());
        addListener(new InputListener(){
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                ((Player)event.getTarget()).started = true;
                System.out.print("ok");
                return true;
            }
        });
    }

    @Override
    public void draw(Batch batch, float alpha){
        batch.draw(texture,actorX,actorY);
    }

    @Override
    public void act(float delta){
        if(started){
            actorX+=5;
        }
    }
}
