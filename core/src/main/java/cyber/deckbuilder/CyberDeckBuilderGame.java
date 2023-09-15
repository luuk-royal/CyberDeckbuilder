package cyber.deckbuilder;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import cyber.deckbuilder.screens.menu.*;

public class CyberDeckBuilderGame extends Game {

    private LoadingScreen loadingScreen;
    private PreferencesScreen preferencesScreen;
    private MenuScreen menuScreen;
    private MainScreen mainScreen;
    private EndScreen endScreen;

    public final static int MENU = 0;
    public final static int PREFERENCES = 1;
    public final static int APPLICATION = 2;
    public final static int ENDGAME = 3;
    private AppPreferences appPreferences;

    private SpriteBatch batch;
    private Texture image;
    private Texture cyberArcher;

    @Override
    public void create() {
        this.appPreferences = new AppPreferences();

        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
        cyberArcher = new Texture("CyberArcher.png");

        loadingScreen = new LoadingScreen(this);
        setScreen(loadingScreen);
    }

//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(image, 140, 210);
//        batch.draw(cyberArcher, 0, 0);
//        batch.end();
//    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
        cyberArcher.dispose();
    }

    public void changeScreen(int screen) {
        switch (screen) {
            case MENU:
                if (menuScreen == null) menuScreen = new MenuScreen(this);
                this.setScreen(menuScreen);
                break;
            case PREFERENCES:
                if (preferencesScreen == null) preferencesScreen = new PreferencesScreen(this);
                this.setScreen(preferencesScreen);
                break;
            case APPLICATION:
                if (mainScreen == null) mainScreen = new MainScreen(this);
                this.setScreen(mainScreen);
                break;
            case ENDGAME:
                if (endScreen == null) endScreen = new EndScreen(this);
                this.setScreen(endScreen);
                break;
        }
    }

    public AppPreferences getPreferences() {
        return appPreferences;
    }
}
