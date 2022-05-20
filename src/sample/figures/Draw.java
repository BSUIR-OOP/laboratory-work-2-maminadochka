package sample.figures;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Draw {

    protected GraphicsContext graphicsContext;
    protected Figure figureForDrawing;


    public Draw(Figure figureForDrawing, GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        this.figureForDrawing = figureForDrawing;
    }

    public void drawFigure() {
        graphicsContext.beginPath();
        graphicsContext.moveTo(figureForDrawing.points.get(0).getX(), figureForDrawing.points.get(0).getY());
        for(int i = 1; i<figureForDrawing.points.size(); i++) {
            graphicsContext.lineTo(figureForDrawing.points.get(i).getX(), figureForDrawing.points.get(i).getY());
        }
        graphicsContext.lineTo(figureForDrawing.points.get(0).getX(), figureForDrawing.points.get(0).getY());
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

}
