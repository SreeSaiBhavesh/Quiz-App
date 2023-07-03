package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import java.sql.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// Question1
			Label totScore = new Label("0");
			Label dispName = new Label();
			Label qu1 = new Label();
			Label qu2 = new Label();
			Label qu3 = new Label();
			Label qu4 = new Label();
			Label qu5 = new Label();
			primaryStage.setTitle("Test");
			Label head = new Label("Enter your name: ");
			TextField name = new TextField();
			Label q1 = new Label("Q1) What is 20 + 30? (10 M)");
			RadioButton q1op1 = new RadioButton("10");
			RadioButton q1op2 = new RadioButton("20");
			RadioButton q1op3 = new RadioButton("50");
			RadioButton q1op4 = new RadioButton("40");
			ToggleGroup q1op = new ToggleGroup();
			q1op1.setToggleGroup(q1op);
			q1op2.setToggleGroup(q1op);
			q1op3.setToggleGroup(q1op);
			q1op4.setToggleGroup(q1op);
			Button submit1 = new Button("Next");
			
			
			VBox root1 = new VBox(5);
			root1.getChildren().addAll(head, name, q1, q1op1, q1op2, q1op3, q1op4, submit1);
			Scene scene1 = new Scene(root1, 400, 400);
			
			// Question2
			Label q2 = new Label("Q2) What is 2 x 15? (10 M)");
			RadioButton q2op1 = new RadioButton("20");
			RadioButton q2op2 = new RadioButton("30");
			RadioButton q2op3 = new RadioButton("50");
			RadioButton q2op4 = new RadioButton("45");
			ToggleGroup q2op = new ToggleGroup();
			q2op1.setToggleGroup(q2op);
			q2op2.setToggleGroup(q2op);
			q2op3.setToggleGroup(q2op);
			q2op4.setToggleGroup(q2op);
			Button submit2 = new Button("Next");
			
			VBox root2 = new VBox(5);
			root2.getChildren().addAll(q2, q2op1, q2op2, q2op3, q2op4, submit2);
			Scene scene2 = new Scene(root2, 400, 400);
			
			// Question3
			Label q3 = new Label("Q3) What is 50 / 2? (10 M)");
			RadioButton q3op1 = new RadioButton("25");
			RadioButton q3op2 = new RadioButton("20");
			RadioButton q3op3 = new RadioButton("15");
			RadioButton q3op4 = new RadioButton("40");
			ToggleGroup q3op = new ToggleGroup();
			q3op1.setToggleGroup(q3op);
			q3op2.setToggleGroup(q3op);
			q3op3.setToggleGroup(q3op);
			q3op4.setToggleGroup(q3op);
			Button submit3 = new Button("Submit");
			
			
			VBox root3 = new VBox(5);
			root3.getChildren().addAll(q3, q3op1, q3op2, q3op3, q3op4, submit3);
			Scene scene3 = new Scene(root3, 400, 400);
			
			// Question4
			Label q4 = new Label("Q4) What is 200%7? (10 M)");
			RadioButton q4op1 = new RadioButton("3");
			RadioButton q4op2 = new RadioButton("4");
			RadioButton q4op3 = new RadioButton("0");
			RadioButton q4op4 = new RadioButton("1");
			ToggleGroup q4op = new ToggleGroup();
			q4op1.setToggleGroup(q4op);
			q4op2.setToggleGroup(q4op);
			q4op3.setToggleGroup(q4op);
			q4op4.setToggleGroup(q4op);
			Button submit4 = new Button("Submit");
			
			
			VBox root4 = new VBox(5);
			root4.getChildren().addAll(q4, q4op1, q4op2, q4op3, q4op4, submit4);
			Scene scene4 = new Scene(root4, 400, 400);
			
			// Question5
			Label q5 = new Label("Q5) What is 200+20 (10 M)");
			RadioButton q5op1 = new RadioButton("225");
			RadioButton q5op2 = new RadioButton("220");
			RadioButton q5op3 = new RadioButton("115");
			RadioButton q5op4 = new RadioButton("240");
			ToggleGroup q5op = new ToggleGroup();
			q5op1.setToggleGroup(q5op);
			q5op2.setToggleGroup(q5op);
			q5op3.setToggleGroup(q5op);
			q5op4.setToggleGroup(q5op);
			Button submit5 = new Button("Submit");
			
			
			VBox root5 = new VBox(5);
			root5.getChildren().addAll(q5, q5op1, q5op2, q5op3, q5op4, submit5);
			Scene scene5 = new Scene(root5, 400, 400);
			
			
			//Score Display
			VBox root6 = new VBox(5);
			root6.getChildren().addAll(dispName, qu1, qu2,qu3,qu4,qu5, totScore);
			Scene scene6 = new Scene(root6, 400, 400);
			
			submit1.setOnAction(e -> {
				int score = Integer.parseInt(totScore.getText());
				if(q1op3.isSelected()) {
					score += 10;
					int c1 = 10;
					qu1.setText("10");
					totScore.setText(""+score);					
				}	
				else {
					int c1=0;
					qu1.setText("0");
				}
				System.out.println(score);
				primaryStage.setScene(scene2);
				dispName.setText(name.getText());
				String studname = name.getText();
			});
			
			submit2.setOnAction(e -> {
				int score = Integer.parseInt(totScore.getText());
				if(q2op2.isSelected()) {
					score += 10;
					int c2 = 10;
					qu2.setText("10");
					totScore.setText(""+score);
				}
				else {
					int c2 = 0;
					qu2.setText("0");
				}
				System.out.println(score);
				primaryStage.setScene(scene3);
			});
			
			submit3.setOnAction(e -> {
				int score = Integer.parseInt(totScore.getText());
				if(q3op1.isSelected()) {
					score += 10;
					int c3 = 10;
					qu3.setText("10");
					totScore.setText(""+score);

				}
				else {
					int c3 = 0;
					qu3.setText("0");
				}
				System.out.println(score);
				primaryStage.setScene(scene4);
			});
			
			submit4.setOnAction(e -> {
				int score = Integer.parseInt(totScore.getText());
				if(q4op2.isSelected()) {
					score += 10;
					int c4 = 10;
					qu4.setText("10");
					totScore.setText(""+score);

				}	
				else {
					int c4 = 0;
					qu4.setText("0");
				}
				System.out.println(score);
				primaryStage.setScene(scene5);
			});
			
			submit5.setOnAction(e -> {
				int score = Integer.parseInt(totScore.getText());
				if(q5op2.isSelected()) {
					score += 10;
					int c5 = 10;
					qu5.setText("10");
					totScore.setText(""+score);

				}	
				else {
					int c5 = 0;
					qu5.setText("0");
				}
				System.out.println(score);
				primaryStage.setScene(scene6);
			});
			
			
			primaryStage.setScene(scene1);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		try{
			
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaquiz", "root", "root");
		Statement stmt = conn.createStatement();
		String query = "insert into  values(dispName ,c1 , c2,c3,c4,c5, )";
		stmt.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}