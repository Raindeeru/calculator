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
    @FXML Button calcPad0;
    @FXML Button calcPadAdd;
    @FXML Button calcPadMinus;
    @FXML Button calcPadMultiply;
    @FXML Button calcPadDivide;
    @FXML Button calcPadDot;
    @FXML Button calcPadEquals;
    @FXML Button calcPadClear;
    @FXML Button calcPadNegative;
    @FXML Button calcPadDelete;
    @FXML Button calcPadCE;

    @FXML
    private void handleCalcPad1() {
        //button must input a 1
        calcDisplay.setText("handleCalcPad1");
    }

    
    @FXML
    private void handleCalcPad2() {
        //button must input a 2
        calcDisplay.setText("handleCalcPad2");
    }

    @FXML
    private void handleCalcPad3() {
        //button must input a 3
        calcDisplay.setText("handleCalcPad3");
    }

    @FXML
    private void handleCalcPad4() {
        //button must input a 4
        calcDisplay.setText("handleCalcPad4");
    }

    @FXML
    private void handleCalcPad5() {
        //button must input a 5
        calcDisplay.setText("handleCalcPad5");
    }

    @FXML
    private void handleCalcPad6() {
        //button must input a 6
        calcDisplay.setText("handleCalcPad6");
    }

    @FXML
    private void handleCalcPad7() {
        //button must input a 7
        calcDisplay.setText("handleCalcPad7");
    }

    @FXML
    private void handleCalcPad8() {
        //button must input a 8
        calcDisplay.setText("handleCalcPad8");
    }

    @FXML
    private void handleCalcPad9() {
        //button must input a 9
        calcDisplay.setText("handleCalcPad9");
    }

    @FXML
    private void handleCalcPad0() {
        //button must input a 0
        calcDisplay.setText("0");
    }

    @FXML
    private void handleCalcPadAdd() {
        //button must input add function
        //must transition to a operand from left operand to right
        calcDisplay.setText("handleCalcPadAdd");
    }

    @FXML
    private void handleCalcPadMinus() {
        //button must input a minus
        //must transition to a operand from left operand to right (same applies from handleCalcPadAdd)
        calcDisplay.setText("handleCalcPadMinus");
    }

    @FXML
    private void handleCalcPadMultiply() {
        calcDisplay.setText("handleCalcPadMultiply");
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
        
        calcDisplay.setText("handleCalcPadDot");
    }

    @FXML
    private void handleCalcPadEquals() {
        calcDisplay.setText("handleCalcPadEquals");
    }

    @FXML
    private void handleCalcPadClear() {
        calcDisplay.setText("handleCalcPadClear");
    }

    @FXML
    private void handleCalcPadNegative() {
        calcDisplay.setText("handleCalcPadNegative");
    }

    @FXML
    private void handleCalcPadDelete() {
        calcDisplay.setText("handleCalcPadDelete");
    }

    @FXML
    private void handleCalcPadCE() {
        calcDisplay.setText("handleCalcPadCE");
    }
}