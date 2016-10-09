package fr.monolog.game.screen;



import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import fr.monolog.game.Main;
import fr.monolog.game.core.actor.Player;

public class GameScreen implements Screen {
    final Main game;

    private Stage stage;
    private OrthographicCamera camera;
    private Texture image;

    public GameScreen(final Main game) {
        this.game = game;
        stage = new Stage(new ScreenViewport(), this.game.batch);
        Gdx.input.setInputProcessor(stage);
        final Player myActor = new Player();
        stage.addActor(myActor);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

}








