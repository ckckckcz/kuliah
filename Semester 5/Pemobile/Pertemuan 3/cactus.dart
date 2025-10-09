import 'game_object.dart';

class Cactus extends GameObject {
  Cactus(double x, double y) : super(x, y);
  void move() {
    print('Cactus is moving to the left...');
  }

  @override
  void render() {
    print('Rendering Cactus at position ($x, $y)');
  }

  @override
  void update() {
    move();
  }
}
