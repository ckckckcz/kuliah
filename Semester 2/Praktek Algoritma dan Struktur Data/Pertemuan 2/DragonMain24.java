public class DragonMain24 {
    public static void main(String[] args) {
       
        Dragon24 dg1 = new Dragon24();
        dg1.height = 20;
        dg1.width = 20;
        dg1.x = 10;
        dg1.y = 15;

        dg1.printPosition();

        for (int i = 0; i<20; i++) {
            dg1.moveRight();
            dg1.moveUp();
            dg1.printPosition();
        }

    }
}
