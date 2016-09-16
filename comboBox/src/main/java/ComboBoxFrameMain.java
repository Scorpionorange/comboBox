import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/12.
 */
public class ComboBoxFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new ComboBoxFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Combo Box Frame Main");
            frame.setVisible(true);
            frame.setSize(700, 200);
        });
    }
}
