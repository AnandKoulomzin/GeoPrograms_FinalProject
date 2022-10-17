public class B0_BasicLoop<squares> extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        for (int x = 0; x < 500; x = x + 100) {
            plane.teleport(100 + x, 150);
            plane.pausetime = plane.random(0,2);
            plane.trailWidth = plane.random(1, 5);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
            plane.square(100);
            plane.isTrail = false;
            plane.move(150);
            plane.isTrail = true;
            plane.trailWidth = plane.random(1, 5);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
            plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);
            plane.isTrail = false;
            plane.move(200);
            plane.isTrail = true;
            plane.trailWidth = plane.random(1, 5);
            plane.setColor(plane.random(0, 255), plane.random(0, 255), plane.random(0, 255));
            plane.square(100);
            plane.turn(90);
            plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);
            plane.move(100);
            plane.turn(120);
            plane.turn(270);
        }
        }
    }
