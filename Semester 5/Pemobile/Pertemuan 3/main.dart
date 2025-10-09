import 'cactus.dart';
import 'dino.dart';
import 'game_object.dart';
void main() {
  // Create game objects
  var dino = Dino(0, 0);
  var cactus = Cactus(10, 0);
  // Simulate game loop
  List<GameObject> gameObjects = [dino, cactus];
  for (var obj in gameObjects) {
    obj.update();
    obj.render();
  }
  // Trigger specific behavior
  dino.jump();
}
