package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene sc, s2, s3, s4, s5, s6, s7, s8;
    UapCse myUap = new UapCse("Employee Management system");

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Button btn1 = new Button("Add a New Employer");
        btn1.setOnAction(e-> window.setScene(s2));
        Button btn2 = new Button("Get Salary of the Specific Employee");
        btn2.setOnAction(e->window.setScene(s7));
        Button btn3 = new Button("Increase Salary of an Employee");
        btn3.setOnAction(e-> window.setScene(s8));
        Button btn4 = new Button("Display Details of an Employee");
        btn4.setOnAction(e-> {
            window.setScene(s4);
        });
        Button btn5 = new Button("Display List of all Employees");
        btn5.setOnAction(e->{
            myUap.display();
        });
        Button btn6 = new Button("Exit");
        btn6.setOnAction(e->{
            System.out.println("Thanks for using Mehedi's Employee Management Application");
            window.close();
        });

        VBox sp = new VBox();
        sp.getChildren().add(btn6);
        sp.setAlignment(Pos.CENTER);

        VBox layout = new VBox(100);
        layout.getChildren().addAll(btn1, btn3);
        layout.setAlignment(Pos.CENTER);

        VBox layout2 = new VBox();
        layout2.getChildren().add(btn5);
        layout2.setAlignment(Pos.CENTER);

        VBox layout3 = new VBox(100);
        layout3.getChildren().addAll(btn2, btn4);
        layout3.setAlignment(Pos.CENTER);

        BorderPane bp = new BorderPane();
        bp.setLeft(layout);
        bp.setCenter(layout2);
        bp.setRight(layout3);
        bp.setBottom(sp);

        Button btn7 = new Button("Salaried Employee");
        btn7.setOnAction(e-> window.setScene(s3));
        Button btn8 = new Button("Hourly Employee");
        btn8.setOnAction(e-> window.setScene(s5));
        Button btn9 = new Button("Commissioned Employee");
        btn9.setOnAction(e-> window.setScene(s6));
        Button btn14 = new Button("Go to Previous Menu");
        btn14.setOnAction(e-> window.setScene(sc));

        VBox layout4 = new VBox(50);
        layout4.getChildren().addAll(btn7, btn8, btn9, btn14);
        layout4.setAlignment(Pos.CENTER);

        s2 = new Scene(layout4, 800, 400);



        GridPane gp = new GridPane();
        gp.setPadding(new Insets(100, 100, 100, 100));
        gp.setVgap(8);
        gp.setHgap(10);

        Label l1 = new Label("Enter Name:");
        GridPane.setConstraints(l1, 0, 0);

        TextField tf = new TextField();
        GridPane.setConstraints(tf, 1, 0);

        Label l2 = new Label("Enter Id:");
        GridPane.setConstraints(l2, 0, 1);

        TextField tf2 = new TextField();
        GridPane.setConstraints(tf2, 1, 1);

        Label l3 = new Label("Enter Designation:");
        GridPane.setConstraints(l3, 0, 2);

        TextField tf3 = new TextField();
        GridPane.setConstraints(tf3, 1, 2);

        Label l4 = new Label("Enter Monthly Salary:");
        GridPane.setConstraints(l4, 0,  3);

        TextField tf4 = new TextField();
        GridPane.setConstraints(tf4, 1, 3);

        Button btn15 = new Button("Go to Previous Menu");
        btn15.setOnAction(e-> window.setScene(s2));
        GridPane.setConstraints(btn15, 1, 10);

        Button btn10 = new Button("Submit");
        btn10.setOnAction(e-> {
            try {
                String n = tf.getText();
                String i = tf2.getText();
                String d = tf3.getText();
                double s = Double.parseDouble(tf4.getText());
                myUap.addNewEmployee(n, i, d, s);
                window.setScene(sc);
                System.out.println("Informations Added!");
            }
            catch(NumberFormatException n){
                System.out.println(tf4.getText()+" Not a number");
            }
        });
        GridPane.setConstraints(btn10, 1, 8);


        s3 = new Scene(gp, 500, 500);
        gp.getChildren().addAll( l1, tf, l2, tf2,l3, tf3, l4, tf4, btn10, btn15);

        GridPane gp2 = new GridPane();
        gp2.setVgap(8);
        gp2.setHgap(10);
        gp2.setPadding(new Insets(10, 10, 10, 10));

      Label l5 = new Label("Enter ID:");
      GridPane.setConstraints(l5, 0, 0);

      TextField tf5 = new TextField();
      GridPane.setConstraints(tf5, 1, 0);


      Button btn11 = new Button("Submit");
      btn11.setOnAction(e-> {
          String i = tf5.getText();
          myUap.display(i);
          window.setScene(sc);
      });
      GridPane.setConstraints(btn11, 1, 2);
      Button btn16 = new Button("Go back to Previous Menu");
      btn16.setOnAction(e-> window.setScene(sc));
        GridPane.setConstraints(btn16, 1, 3);
        s4 = new Scene(gp2, 300, 200);
        gp2.getChildren().addAll(l5, tf5, btn11, btn16);


        sc = new Scene(bp, 800, 400);

        GridPane gp3 = new GridPane();
        gp3.setPadding(new Insets(100, 100, 100, 100));
        gp3.setVgap(8);
        gp3.setHgap(10);

        Label l6 = new Label("Enter Name:");
        GridPane.setConstraints(l6, 0, 0);

        TextField tf6 = new TextField();
        GridPane.setConstraints(tf6, 1, 0);

        Label l7 = new Label("Enter Id:");
        GridPane.setConstraints(l7, 0, 1);

        TextField tf7 = new TextField();
        GridPane.setConstraints(tf7, 1, 1);

        Label l8 = new Label("Enter Designation:");
        GridPane.setConstraints(l8, 0, 2);

        TextField tf8 = new TextField();
        GridPane.setConstraints(tf8, 1, 2);

        Label l9 = new Label("Enter Hourly Rate:");
        GridPane.setConstraints(l9, 0,  3);

        TextField tf9 = new TextField();
        GridPane.setConstraints(tf9, 1, 3);

        Label l10 = new Label("Enter Hours Worked: ");
        GridPane.setConstraints(l10, 0, 4);

        TextField tf10 = new TextField();
        GridPane.setConstraints(tf10, 1, 4);

        Button btn17 = new Button("Go to Previous Menu");
        btn17.setOnAction(e-> window.setScene(s2));
        GridPane.setConstraints(btn17, 1, 6);

        Button btn12 = new Button("Submit");
        btn12.setOnAction(e-> {
            try {
                String n = tf6.getText();
                String i = tf7.getText();
                String d = tf8.getText();
                double hR = Double.parseDouble(tf9.getText());
                int hW = Integer.parseInt(tf10.getText());
                myUap.addNewEmployee(n, i, d, hR, hW);
                window.setScene(sc);
                System.out.println("Informations Added!");
            }
            catch(NumberFormatException n){
                System.out.println("One of "+ tf9.getText() + " or " + tf10.getText() + " is not a number ");
            }
        });
        GridPane.setConstraints(btn12, 1, 5);

        s5 = new Scene(gp3);
        gp3.getChildren().addAll(l6, tf6, l7, tf7, l8, tf8, l9, tf9, l10, tf10, btn12, btn17);

        GridPane gp4 = new GridPane();
        gp4.setPadding(new Insets(100, 100, 100, 100));
        gp4.setVgap(8);
        gp4.setHgap(10);

        Label l11 = new Label("Enter Name:");
        GridPane.setConstraints(l11, 0, 0);

        TextField tf11 = new TextField();
        GridPane.setConstraints(tf11, 1, 0);

        Label l12= new Label("Enter Id:");
        GridPane.setConstraints(l12, 0, 1);

        TextField tf12 = new TextField();
        GridPane.setConstraints(tf12, 1, 1);

        Label l13 = new Label("Enter Designation:");
        GridPane.setConstraints(l13, 0, 2);

        TextField tf13 = new TextField();
        GridPane.setConstraints(tf13, 1, 2);

        Label l14 = new Label("Enter Commission:");
        GridPane.setConstraints(l14, 0,  3);

        TextField tf14 = new TextField();
        GridPane.setConstraints(tf14, 1, 3);

        Label l15 = new Label("Enter Number of Sales: ");
        GridPane.setConstraints(l15, 0, 4);

        TextField tf15 = new TextField();
        GridPane.setConstraints(tf15, 1, 4);

        Button btn18 = new Button("Go to Previous Menu");
        btn18.setOnAction(e-> window.setScene(s2));
        GridPane.setConstraints(btn18, 1, 10);

        Button btn13 = new Button("Submit");
        btn13.setOnAction(e-> {
            try {
                String n = tf11.getText();
                String i = tf12.getText();
                String d = tf13.getText();
                double c = Double.parseDouble(tf14.getText());
                double s = Double.parseDouble(tf15.getText());
                myUap.addNewEmployee(n, i, d, c, s);
                System.out.println("Informations Added!");
                window.setScene(sc);
            }
            catch(NumberFormatException n){
                System.out.println("One of "+tf14.getText()+ " or "+ tf15.getText()+" is not a Number");
            }
        });
        GridPane.setConstraints(btn13, 1, 5);

        s6 = new Scene(gp4, 500, 400);
        gp4.getChildren().addAll(l11, tf11, l12, tf12, l13, tf13, l14, tf14, l15, tf15, btn13, btn18);

        GridPane gp5 = new GridPane();
        gp5.setVgap(8);
        gp5.setHgap(10);
        gp5.setPadding(new Insets(10, 10, 10, 10));

        Label l16 = new Label("Enter ID:");
        GridPane.setConstraints(l16, 0, 0);

        TextField tf16 = new TextField();
        GridPane.setConstraints(tf16, 1, 0);


        Button btn19 = new Button("Submit");
        btn19.setOnAction(e-> {
            String i = tf16.getText();
            myUap.getSalary(i);
            window.setScene(sc);
        });
        GridPane.setConstraints(btn19, 1, 2);
        Button btn20 = new Button("Go back to Previous Menu");
        GridPane.setConstraints(btn20, 1, 3);
        btn20.setOnAction(e-> window.setScene(sc));

        s7 = new Scene(gp5, 300, 200);
        gp5.getChildren().addAll(l16, tf16, btn19, btn20);


        GridPane gp6 = new GridPane();
        gp6.setVgap(8);
        gp6.setHgap(10);
        gp6.setPadding(new Insets(10, 10, 10, 10));

        Label l17 = new Label("Enter ID:");
        GridPane.setConstraints(l17, 0, 0);

        TextField tf17 = new TextField();
        GridPane.setConstraints(tf17, 1, 0);

        Label l18 = new Label("Enter the Amount you want to Increase:");
        GridPane.setConstraints(l18, 0, 1 );

        TextField tf18 = new TextField();
        GridPane.setConstraints(tf18, 1, 1 );

        Button btn21 = new Button("Submit");
        btn21.setOnAction(e->{
            try {
                String i = tf17.getText();
                double amt = Double.parseDouble(tf18.getText());
                myUap.increaseSalary(i, amt);
                window.setScene(sc);
            }
            catch(NumberFormatException n){
                System.out.println(tf18.getText() + " Not a Number");
            }
        });
        GridPane.setConstraints(btn21, 1, 2);

        Button btn22 = new Button("Go Back to Previous Menu");
        btn22.setOnAction(e->window.setScene(sc));
        GridPane.setConstraints(btn22, 1, 3);

        s8 = new Scene(gp6, 500, 200);
        gp6.getChildren().addAll(l17, tf17, l18, tf18, btn21, btn22);










        window.setScene(sc);
        window.show();
        window.setTitle("Welcome to Employee Management System");









    }


    public static void main(String[] args) {
        launch(args);
    }
}
