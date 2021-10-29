import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Float;
import java.util.InputMismatchException;

public class Coin {
    private static LayoutManager Float;

    public static void main(String [] args) {
        String currency1 = "Birr", currency2 = "USD", currency3 = "Euro", currency4 = "Pound";
        //Frame
        JFrame fConvertor = new JFrame("Currency Convertor");
        fConvertor.setBounds(200, 300, 370, 220);
        fConvertor.setResizable(false);

        fConvertor.setDefaultCloseOperation(fConvertor.EXIT_ON_CLOSE);
        fConvertor.setLayout(Float);

        //Label
        JLabel lblFrom = new JLabel("From");
        lblFrom.setBounds(30, 10, 70, 20);

        JLabel lblTo = new JLabel("To");
        lblTo.setBounds(150, 10, 70, 20);


        //ComboBox
        JComboBox comboFrom = new JComboBox();

        comboFrom.addItem(currency1);
        comboFrom.addItem(currency2);
        comboFrom.addItem(currency3);
        comboFrom.addItem(currency4);
        comboFrom.setBounds(30, 30, 70, 20);
        ;

        JComboBox comboTo = new JComboBox();
        comboTo.addItem(currency1);
        comboTo.addItem(currency2);
        comboTo.addItem(currency3);
        comboTo.addItem(currency4);
        comboTo.setBounds(150, 30, 70, 20);

        //Label
        JLabel lblPrompt = new JLabel("Enter the amount of money you want to convert: ");
        lblPrompt.setBounds(30, 80, 300, 20);

        //TextField
        JTextField txtInput = new JTextField();
        txtInput.setBounds(30, 110, 70, 20);

        //Button
        JButton btnConvert = new JButton("Convert");
        btnConvert.setBounds(150, 110, 100, 20);

        //Label
        JLabel lblOutput = new JLabel();
        lblOutput.setBounds(30, 150, 300, 20);

        fConvertor.add(lblFrom);
        fConvertor.add(comboFrom);
        fConvertor.add(lblTo);
        fConvertor.add(comboTo);
        fConvertor.add(lblPrompt);
        fConvertor.add(txtInput);
        fConvertor.add(btnConvert);
        fConvertor.add(lblOutput);
        fConvertor.setVisible(true);

        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String c1 = comboFrom.getSelectedItem().toString();
                String c2 = comboTo.getSelectedItem().toString();

               try {
                   double input = Double.parseDouble(txtInput.getText());

                   double result = 0;

                   if (c1.equals("Birr") && c2.equals("Birr")) {
                       result = input;
                       lblOutput.setText("Birr "+result);
                   }
                   else if (c1.equals("Birr") && c2.equals("USD")) {
                       result = input * 0.022;
                       lblOutput.setText("USD "+ result);
                   }
                   else if (c1.equals("Birr") && c2.equals("Euro")){
                       result = input * 0.018;
                       lblOutput.setText("Euro " + result);
                   }
                   else if (c1.equals("Birr") && c2.equals("Pound")){
                       result = input * 0.016;
                       lblOutput.setText("Pound " + result);
                   }
                   else if(c1.equals("USD") && c2.equals("Birr")){
                       result = input * 45.71;
                       lblOutput.setText("Birr " + result);
                   }
                   else if(c1.equals("USD") && c2.equals("USD")){
                        result = input;
                        lblOutput.setText("USD " + result);
                   }
                   else if(c1.equals("USD") && c2.equals("Euro")){
                       result = input * 0.84;
                       lblOutput.setText("Euro " + result);
                   }
                   else if(c1.equals("USD") && c2.equals("Pound")){
                       result = input * 0.72;
                       lblOutput.setText("Pound " + result);
                   }
                   else if(c1.equals("Euro") && c2.equals("Birr")){
                       result = input * 54.32;
                       lblOutput.setText("Birr " + result);
                   }
                   else if(c1.equals("Euro") && c2.equals("USD")){
                       result = input * 1.19;
                       lblOutput.setText("USD " + result);
                   }
                   else if(c1.equals("Euro") && c2.equals("Euro")){
                       result = input;
                       lblOutput.setText("Euro " + result);
                   }
                   else if(c1.equals("Euro") && c2.equals("Pound")){
                       result = input * 0.86;
                       lblOutput.setText("Pound "+ result);
                   }
                   else if(c1.equals("Pound") && c2.equals("Birr")){
                       result = input * 63.38;
                       lblOutput.setText("Birr " + result);
                   }
                   else if(c1.equals("Pound") && c2.equals("USD")){
                       result = input * 1.39;
                       lblOutput.setText("USD " + result);
                   }
                   else if(c1.equals("Pound") && c2.equals("Euro")){
                       result = input * 1.17;
                       lblOutput.setText("Euro " + result);
                   }
                   else if(c1.equals("Pound")&& c2.equals("Pound")){
                       result = input;
                       lblOutput.setText("Pound " + result);
                   }



               }
               catch(NumberFormatException numberFormatException){
                   lblOutput.setText("Sorry, you are required to enter numbers only!");
               }
            }
        });
    }
}
