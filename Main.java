package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Main extends Application {
    int value,value2;
    double value3;
    String str="";
    String str1;
    Label showLabel;

    Button cBtn,sqrBtn,sqrtBtn,divisionBtn,sevenBtn,eightBtn,nineBtn,multiplicationBtn,fourBtn,fiveBtn,sixBtn,additionBtn,oneBtn,twoBtn,threeBtn,minusBtn,dotBtn,zeroBtn,addSubBtn,isEqualBtn;
    HBox labelHbox,hbox1,hbox2,hbox3,hbox4,hbox5;
    FlowPane root;

    @Override
    public void start(Stage primaryStage) throws Exception{

        showLabel=new Label("0");
        showLabel.setPrefWidth(580);
        showLabel.setPrefHeight(50);
        showLabel.setStyle("-fx-font:30 Arial");


        cBtn=new Button("C");
        cBtn.setPrefWidth(120);
        cBtn.setPrefHeight(60);


        sqrBtn=new Button("x^2");
        sqrBtn.setPrefWidth(120);
        sqrBtn.setPrefHeight(60);



        sqrtBtn=new Button("sqrt");
        sqrtBtn.setPrefWidth(120);
        sqrtBtn.setPrefHeight(60);


        divisionBtn=new Button("/");
        divisionBtn.setPrefWidth(120);
        divisionBtn.setPrefHeight(60);

        hbox1=new HBox(cBtn,sqrBtn,sqrtBtn,divisionBtn);


        sevenBtn=new Button("7");
        sevenBtn.setPrefWidth(120);
        sevenBtn.setPrefHeight(60);


        eightBtn=new Button("8");
        eightBtn.setPrefWidth(120);
        eightBtn.setPrefHeight(60);



        nineBtn=new Button("9");
        nineBtn.setPrefWidth(120);
        nineBtn.setPrefHeight(60);



        multiplicationBtn=new Button("x");
        multiplicationBtn.setPrefWidth(120);
        multiplicationBtn.setPrefHeight(60);


        hbox2=new HBox(sevenBtn,eightBtn,nineBtn,multiplicationBtn);


        fourBtn=new Button("4");
        fourBtn.setPrefWidth(120);
        fourBtn.setPrefHeight(60);



        fiveBtn=new Button("5");
        fiveBtn.setPrefWidth(120);
        fiveBtn.setPrefHeight(60);



        sixBtn=new Button("6");
        sixBtn.setPrefWidth(120);
        sixBtn.setPrefHeight(60);



        minusBtn=new Button("-");
        minusBtn.setPrefWidth(120);
        minusBtn.setPrefHeight(60);


        hbox3=new HBox(fourBtn,fiveBtn,sixBtn,minusBtn);


        oneBtn=new Button("1");
        oneBtn.setPrefWidth(120);
        oneBtn.setPrefHeight(60);



        twoBtn=new Button("2");
        twoBtn.setPrefWidth(120);
        twoBtn.setPrefHeight(60);



        threeBtn=new Button("3");
        threeBtn.setPrefWidth(120);
        threeBtn.setPrefHeight(60);



        additionBtn=new Button("+");
        additionBtn.setPrefWidth(120);
        additionBtn.setPrefHeight(60);


        hbox4=new HBox(oneBtn,twoBtn,threeBtn,additionBtn);

        addSubBtn=new Button("+/-");
        addSubBtn.setPrefWidth(120);
        addSubBtn.setPrefHeight(60);

        zeroBtn=new Button("0");
        zeroBtn.setPrefWidth(120);
        zeroBtn.setPrefHeight(60);

        dotBtn=new Button(".");

        dotBtn.setPrefWidth(120);
        dotBtn.setPrefHeight(60);


        isEqualBtn=new Button("=");
        isEqualBtn.setPrefWidth(120);
        isEqualBtn.setPrefHeight(60);

        getNumaricValues gnv=new getNumaricValues();
        zeroBtn.setOnAction(gnv);
        oneBtn.setOnAction(gnv);
        twoBtn.setOnAction(gnv);
        threeBtn.setOnAction(gnv);
        fourBtn.setOnAction(gnv);
        fiveBtn.setOnAction(gnv);
        sixBtn.setOnAction(gnv);
        sevenBtn.setOnAction(gnv);
        eightBtn.setOnAction(gnv);
        nineBtn.setOnAction(gnv);

        operationHandler oh=new operationHandler();
        divisionBtn.setOnAction(oh);
        multiplicationBtn.setOnAction(oh);
        additionBtn.setOnAction(oh);
        minusBtn.setOnAction(oh);

        EqualHandler eh=new EqualHandler();
        isEqualBtn.setOnAction(eh);

        ButtonHandler bh=new ButtonHandler();
        cBtn.setOnAction(bh);
        sqrtBtn.setOnAction(bh);
        sqrBtn.setOnAction(bh);

        hbox5=new HBox(addSubBtn,zeroBtn,dotBtn,isEqualBtn);

        labelHbox=new HBox(showLabel);
        showLabel.setPadding(new Insets(20,0,0,0));
        labelHbox.setAlignment(Pos.TOP_RIGHT);
        showLabel.setFont(new Font(36));




        root=new FlowPane(showLabel,hbox1,hbox2,hbox3,hbox4,hbox5);
        root.setOrientation(Orientation.VERTICAL);
        Scene scene=new Scene(root,480,360);

        primaryStage.setTitle("181380019 calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private  class getNumaricValues implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==oneBtn)
            {
                str=str+"1";
                showLabel.setText(str);
            }
            else if(event.getSource()==twoBtn)
            {
                str=str+"2";
                showLabel.setText(str);
            }
            else if(event.getSource()==threeBtn)
            {
                str=str+"3";
                showLabel.setText(str);
            }
            else if(event.getSource()==fourBtn)
            {
                str=str+"4";
                showLabel.setText(str);
            }
            else if(event.getSource()==fiveBtn)
            {
                str=str+"5";
                showLabel.setText(str);
            }
            else if(event.getSource()==sixBtn)
            {
                str=str+"6";
                showLabel.setText(str);
            }
            else if(event.getSource()==sevenBtn)
            {
                str=str+"7";
                showLabel.setText(str);
            }
            else if(event.getSource()==eightBtn)
            {
                str=str+"8";
                showLabel.setText(str);
            }
            else if(event.getSource()==nineBtn)
            {
                str=str+"9";
                showLabel.setText(str);
            }
            else if (event.getSource()==zeroBtn)
            {
                str=str+"0";
                showLabel.setText(str);
            }



        }
    }
    private class operationHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==divisionBtn)
            {
                value=Integer.parseInt(showLabel.getText().toString());
                str="";
                str1="division";
                showLabel.setText("0");
            }
            else if (event.getSource()==multiplicationBtn)
            {
                value=Integer.parseInt(showLabel.getText().toString());
                str="";
                str1="multiplication";
                showLabel.setText("0");
            }
            else if (event.getSource()==additionBtn)
            {
                value=Integer.parseInt(showLabel.getText().toString());
                str="";
                str1="add";
                showLabel.setText("0");
            }
            else if (event.getSource()==minusBtn)
            {
                value=Integer.parseInt(showLabel.getText().toString());
                str="";
                str1="minus";
                showLabel.setText("0");
            }


        }


    }

    private class EqualHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {

            if(str1.equals("division"))
            {
                value2=Integer.parseInt(showLabel.getText().toString());
                showLabel.setText(Integer.toString(value/value2));
            }
            else if (str1.equals("multiplication"))
            {
                value2=Integer.parseInt(showLabel.getText().toString());
                showLabel.setText(Integer.toString(value*value2));
            }
            else if (str1.equals("addition"))
            {
                value2=Integer.parseInt(showLabel.getText().toString());
                showLabel.setText(Integer.toString(value+value2));
            }
            else if (str1.equals("minus"))
            {
                value2=Integer.parseInt(showLabel.getText().toString());
                showLabel.setText(Integer.toString(value-value2));
            }
        }
    }

    private class ButtonHandler implements EventHandler<ActionEvent>
    {

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==cBtn)
            {
                showLabel.setText("0");
                value=0;
                value2=0;
                str="";
                str1="";
            }
            else if (event.getSource()==sqrBtn)
            {
                value=Integer.parseInt(showLabel.getText().toString());
                value=value*value;
                showLabel.setText(Integer.toString(value));
            }
            else if (event.getSource()==sqrtBtn)
            {
                value=Integer.parseInt(showLabel.getText().toString());
                value3=Math.sqrt(value);
                showLabel.setText(Double.toString(value3));
            }

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
