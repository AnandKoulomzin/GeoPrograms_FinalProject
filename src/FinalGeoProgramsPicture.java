public class FinalGeoProgramsPicture extends World {
    public int red;
    public int blue;
    public int green;
    public void go() {
        plane.pausetime = 0;
        plane.showBackGround();
        System.out.println();
        plane.teleport(18, 185);
        for (int row = 0; row < 432; row = row + 50) {
            for (int col = 0; col < 800; col = col + 100) {
                {
                    plane.teleport(col + 10, row + 50);
                    plane.square(10);
                    plane.turn(90);
                    plane.triangle(10);
                    plane.isTrail = false;
                    plane.turn(120);
                    plane.move(100);
                    plane.turn(270);
                }
            }
        }
        sky();
    }
    public void sky() {
        plane.teleport(0,0);
        plane.pausetime=0;
        plane.isTrail=true;
        int random = plane.random(0, 2);
        System.out.println(random);
        if (random == 0) {
            for (int row = 0; row < 42; row++) {
                for (int col = 0; col < 800; col++) {
                    plane.teleport(col, row);
                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();
                   if (300 > red && green < 300 && blue < 300 && red > 180 && green > 180 && blue > 180) {
                       plane.setPixelColor(135, 206, 255);
                    }
                }
            }
            plane.teleport(297,56);
            plane.setColor(250,250,0);
            plane.trailWidth=5;
            plane.fillCircle(20);
        }
        if (random == 1) {
            plane.teleport(0,0);
            for (int row = 0; row < 42; row++) {
                for (int col = 0; col < 800; col++) {
                    plane.teleport(col, row);
                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();
                    if (300 > red && green < 300 && blue < 300 && red > 180 && green > 180 && blue > 180)
                    { plane.setPixelColor(0, 0, 0);
                    }
                }
            }
            plane.teleport(297,56);
            plane.setColor(220,220,220);
            plane.trailWidth=5;
            plane.fillCircle(20);
        }
    }
}
