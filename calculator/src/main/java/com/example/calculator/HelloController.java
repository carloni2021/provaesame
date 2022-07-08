package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.StringTokenizer;

public class HelloController {
    @FXML
    private TextField myText;
    /*private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    public void uno(ActionEvent e){
        myText.setText(myText.getText()+"1");
    }
    public void due(ActionEvent e){
        myText.setText(myText.getText()+"2");
    }
    public void tre(ActionEvent e){
        myText.setText(myText.getText()+"3");
    }

    public void quattro(ActionEvent e){
        myText.setText(myText.getText()+"4");
    }
    public void cinque(ActionEvent e){
        myText.setText(myText.getText()+"5");
    }
    public void sei(ActionEvent e){
        myText.setText(myText.getText()+"6");
    }

    public void sette(ActionEvent e){
        myText.setText(myText.getText()+"7");
    }
    public void otto(ActionEvent e){
        myText.setText(myText.getText()+"8");
    }
    public void nove(ActionEvent e){
        myText.setText(myText.getText()+"9");
    }

    //operazioni
    public void piu(ActionEvent e){
        myText.setText(myText.getText()+" + ");
    }
    public void per(ActionEvent e){
        myText.setText(myText.getText()+" * ");
    }
    public void meno(ActionEvent e){
        myText.setText(myText.getText()+" - ");
    }
    public void diviso(ActionEvent e){
        myText.setText(myText.getText()+" / ");
    }

    public void cancella(ActionEvent e){
        myText.setText("");
    }

    public void zero(ActionEvent e){
        myText.setText(myText.getText()+"0");
    }

    public void calcola(ActionEvent e) {
        int op1=0;
        int op2=0;
        char oper='-';
        int totale=0;


        StringTokenizer ciao =new StringTokenizer(myText.getText()," ");
        int numToken=ciao.countTokens();
        int i=0;

        if (numToken < 3 || numToken%2 != 1) {
            System.out.println("Errore sui parametri");
        }

        while (ciao.hasMoreTokens()) {

            if(i==0){
                op1=Integer.parseInt(ciao.nextToken());
            }else if(i==2){
                op2=Integer.parseInt(ciao.nextToken());

                System.out.println(oper);
                i=0;
                switch (oper) {
                    case '+':
                        totale = op1 + op2;
                        System.out.println(totale);
                        break;
                    case '-':
                        totale = op1 - op2;
                        System.out.println(totale);
                        break;
                    case '*':
                        totale = op1 * op2;
                        System.out.println(totale);
                        break;
                    case '/':
                        totale = op1 / op2;
                        System.out.println(totale);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + oper);
                }
            }else {
                oper=ciao.nextToken().charAt(0);
            }
            i++;
        }

        String Totale_Finale=String.valueOf(totale);
        myText.setText(Totale_Finale);
    }
}