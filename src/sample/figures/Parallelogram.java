package sample.figures;

public class Parallelogram extends Figure {

    @Override
    public void AddPoints(Point x, Point y) {
        points.add(new Point(x.getX() + Math.abs(x.getX() - y.getX()) / 3.0D, x.getY()));
        points.add(new Point(y.getX() + Math.abs(x.getX() - y.getX()) / 3.0D, x.getY()));
        points.add(y);
        points.add(new Point(x.getX(), y.getY()));
    }
}

