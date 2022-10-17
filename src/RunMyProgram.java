

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new FinalGeoProgramsPicture()   );
        run.planeIcon = "plane.png";
        run.pictureFileName="Desert.jpeg3.jpeg";
        run.HEIGHT=432;
        run.WIDTH=800;
        run.Refresh();

        //new Thread(run).start();
    }
}
