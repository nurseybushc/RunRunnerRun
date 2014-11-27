package ca.csf.gameworld;

import ca.csf.gameobjects.Runner;

public class GameWorld {

    private Runner runner;

    public GameWorld(){
        runner = new Runner(33, 15, 17, 12);
    }

    public void update(float delta){
        //Gdx.app.log("GameWorld", "update");
        runner.update(delta);
    }

    public Runner getRunner(){
        return runner;
    }
}