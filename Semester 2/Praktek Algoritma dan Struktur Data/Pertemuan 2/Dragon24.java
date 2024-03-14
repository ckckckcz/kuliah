public class Dragon24{
    int x,y,width,height;

    void moveLeft() {
        if (x > 0) {
            x -= 1;
        } else {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        if (x < width) {
            x += 1;
        } else {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        if (y > 0) {
            y -= 1;
        } else {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        if (x < height) {
            x += 1;
        } else {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Position: " + x + ", " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
        System.exit(0);
    }
}

// LIST


// public class quiz {
    
//     int keliling;
//     int sisi;

//     public quiz(){
//     }

//     public quiz(int keliling, int sisi){
//         this.sisi = sisi;
//         keliling = sisi * 4;
//     }

//     public static void main(String[] args) {
//         quiz p[] = new quiz[2];
//     }
// }

