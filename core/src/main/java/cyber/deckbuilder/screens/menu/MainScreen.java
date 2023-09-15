package cyber.deckbuilder.screens.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import cyber.deckbuilder.CyberDeckBuilderGame;

public class MainScreen implements Screen {
    private CyberDeckBuilderGame parent;

    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Texture cyberArcher;
    private Texture enemy;
    private Stage stage;

    public MainScreen(CyberDeckBuilderGame cyberDeckBuilderGame) {
        parent = cyberDeckBuilderGame;

        batch = new SpriteBatch();
        cyberArcher = new Texture("CyberArcher.png");
        enemy = new Texture("Enemy-1.png");

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 120, 60);
        camera.update();

        stage = new Stage(new ScreenViewport());
        stage.getViewport().setCamera(camera);

        // Create a table that fills the screen. Everything else will go inside this table.
        Table table = new Table();
        table.setFillParent(true);
        // TODO disable debug
//        table.setDebug(true);

        Skin skin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));

        stage.addActor(table);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.7f, 0.7f, 1.0f, 1);

        camera.position.x=60;
        camera.update();
        batch.setProjectionMatrix(camera.combined);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();
        batch.draw(cyberArcher, 20, 20);
        batch.draw(enemy, 80, 20);
        batch.end();

        stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
        cyberArcher.dispose();
        enemy.dispose();
    }
}
