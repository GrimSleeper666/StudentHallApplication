//all the imports needed to gain access to libraries used.
package studenthallapplication;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//these unused imports would have been used to apply check boxes for the additional requirements for those with disabilities. i was allso going to have the checkboxes to alter the rent available to them
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// this section contains  the constructors for the labels, fields and seporators which when used within the gui will apply themselves to the correct sections
public class StudentHallSorting extends Application {

    private StudentList studentList;

    // this area depicts the height and width of the window for the form.
    private final int WIDTH = 1600;
    private final int HEIGHT = 1000;

    //these sections are the labels for the title, first, second and third headings.
    private Label headingLabel;
    private Label accomodationLabel;
    private Label studentOrEmployeeLabel;
    private Label displayLabel;
    
    //this section contains all the labels for the for which would be filled in 
    private Label courseLabel;
    private Label levelLabel;
    private Label campusLabel;
    private Label employmentLabel;
    private Label firstNameLabel;
    private Label middleNameLabel;
    private Label lastNameLabel;
    //this would have been a section for the user to display thei additional needs for disabilities etc
    private Label extraNeedsLabel;

    private TextField courseField;
    private TextField employmentField;
    private TextField levelField;
    private TextField campusField;
    private TextField firstNameField;
    private TextField middleNameField;
    private TextField lastNameField;
    //this would have been a section for the user to display thei additional needs for disabilities etc
    private TextField extraNeedsField;
    
    private TextArea displayStudents;
    
    private Separator sectSeparator;
    private Separator sectSeparator2;
    private Separator sectSeparator3;
    //this would have been a section for the user to display thei additional needs for disabilities etc
    private Separator sectSeparator4;

    private Button addButton;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //this section performs the main job of applying the text present in the titles, labels and button.
    public StudentHallSorting() {
        this.headingLabel = new Label("Please Enter Details Below");
        this.accomodationLabel = new Label("Student/Employee Accomodation & Education (If not applicable, please leave empty)");
        this.courseLabel = new Label("Course");
        this.courseField = new TextField();
        this.employmentLabel = new Label("Employment");
        this.employmentField = new TextField();
        this.levelLabel = new Label("Level");
        this.levelField = new TextField();
        this.campusLabel = new Label("Campus");
        this.campusField = new TextField();
        
        //seporators used to set sections within the page so that there is uniformity to the page
        this.sectSeparator = new Separator();
        this.sectSeparator2 = new Separator();
        this.sectSeparator3 = new Separator();
        this.sectSeparator4 = new Separator();
        
        this.studentOrEmployeeLabel = new Label("Student/Employee Details");
        this.firstNameLabel = new Label("First Name");
        this.firstNameField = new TextField();
        this.middleNameLabel = new Label("Middle Name/s (optional)");
        this.middleNameField = new TextField();
        this.lastNameLabel = new Label("Last Name");
        this.lastNameField = new TextField();
        this.displayLabel = new Label("Stored Data Shown Below.");
        this.displayStudents = new TextArea();
        this.addButton = new Button("Add to Register");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void start(Stage stage) {
        //the maximum number of students can be changed but i want to keep it around 10 to allow the ability to see it get full
        studentList = new StudentList(10);
        
        //applies uniformity by using horisontal boxes
        HBox applicationDetails = new HBox(10);
        HBox studentDetails = new HBox(10);

        applicationDetails.getChildren().addAll(courseLabel, courseField, levelLabel, levelField, campusLabel, campusField, employmentLabel, employmentField);

        studentDetails.getChildren().addAll(firstNameLabel, firstNameField, middleNameLabel, middleNameField, lastNameLabel, lastNameField);

        VBox root = new VBox(10);
        root.getChildren().addAll(headingLabel, sectSeparator, accomodationLabel, applicationDetails, sectSeparator2,
                 studentOrEmployeeLabel, studentDetails, sectSeparator3,  displayLabel, displayStudents, addButton);
        
        //this sets the colour of the background.
        Scene scene = new Scene(root, Color.web("#ce9ee8"));

        // this section applies a font type to the headings.
        Font font = new Font("Times New Roman", 40);
        headingLabel.setFont(font);
        font = new Font("Times New Roman", 30);
        accomodationLabel.setFont(font);
        studentOrEmployeeLabel.setFont(font);
        displayLabel.setFont(font);

        //this section alters the allignment of the data fields such as where they sit etc
        root.setBackground(Background.EMPTY);
        displayStudents.setMaxSize(500, 900);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
        addButton.setOnAction(e -> addHandler());

        stage.setScene(scene);
        stage.show();

    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private void addHandler() {

        String courseInput = courseField.getText();
        String levelInput = levelField.getText();
        String campusInput = campusField.getText();
        String employmentInput = employmentField.getText();
        String firstNameInput = firstNameField.getText();
        String middleNameInput = middleNameField.getText();
        String lastNameInput = lastNameField.getText();
        //this section checks that the form has been filled in correctly. i have only made it so the campus, first and last name are NEEDED as the OR/|| wasnt working in the way i had intended and wouldnt 
        //let me just fill in EITHER the course or employment. So i made it possible to leave them blank. While this is not how i wanted it, I ran out of time to figure it out.
        
        if (campusInput.length() == 0) {
            displayStudents.setText("Please enter the campus you will be staying at!");
        } else if (firstNameInput.length() == 0 || lastNameInput.length() == 0) {
            displayStudents.setText("You must enter both your full name");
        } else {
            Student studentToAdd = new Student(courseInput, levelInput, campusInput, employmentInput, firstNameInput, middleNameInput, lastNameInput);
            studentList.addStudent(studentToAdd);

            //this section will clear the feilds to prevent the user having to delete everything after each entry.
            courseField.setText("");
            levelField.setText("");
            campusField.setText("");
            employmentField.setText("");
            firstNameField.setText("");
            middleNameField.setText("");
            lastNameField.setText("");
            displayStudents.setText("");
            displayStudents.appendText(courseInput + " Information Has Been Successfully Added To Our Database! ");
            displayStudents.appendText("\n\n Student & Employee Information:");
            displayStudents.appendText(studentList.displayStudents());
        }

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //this section will launch the arguments applied inside the main class
    
    public static void main(String[] args) {
        launch(args);
    }

}
