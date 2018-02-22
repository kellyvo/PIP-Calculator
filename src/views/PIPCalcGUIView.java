package views;

import controllers.PIPCalcController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import processors.PIPCalcInfixProcessor;
import processors.PIPCalcPostfixProcessor;
import processors.PIPCalcPrefixProcessor;
import processors.PIPCalcProcessor;
import java.util.Observer;

/**
 * GUI of PIPCalc
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public class PIPCalcGUIView extends javafx.application.Application implements Observer {
    /**
     * button one
     */
    private Button one = new Button("1");
    /**
     * button two
     */
    private Button two = new Button("2");
    /**
     * button three
     */
    private Button three = new Button("3");
    /**
     * button addition
     */
    private Button add = new Button("+");
    /**
     * button four
     */
    private Button four = new Button("4");
    /**
     * button five
     */
    private Button five = new Button("5");
    /**
     * button six
     */
    private Button six = new Button("6");
    /**
     * button subtraction
     */
    private Button sub = new Button("-");
    /**
     * button seven
     */
    private Button seven = new Button("7");
    /**
     * button eight
     */
    private Button eight = new Button("8");
    /**
     * button nine
     */
    private Button nine = new Button("9");
    /**
     * button multiplication
     */
    private Button mult = new Button("*");
    /**
     * button enter
     */
    private Button enter = new Button("Enter");
    /**
     * button zero
     */
    private Button zero = new Button("0");
    /**
     * button clear
     */
    private Button clear = new Button("Clear");
    /**
     * button division
     */
    private Button divide = new Button("//");
    /**
     * button less than
     */
    private Button less = new Button("<");
    /**
     * button less than or equal to
     */
    private Button lessEqual = new Button("<=");
    /**
     * button inequality
     */
    private Button inequal = new Button("!=");
    /**
     * button exponential
     */
    private Button expo = new Button("^");
    /**
     * button equality
     */
    private Button equal = new Button("==");
    /**
     * button greater than
     */
    private Button greater = new Button(">");
    /**
     * button greater than or equal to
     */
    private Button greaterEqual = new Button(">=");
    /**
     * button negation
     */
    private Button neg = new Button("_");
    /**
     * button square root
     */
    private Button square = new Button("@");
    /**
     * button absolute value
     */
    private Button abs = new Button("|");
    /**
     * button space
     */
    private Button space = new Button("Space");
    /**
     * button to infix
     */
    private Button toInfix = new Button("To Infix");
    /**
     * button to prefix
     */
    private Button toPrefix = new Button("To Prefix");
    /**
     * button to postfix
     */
    private Button toPostfix = new Button("To Postfix");
    /**
     * radio button infix
     */
    private RadioButton infix = new RadioButton("Infix");
    /**
     * radio button postfix
     */
    private RadioButton postfix = new RadioButton("Postfix");
    /**
     * radio button prefix
     */
    private RadioButton prefix = new RadioButton("Prefix");
    /**
     * text field
     */
    TextField text = new TextField();

    /**
     * PIPCalc controller
     */
    private PIPCalcController controller;

    /**
     * Constructor of PIPCalcGUIView
     */
    public PIPCalcGUIView(){
        PIPCalcProcessor processor = new PIPCalcInfixProcessor();
        processor.addObserver(this);
        this.controller = new PIPCalcController(processor);
    }

    /**
     * Init of GUI
     * Overrides: init in class javafx.application.Application
     * Throws: java.lang.Exception
     */
    @Override
    public void init() throws java.lang.Exception {
        PIPCalcProcessor processor = new PIPCalcInfixProcessor();
        this.controller.changeModel(processor);
    }

    /**
     * Start of GUI
     * Specified by: start in class javafx.application.Application
     * Throws: java.lang.Exception
     */
    public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception{
        primaryStage.setTitle("PIPCalc");
        BorderPane border = new BorderPane();
        Scene s = new Scene(border);
        primaryStage.setScene(s);
        text.setAlignment(Pos.TOP_RIGHT);
        border.setTop(text);
        ToggleGroup radio = new ToggleGroup();
        infix.setToggleGroup(radio);
        infix.setSelected(true);
        prefix.setToggleGroup(radio);
        postfix.setToggleGroup(radio);
        VBox v = new VBox();
        v.setAlignment(Pos.TOP_LEFT);
        v.getChildren().addAll(infix, postfix, prefix);
        border.setRight(v);
        HBox first = new HBox();
        HBox sec = new HBox();
        HBox third = new HBox();
        HBox fourth = new HBox();
        HBox fifth = new HBox();
        HBox sixth = new HBox();
        HBox sev = new HBox();
        VBox pos = new VBox();
        one.setPrefSize(50,20);
        two.setPrefSize(50,20);
        three.setPrefSize(50,20);
        four.setPrefSize(50,20);
        five.setPrefSize(50,20);
        six.setPrefSize(50,20);
        add.setPrefSize(50,20);
        sub.setPrefSize(50,20);
        seven.setPrefSize(50,20);
        eight.setPrefSize(50,20);
        nine.setPrefSize(50,20);
        mult.setPrefSize(50,20);
        enter.setPrefSize(50,20);
        zero.setPrefSize(50,20);
        clear.setPrefSize(50,20);
        divide.setPrefSize(50,20);
        less.setPrefSize(50,20);
        lessEqual.setPrefSize(50,20);
        inequal.setPrefSize(50,20);
        expo.setPrefSize(50,20);
        equal.setPrefSize(50,20);
        greater.setPrefSize(50,20);
        greaterEqual.setPrefSize(50,20);
        neg.setPrefSize(50,20);
        square.setPrefSize(60,20);
        abs.setPrefSize(60,20);
        space.setPrefSize(80,20);
        first.getChildren().addAll(one, two, three, add);
        sec.getChildren().addAll(four, five, six, sub);
        third.getChildren().addAll(seven, eight, nine, mult);
        fourth.getChildren().addAll(enter, zero, clear, divide);
        fifth.getChildren().addAll(less, lessEqual, inequal, expo);
        sixth.getChildren().addAll(equal, greater, greaterEqual, neg);
        sev.getChildren().addAll(square, abs, space);
        pos.getChildren().addAll(first, sec, third, fourth, fifth, sixth, sev);
        border.setLeft(pos);
        toInfix.setPrefSize(200,20);
        toPrefix.setPrefSize(200, 20);
        toPostfix.setPrefSize(200, 20);
        VBox convert = new VBox();
        convert.setAlignment(Pos.BOTTOM_LEFT);
        convert.getChildren().addAll(toInfix, toPrefix, toPostfix);
        border.setBottom(convert);
        primaryStage.show();
        StringBuilder textbox = new StringBuilder();
        toInfix.setOnAction(e -> {
            this.controller.convert(textbox.toString(), "infix");
        });
        toPostfix.setOnAction(e -> {
            this.controller.convert(textbox.toString(), "postfix");
        });
        toPrefix.setOnAction(e -> {
            this.controller.convert(textbox.toString(), "prefix");
        });
        one.setOnAction(e -> {
            textbox.append("1");
            text.setPromptText(textbox.toString());
        });
        two.setOnAction(e -> {
            textbox.append("2");
            text.setPromptText(textbox.toString());
        });
        three.setOnAction(e -> {
            textbox.append("3");
            text.setPromptText(textbox.toString());
        });
        four.setOnAction(e -> {
            textbox.append("4");
            text.setPromptText(textbox.toString());
        });
        five.setOnAction(e -> {
            textbox.append("5");
            text.setPromptText(textbox.toString());
        });
        six.setOnAction(e -> {
            textbox.append("6");
            text.setPromptText(textbox.toString());
        });
        seven.setOnAction(e -> {
            textbox.append("7");
            text.setPromptText(textbox.toString());
        });
        eight.setOnAction(e -> {
            textbox.append("8");
            text.setPromptText(textbox.toString());
        });
        nine.setOnAction(e -> {
            textbox.append("9");
            text.setPromptText(textbox.toString());
        });
        zero.setOnAction(e -> {
            textbox.append("0");
            text.setPromptText(textbox.toString());
        });
        add.setOnAction(e -> {
            textbox.append("+");
            text.setPromptText(textbox.toString());
        });
        sub.setOnAction(e -> {
            textbox.append("-");
            text.setPromptText(textbox.toString());
        });
        divide.setOnAction(e -> {
            textbox.append("//");
            text.setPromptText(textbox.toString());
        });
        mult.setOnAction(e -> {
            textbox.append("*");
            text.setPromptText(textbox.toString());
        });
        abs.setOnAction(e -> {
            textbox.append("|");
            text.setPromptText(textbox.toString());
        });
        square.setOnAction(e -> {
            textbox.append("@");
            text.setPromptText(textbox.toString());
        });
        space.setOnAction(e -> {
            textbox.append(" ");
            text.setPromptText(textbox.toString());
        });
        less.setOnAction(e -> {
            textbox.append("<");
            text.setPromptText(textbox.toString());
        });
        lessEqual.setOnAction(e -> {
            textbox.append("<=");
            text.setPromptText(textbox.toString());
        });
        greater.setOnAction(e -> {
            textbox.append(">");
            text.setPromptText(textbox.toString());
        });
        greaterEqual.setOnAction(e -> {
            textbox.append(">=");
            text.setPromptText(textbox.toString());
        });
        equal.setOnAction(e -> {
            textbox.append("==");
            text.setPromptText(textbox.toString());
        });
        inequal.setOnAction(e -> {
            textbox.append("!=");
            text.setPromptText(textbox.toString());
        });
        clear.setOnAction(e -> {
            textbox.delete(0,textbox.length());
            text.setPromptText(textbox.toString());
        });
        enter.setOnAction(e -> {
            if(infix.isSelected()){
                PIPCalcProcessor processor = new PIPCalcInfixProcessor();
                processor.addObserver(this);
                this.controller = new PIPCalcController(processor);
                this.controller.process(textbox.toString());
            }
            if(prefix.isSelected()){
                PIPCalcProcessor processor = new PIPCalcPrefixProcessor();
                processor.addObserver(this);
                this.controller = new PIPCalcController(processor);
                this.controller.process(textbox.toString());
            }
            if(postfix.isSelected()){
                PIPCalcProcessor processor = new PIPCalcPostfixProcessor();
                processor.addObserver(this);
                this.controller = new PIPCalcController(processor);
                this.controller.process(textbox.toString());
            }
        });
    }

    /**
     * Stop of GUI
     * Overrides: stop in class javafx.application.Application
     * Throws: java.lang.Exception
     */
    public void stop(){
        System.exit(0);
    }

    /**
     * Update of GUI
     * Specified by: update in interface java.util.Observer
     */
    public void update(java.util.Observable o, java.lang.Object arg){
        text.setPromptText(arg.toString());
    }
}
