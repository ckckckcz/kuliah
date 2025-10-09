    abstract class Obstacle {
      double x, y;
      Obstacle(this.x, this.y);

      void render();
      void update();
    }