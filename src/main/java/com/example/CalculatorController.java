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
    char operand = ' '; 

    boolean isNegative = false;

    @FXML Label calcDisplay;
    @FXML Button calcPad1;
    @FXML Button calcPad2;
    @FXML Button calcPad3;
    @FXML Button calcPad4;
    @FXML Button calcPad5;
    @FXML Button calcPad6;
    @FXML Button calcPad7;//done
    @FXML Button calcPad8;//done
    @FXML Button calcPad9;//done
    @FXML Button calcPad0; //done
    @FXML Button calcPadAdd;//done
    @FXML Button calcPadMinus;//done
    @FXML Button calcPadMultiply;//done
    @FXML Button calcPadDivide;//done
    @FXML Button calcPadDot;//done
    @FXML Button calcPadEquals; //done
    @FXML Button calcPadClear;//done
    @FXML Button calcPadNegative;//done
    @FXML Button calcPadDelete;//done
    @FXML Button calcPadCE;//done

    @FXML
    private void handleCalcPad1() {
        //button must input a 1
        setPadNum(1);
    }

    
    @FXML
    private void handleCalcPad2() {
        setPadNum(2);
    }

    @FXML
    private void handleCalcPad3() {
        //button must input a 3
        setPadNum(3);
    }

    @FXML
    private void handleCalcPad4() {
        //button must input a 4
        setPadNum(4);
    }

    @FXML
    private void handleCalcPad5() {
        //button must input a 5
       setPadNum(5);
    }

    @FXML
    private void handleCalcPad6() {
        //button must input a 6
        setPadNum(6);
    }

    @FXML
    private void handleCalcPad7() {
        //button must input a 7
        setPadNum(7);
    }

    @FXML
    private void handleCalcPad8() {
        //button must input a 8
        setPadNum(8);
    }

    @FXML
    private void handleCalcPad9() {
        //button must input a 9
        setPadNum(9);
    }

    @FXML
    private void handleCalcPad0() {
        //button must input a 0
        if(startInput) {
            if (!calcDisplay.getText().equals("0"))
            calcDisplay.setText(calcDisplay.getText() + 0);
        }
        else{
            calcDisplay.setText("0");
            startInput = true; 
        }
    }
    

    @FXML
    private void handleCalcPadAdd() {
        //button must input add function
        //must transition to a operand from left operand to right
        // if(activeOp){
        //     leftHandOp = Float.parseFloat(calcDisplay.getText());
        //     activeOp = false;
        // }else{
        //     rightHandOp = Float.parseFloat(calcDisplay.getText());
        //     leftHandOp += rightHandOp;
        //     calcDisplay.setText(String.valueOf(leftHandOp));
        //     activeOp = true;
        // }

        operand  = '+';
        if(activeOp){
            leftHandOp = Float.parseFloat(calcDisplay.getText());
        }
        activeOp = false;
        opClear();
    }

    @FXML
    private void handleCalcPadMinus() {
        //button must input a minus
        //must transition to a operand from left operand to right (same applies from handleCalcPadAdd)
        operand = '-';
        if(activeOp){
            leftHandOp = Float.parseFloat(calcDisplay.getText());
        }
        activeOp = false;
        opClear();
    }

    @FXML
    private void handleCalcPadMultiply() {
        

        operand = '*';
        if(activeOp){
            leftHandOp = Float.parseFloat(calcDisplay.getText());
        }
        activeOp = false;
        opClear();
        //button must input a multiply
        //must transition to a operand from left operand to right (same applies from handleCalcPadAdd)
    }

    @FXML
    private void handleCalcPadDivide() {
        operand = '/';
        if(activeOp){
            leftHandOp = Float.parseFloat(calcDisplay.getText());
        }
        activeOp = false;
        opClear();
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
            rightHandOp = Float.parseFloat(calcDisplay.getText());
            leftHandOp+=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            case '-':
            rightHandOp = Float.parseFloat(calcDisplay.getText());
            leftHandOp-=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            case '/':
            rightHandOp = Float.parseFloat(calcDisplay.getText());
            leftHandOp/=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            case '*':
            rightHandOp = Float.parseFloat(calcDisplay.getText());
            leftHandOp*=rightHandOp;
            calcDisplay.setText(String.valueOf(leftHandOp));
            break;

            default:
            rightHandOp = Float.parseFloat(calcDisplay.getText());
            calcDisplay.setText(String.valueOf(leftHandOp));
        }
    }

    @FXML
    private void handleCalcPadClear() {
        calcDisplay.setText("");
    }

    @FXML
    private void handleCalcPadNegative() {
        if(!isNegative){ 
            calcDisplay.setText("-" + calcDisplay.getText());
            isNegative = true;
        }
        else{
            calcDisplay.setText(calcDisplay.getText().substring(1));
            isNegative = false;
        }
    }

    @FXML
    private void handleCalcPadDelete() {
        if(calcDisplay.getText().length() == 1){
            calcDisplay.setText("0");
            startInput=false;
        }
        else
        calcDisplay.setText(calcDisplay.getText().substring(0, calcDisplay.getText().length()-1));
    }

    @FXML
    private void handleCalcPadCE() {
        activeOp = true;
        startInput = false;
        calcDisplay.setText("");
    }

    //Helper Function

    private void opClear(){
        activeOp = false;
        startInput = false;
        isNegative = false;
        calcDisplay.setText("0");
    }

    private void setPadNum(int padNum){
        if(startInput) calcDisplay.setText(calcDisplay.getText()+ padNum);
        else{ 
            if (!isNegative) {
                calcDisplay.setText(Integer.toString(padNum));
            }else{
                calcDisplay.setText("-" + Integer.toString(padNum));

            }
            startInput = true; 
        }
    }
}