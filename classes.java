import javax.swing.*;
public class classe {
    public classe() {
    }
    public int Chance(int chute, int real) {
        if (chute > real) {
            return 1;
        } else if (chute < real) {
            return 2;
        }
        else{
            return 3;
        }
    }



}
