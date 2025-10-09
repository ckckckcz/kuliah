    abstract class GameObject {
      double x, y;
      GameObject(this.x, this.y);

      void render();
      void update();
    }