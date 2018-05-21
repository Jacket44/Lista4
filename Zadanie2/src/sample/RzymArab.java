import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RzymArab {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
    }
}

class MyFrame extends Frame implements ActionListener {
    TextArea LineOfCommands;
    TextArea Result;

    MyFrame() {
        super("Konwerter Liczb");
        setBounds(500, 500, 350, 300);
        setLayout(new FlowLayout());
        addWindowListener(new MyWindowsAdapter());
        LineOfCommands = new TextArea(1, 40);
        Button OK = new Button("   Zamien   ");
        OK.addActionListener(this);
        Result = new TextArea(10, 40);
        add(LineOfCommands);
        add(OK);
        add(Result);
        setResizable(false);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("   Zamien   ")) ;
        {
            try {
                Process child = Runtime.getRuntime().exec("RzymArab.exe " + LineOfCommands.getText());
                BufferedReader in = new BufferedReader(new InputStreamReader(child.getInputStream()));
                String c;
                while ((c = in.readLine()) != null) {
                    Result.append(c + "\n");
                }
                in.close();
            } catch (Exception f) {
                Result.setText("BLAD!!!!!");
            }
        }
    }

    class MyWindowsAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}

