package gui.niecoomne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main {


    public static void main(String[] args) {


        JFrame frame = new JFrame("Aplikácia niečo o mne"); // vytvorime okno
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna
        frame.setResizable(false); // Zakazame zmenu velkosti okna


        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny


        frame.setContentPane(panel); // my dany panel pridame do frame


        File f = new File("foto_ja.jpg");
        JLabel imgLabel = new JLabel(new ImageIcon(f.getName()));
        imgLabel.setBounds(50, 53, 116, 116); // x, y, sirka, vyska
        panel.add(imgLabel);


        // JText
        JLabel hyperlink_www = new JLabel("<html><font color='red'><b>pavere.sk</b></font></html>");
        hyperlink_www.setForeground(Color.RED.darker());
        hyperlink_www.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink_www.setBounds(105, 170, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink_www);


        hyperlink_www.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.pavere.sk"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });

        // JText
        JLabel hyperlink = new JLabel("<html><font color='blue'><b>Anton</b></font></html>");
        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink.setBounds(50, 170, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink);



        hyperlink.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/antonkostrab/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });




        JTextArea textArea = new JTextArea("Ahoj. Volám sa Anton som  z Prešova pracujem ako webdesigner a na tento kurz som sa prihlasil aby som rozšíril vedomosti a zručnosti Už počas štúdia na strednej škole som inklinoval  ku grafike a videu. Popri štúdiu na VŠ som pôsobil ako exterý lektor v súkromnej vzdelávacej inštitúcii.\n" +
                "\nNeskôr som dostal ponuku od danej spoločnosti a stal som sa Organizačným pracovníkom a IT lektorom. Počas pôsobenia v danej inštitúcii som sa stal držitelom medzinárodného európskeho počítačového certifikátu European Computer Passport (ECP) Xpert.  V danom období  som  vytvoril nový kurz pre detskú počítačovu školu, vďaka ktorej  som získal ocenie Akadémie vzdelávania v Bratislave .\n \nOd roku 2011 som začal pracovať v reklamnej oblasti, kde som naplno využil prax, zručnosti v oblasti spracovania printovej grafiky, videa, prezentácii ako aj implementácie a podporu rôznych programov pre operačne systémy Windows, macOS  a Linux, ktoré sa používaju v oblasti DTP ."); // popisok

        textArea.setBounds(190,50,500,450); // x, y, sirka, vyska
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setOpaque(false);
        panel.add(textArea);

        File f2 = new File("stranka.jpg");
        JLabel imgLabel2 = new JLabel(new ImageIcon(f2.getName()));
        imgLabel2.setBounds(0, 353, 800, 115); // x, y, sirka, vyska
        panel.add(imgLabel2);

     /*   JButton btnOk = new JButton("Vypiš!"); // tlacidlo
        btnOk.setBounds(100, 100, 80, 20); // x, y, sirka, vyska


        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                labelText.setText( textField.getText() );


            }
        });
        panel.add(btnOk);*/




        JButton btnCancel = new JButton("OK");
        btnCancel.setBounds(380, 533, 80, 20);


        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Ahoj. Volám sa Anton som  z Prešova pracujem ako webdesigner a na tento kurz som sa prihlasil aby som rozšíril vedomosti a zručnosti Už počas štúdia na strednej škole som inklinoval  ku grafike a videu.\nPopri štúdiu na VŠ som pôsobil ako exterý lektor v súkromnej vzdelávacej inštitúcii.\n" +
                        "\nNeskôr som dostal ponuku od danej spoločnosti a stal som sa Organizačným pracovníkom a IT lektorom. Počas pôsobenia v danej inštitúcii som sa stal držitelom medzinárodného európskeho počítačového certifikátu \nEuropean Computer Passport (ECP) Xpert.  V danom období  som  vytvoril nový kurz pre detskú počítačovu školu, vďaka ktorej  som získal ocenie Akadémie vzdelávania v Bratislave .\n \nOd roku 2011 som začal pracovať v reklamnej oblasti, kde som naplno využil prax, zručnosti v oblasti spracovania printovej grafiky, videa, prezentácii ako aj implementácie a podporu rôznych programov pre operačne systémy \nWindows, macOS  a Linux, ktoré sa používaju v oblasti DTP .");
                /*System.out.println(textField.getText());
                labelText.setText(textField.getText());*/

//
                String url = "https://pavere.sk";

                // Generování HTML kódu s hypertextovým odkazem
                String hyperlink =  url   ;

                // Výstup HTML kódu
                System.out.println(hyperlink);

                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnCancel);


        // display it
        frame.pack();
        frame.setVisible(true);


    }
}

