package conway;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ConwayCanvasApp extends Application {

    private final int BREDDE = 600;
    private final int HØYDE = 600;
    private final int RADER = 100;
    private final int KOLONNER = 100;

    private final int CELLE_BREDDE = BREDDE / KOLONNER;
    private final int CELLE_HØYDE = HØYDE / RADER;

    private final int INTERVALL = 50;
    private final double HASTIGHET = 1.0;

    private final Color ALIVE = Color.BLUE;
    private final Color DEAD = Color.WHITE;

    private Verden V = new Verden(RADER, KOLONNER);

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Canvas canvas = new Canvas(BREDDE, HØYDE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Conway's Game of Life");
        
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(INTERVALL), e -> step(canvas)));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.setRate(HASTIGHET);
        animation.play();

        stage.show();
    }

    protected void step(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int r = 0; r < RADER; r++) {
            for (int k = 0; k < KOLONNER; k++) {
                if (V.iLive(r, k)) {
                    gc.setFill(ALIVE);
                } else {
                    gc.setFill(DEAD);
                }
                gc.fillRect(k * CELLE_BREDDE, r * CELLE_HØYDE, CELLE_BREDDE, CELLE_HØYDE);
            }
        }
        V.nyGenerasjon();
    }

    public static void main(String[] args) {
        launch(args);
    }
}