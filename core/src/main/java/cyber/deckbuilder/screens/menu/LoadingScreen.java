package cyber.deckbuilder.screens.menu;

import com.badlogic.gdx.Screen;
import cyber.deckbuilder.CyberDeckBuilderGame;

public class LoadingScreen implements Screen {
    private CyberDeckBuilderGame parent;

    public LoadingScreen(CyberDeckBuilderGame cyberDeckBuilderGame) {
        parent = cyberDeckBuilderGame;
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        parent.changeScreen(CyberDeckBuilderGame.MENU);
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
    }
}
