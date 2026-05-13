import java.awt.*;
import java.awt.event.*;

class calculator extends Frame implements ItemListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    String msg = "";
    Choice ch;

    calculator() {

        l1 = new Label("Enter first number");
        l2 = new Label("Enter second number");
        l3 = new Label("Result");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        ch = new Choice();

        ch.add("Select Operator");
        ch.add("+");
        ch.add("-");
        ch.add("*");
        ch.add("/");

        ch.addItemListener(this);

        setLayout(new FlowLayout());

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(ch);
    }

    public void itemStateChanged(ItemEvent ie) {

        int res = 0;

        String op = ch.getSelectedItem();

        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());

        if (op.equals("+")) {

            res = x + y;
            t3.setText(res + "");

        } else if (op.equals("-")) {

            res = x - y;
            t3.setText(res + "");

        } else if (op.equals("*")) {

            res = x * y;
            t3.setText(res + "");

        } else if (op.equals("/")) {

            res = x / y;
            t3.setText(res + "");

        } else {

            msg = "Select Operator";
            t3.setText(msg);
        }
    }

    public static void main(String args[]) {

        calculator c = new calculator();

        c.setTitle("My First Window");

        c.setSize(150, 300);

        c.setVisible(true);

        c.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {

                System.exit(0);
            }
        });
    }
}