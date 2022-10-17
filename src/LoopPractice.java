public class LoopPractice extends World {

    public void go() {
    drawRandomShape();
        for (int x = 0; x < 10; x=x+1)
        {
            drawRandomShape();
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
        }
    }
    public void drawRandomShape() {
        int random = plane.random(0,3); //this will generate 0,1,2, not 1,2,3. its in [x,y) notation.
        System.out.println(random);
        plane.pausetime=0;
        if (random == 0) {
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.square(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.square(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.square(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.square(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.square(100);

        }
        if (random == 1) {
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.house(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.house(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.house(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.house(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.house(100);
        }
        if (random == 2) {
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.fillCircle(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.fillCircle(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.fillCircle(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.fillCircle(100);
            plane.teleport(plane.random(1,1000),plane.random(1,1000));
            plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
            plane.fillCircle(100);
        }
    }

}
