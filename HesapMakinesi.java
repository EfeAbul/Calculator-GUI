import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class HesapMakinesi extends JFrame implements ActionListener{

    private String basilacak="";
    private String islem="";
    private String kontrol="";
    private  JPanel yazilacak;
    private boolean isMinus=false;
    private boolean bir=false,iki=false,uc=false,dort=false,bes=false,alti=false,yedi=false,sekiz=false,dokuz=false,sifir=false;
    public HesapMakinesi()
    {
        setSize(800,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,1,10,10));

        yazilacak = new JPanel();
        yazilacak.setLayout(new GridLayout(1,1));
        add(yazilacak);

        JPanel clearButton = new JPanel();
        clearButton.setLayout(new BorderLayout());
        JButton C = new JButton("C");
        C.setBackground(Color.BLUE);
        C.addActionListener(this);
        clearButton.add(C);
        add(clearButton);

        JPanel tuslar1 = new JPanel();
        tuslar1.setLayout(new GridLayout(1,4,10,10));
        JButton num7 = new JButton("7");
        num7.setBackground(Color.BLUE);
        num7.addActionListener(this);
        JButton num8 = new JButton("8");
        num8.setBackground(Color.BLUE);
        num8.addActionListener(this);
        JButton num9 = new JButton("9");
        num9.setBackground(Color.BLUE);
        num9.addActionListener(this);
        JButton plus = new JButton("+");
        plus.setBackground(Color.BLUE);
        plus.addActionListener(this);
        tuslar1.add(num7);
        tuslar1.add(num8);
        tuslar1.add(num9);
        tuslar1.add(plus);
        add(tuslar1);

        JPanel tuslar2= new JPanel();
        tuslar2.setLayout(new GridLayout(1,4,10,10));
        JButton num4 = new JButton("4");
        num4.setBackground(Color.BLUE);
        num4.addActionListener(this);
        JButton num5 = new JButton("5");
        num5.setBackground(Color.BLUE);
        num5.addActionListener(this);
        JButton num6 = new JButton("6");
        num6.setBackground(Color.BLUE);
        num6.addActionListener(this);
        JButton minus = new JButton("-");
        minus.setBackground(Color.BLUE);
        minus.addActionListener(this);
        tuslar2.add(num4);
        tuslar2.add(num5);
        tuslar2.add(num6);
        tuslar2.add(minus);
        add(tuslar2);

        JPanel tuslar3 = new JPanel();
        tuslar3.setLayout(new GridLayout(1,4,10,10));
        JButton num1 = new JButton("1");
        num1.setBackground(Color.BLUE);
        num1.addActionListener(this);
        JButton num2 = new JButton("2");
        num2.setBackground(Color.BLUE);
        num2.addActionListener(this);
        JButton num3 = new JButton("3");
        num3.setBackground(Color.BLUE);
        num3.addActionListener(this);
        JButton multiplication = new JButton("x");
        multiplication.setBackground(Color.BLUE);
        multiplication.addActionListener(this);
        tuslar3.add(num1);
        tuslar3.add(num2);
        tuslar3.add(num3);
        tuslar3.add(multiplication);
        add(tuslar3);

        JPanel tuslar4 = new JPanel();
        tuslar4.setLayout(new GridLayout(1,4,10,10));
        JButton num0 = new JButton("0");
        num0.setBackground(Color.BLUE);
        num0.addActionListener(this);
        JButton dot = new JButton(".");
        dot.setBackground(Color.BLUE);
        dot.addActionListener(this);
        JButton equals = new JButton("=");
        equals.setBackground(Color.BLUE);
        equals.addActionListener(this);
        JButton division = new JButton("÷");
        division.setBackground(Color.BLUE);
        division.addActionListener(this);
        tuslar4.add(num0);
        tuslar4.add(dot);
        tuslar4.add(equals);
        tuslar4.add(division);
        add(tuslar4);

        setVisible(true);



    }

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand();
        if(basilacak.length()==10)
        {

        }
        else if(actionCommand.equals("1"))
        {
            if(kontrol.equals("="))
            {
             basilacak="";
             islem="";
             kontrol="";
            }
            basilacak+="1";
            islem +="1";
            bir = true;
            repaint();
        }
        else if(actionCommand.equals("2"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="2";
            islem +="2";
            iki = true;
            repaint();
        }
        else if(actionCommand.equals("3"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="3";
            islem +="3";
            uc = true;
            repaint();
        }
        else if(actionCommand.equals("4"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="4";
            islem +="4";
            dort = true;
            repaint();
        }
        else if(actionCommand.equals("5"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="5";
            islem +="5";
            bes = true;
            repaint();
        }
        else if(actionCommand.equals("6"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="6";
            islem +="6";
            alti = true;
            repaint();
        }
        else if(actionCommand.equals("7"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="7";
            islem +="7";
            yedi = true;
            repaint();
        }
        else if(actionCommand.equals("8"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="8";
            islem +="8";
            sekiz = true;
            repaint();
        }
        else if(actionCommand.equals("9"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="9";
            islem +="9";
            dokuz = true;
            repaint();
        }
        else if(actionCommand.equals("0"))
        {
            if(kontrol.equals("="))
            {
                basilacak="";
                islem="";
                kontrol="";
            }
            basilacak+="0";
            islem +="0";
            sifir = true;
            repaint();
        }
        if(actionCommand.equals("+"))
        {
            if(kontrol.equals("="))
            {
                kontrol+="+";
            }
            basilacak="";
            islem +=" + ";
        }
        if(actionCommand.equals("-"))
        {
            if(kontrol.equals("="))
            {
                kontrol+="x";
            }
            basilacak="";
            islem +=" - ";
        }
        if(actionCommand.equals("x"))
        {
            if(kontrol.equals("="))
            {
                kontrol+="x";
            }
            basilacak="";
            islem +=" x ";
        }
        if(actionCommand.equals("÷"))
        {
            if(kontrol.equals("="))
            {
                kontrol+="÷";
            }
            basilacak="";
            islem +=" ÷ ";
        }
        if(actionCommand.equals("."))
        {
            basilacak+=".";
            islem+=".";
            repaint();
        }
        if(actionCommand.equals("C"))
        {
            basilacak="";
            islem="";
            repaint();
        }
        String[] arr = new String[3];
        arr = islem.split(" ");

        if(actionCommand.equals("="))
        {
            repaint();

            kontrol="=";
            basilacak="";
            float sayi1=0f;
            float sayi2=0f;
            float sonuc=0f;

            if(!arr[0].contains("."))
            {
                sayi1=Integer.parseInt(arr[0]);
            }
            if(arr[0].contains("."))
            {
                sayi1=Float.parseFloat(arr[0]);
            }
            if(!arr[2].contains("."))
            {
                sayi2=Integer.parseInt(arr[2]);
            }
            if(arr[2].contains("."))
            {
                sayi2=Float.parseFloat(arr[2]);
            }

            if(arr[1].equals("+"))
            {
                sonuc=sayi1+sayi2;
            }
            if(arr[1].equals("-"))
            {
                sonuc=sayi1-sayi2;
            }
            if(arr[1].equals("x"))
            {
                sonuc=sayi1*sayi2;
            }
            if(arr[1].equals("÷"))
            {
                sonuc=sayi1/sayi2;
            }
            basilacak+=sonuc;
            islem="" + sonuc;
            if(sonuc<0)
            {
                isMinus=true;
            }
        }

        //System.out.println(basilacak);




    }

    @Override
    public void paint(Graphics g) {
        boolean biggerThanTen=false;
        super.paint(g);
        g.drawLine(20, 40,20,160);
        g.drawLine(20,40,780,40);
        g.drawLine(780,40,780,160);
        g.drawLine(20,160,780,160);

        if(basilacak.length()>10)
        {
            biggerThanTen=true;
        }

        if(basilacak.length()!=0) {
            if(basilacak.charAt(basilacak.length()-1)!='.' && Double.parseDouble(basilacak)==Math.ceil(Double.parseDouble(basilacak)) && kontrol.contains("="))
            {
                int temp = (int)Math.ceil(Double.parseDouble(basilacak));
                basilacak = temp + "";
            }

            for (int i =basilacak.length()-1; i>=0 ; i--) {
                if (basilacak.charAt(i) == '1') {
                    g.drawLine(700 - (basilacak.length()-1-i) * 50, 60, 700 - (basilacak.length()-1-i)* 50, 140);
                } else if (basilacak.charAt(i) == '2') {
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 680 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);
                } else if (basilacak.charAt(i) == '3') {
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 -(basilacak.length()-1-i) * 50, 60);
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);
                } else if (basilacak.charAt(i) == '4') {
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 680 - (basilacak.length()-1-i) * 50, 60);
                } else if (basilacak.charAt(i) == '5') {
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 680 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);
                } else if (basilacak.charAt(i) == '6') {
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 680 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 140);
                } else if (basilacak.charAt(i) == '7') {
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                } else if (basilacak.charAt(i) == '8') {
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 680 - (basilacak.length()-1-i) * 50, 140);
                } else if (basilacak.charAt(i) == '9') {
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 100, 720 - (basilacak.length()-1-i) * 50, 100);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 680 - (basilacak.length()-1-i) * 50, 100);

                } else if (basilacak.charAt(i) == '0') {
                    g.drawLine(720 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 680 - (basilacak.length()-1-i) * 50, 140);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 60, 720 - (basilacak.length()-1-i) * 50, 60);
                    g.drawLine(680 - (basilacak.length()-1-i) * 50, 140, 720 - (basilacak.length()-1-i) * 50, 140);

                } else if (basilacak.charAt(i) == '.') {
                    g.fillOval(700 - (basilacak.length()-1-i) * 50,135,5,5);

                } else if(isMinus && i==0) {
                    g.drawLine(720 - (basilacak.length()) * 50, 100, 760 - (basilacak.length()) * 50, 100);
                }
            }

        }
    }

public static void main(String[] args) {

        new HesapMakinesi();

    }
}
