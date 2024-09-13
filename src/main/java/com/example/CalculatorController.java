package com.example;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Group Name: Guo x Quiboloy
 * Group Members:   Matthew Payor
 *                  Ricardo Gayagoy
 *                  Louis Gascon
 *                  Derven Gonzales
 *                  John Joshua Botabara
 *                  Karrin Frida Novero
 *                  Bryle Florentino
 * Course/Section:  CSS124L/BM1
 */

public class CalculatorController {
    float leftHandOp;
    float rightHandOp;

    boolean startInput = false; 

    boolean activeOp = true;
    char operand; 

    @FXML Label calcDisplay;
    @FXML Button calcPad1;
    @FXML Button calcPad2;
    @FXML Button calcPad3;
    @FXML Button calcPad4;
    @FXML Button calcPad5;
    @FXML Button calcPad6;
    @FXML Button calcPad7;
    @FXML Button calcPad8;
    @FXML Button calcPad9;
    @FXML Button calcPad0; //karrin
    @FXML Button calcPadAdd;
    @FXML Button calcPadMinus;
    @FXML Button calcPadMultiply;
    @FXML Button calcPadDivide;
    @FXML Button calcPadDot;//karrin
    @FXML Button calcPadEquals; //Derven
    @FXML Button calcPadClear;
    @FXML Button calcPadNegative;//karrin
    @FXML Button calcPadDelete;
    @FXML Button calcPadCE;

    

    @FXML
    private void handleCalcPad1() {
        //button must input a 1
        if(startInput) calcDisplay.setText(calcDisplay.getText()+1);
        else{ 
            calcDisplay.setText("1");
            startInput = true; 
        }
    }

    
    @FXML
    private void handleCalcPad2() {
        //button must input a 2
        if(startInput) calcDisplay.setText(calcDisplay.getText()+2);
        else{ 
            calcDisplay.setText("2");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad3() {
        //button must input a 3
        if(startInput) calcDisplay.setText(calcDisplay.getText()+3);
        else{ 
            calcDisplay.setText("3");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad4() {
        //button must input a 4
        if(startInput) calcDisplay.setText(calcDisplay.getText()+4);
        else{ 
            calcDisplay.setText("4");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad5() {
        //button must input a 5
        if(startInput) calcDisplay.setText(calcDisplay.getText()+5);
        else{ 
            calcDisplay.setText("5");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad6() {
        //button must input a 6
        if(startInput) calcDisplay.setText(calcDisplay.getText()+6);
        else{ 
            calcDisplay.setText("6");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad7() {
        //button must input a 7
        if(startInput) calcDisplay.setText(calcDisplay.getText()+7);
        else{ 
            calcDisplay.setText("7");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad8() {
        //button must input a 8
        if(startInput) calcDisplay.setText(calcDisplay.getText()+8);
        else{ 
            calcDisplay.setText("8");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad9() {
        //button must input a 9
        if(startInput) calcDisplay.setText(calcDisplay.getText()+9);
        else{ 
            calcDisplay.setText("9");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPad0() {
        //button must input a 0
        if(startInput) {
            if (!calcDisplay.getText().equals("0"));
            calcDisplay.setText(calcDisplay.getText() + 0);
        else{
            calcDisplay.setText("0");
            startInput = true; 
        }
    }

    @FXML
    private void handleCalcPadAdd() {
        //button must input add function
        //must transition to a operand from left operand to right
        
        if(activeOp){
            leftHandOp = Float.parseFloat(calcDisplay.getText());
            activeOp = false;
        }else{
            rightHandOp = Float.parseFloat(calcDisplay.getText());
            leftHandOp += rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            activeOp = true;
        }
    }

    @FXML
    private void handleCalcPadMinus() {
        //button must input a minus
        //must transition to a operand from left operand to right (same applies from handleCalcPadAdd)
        calcDisplay.setText("handleCalcPadMinus");
        operand = '-';
    }

    @FXML
    private void handleCalcPadMultiply() {
        calcDisplay.setText("handleCalcPadMultiply");

        operand = '*';
        //button must input a multiply
        //must transition to a operand from left operand to right (same applies from handleCalcPadAdd)
    }

    @FXML
    private void handleCalcPadDivide() {
        calcDisplay.setText("handleCalcPadDivide");
        //button must input a Divide
        //must transition to a operand from left operand to right (same applies from handleCalcPadAdd)
    }

    @FXML
    private void handleCalcPadDot() {
        //calcDisplay.setText(".");
        if (startInput) {
            if (!calcDisplay.getText().contains(".")) {
                calcDisplay.setText(calcDisplay.getText() + ".");
            }
        } else {
            calcDisplay.setText("0.");
            startInput = true;
        }
    }

    @FXML
    private void handleCalcPadEquals() {
        switch(operand){
            case '+':
            leftHandOp+=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            case '-':
            leftHandOp-=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            case '/':
            leftHandOp/=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            case 'x':
            leftHandOp*=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

        }
        calcDisplay.setText("handleCalcPadEquals");
    }

    @FXML
    private void handleCalcPadClear() {
        calcDisplay.setText("handleCalcPadClear");
    }

    @FXML
    private void handleCalcPadNegative() {
        if (startInput) {
            if (!calcDisplay.getText().contains("-")) 
                calcDisplay.setText("-" + calcDisplay.getText());
            else if (calcDisplay.getText().equals("0")){ 
                calcDisplay.setText("-");
            }//mali pa ito lololol
        } 
    }

    @FXML
    private void handleCalcPadDelete() {
        calcDisplay.setText("handleCalcPadDelete");
    }

    @FXML
    private void handleCalcPadCE() {
        activeOp = true;
        startInput
        calcDisplay.setText("0");
    }
}