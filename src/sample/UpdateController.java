package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import static sample.DBConnection.ConnectDB;

public class UpdateController {

    @FXML
    private TextField fname;

    @FXML
    private TextField lname;

    @FXML
    private TextField average;

    @FXML
    public void OnCanceClicked(javafx.event.ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene add = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(add);
        window.show();

    }

    @FXML
    public void OnUpdateClicked(javafx.event.ActionEvent event) throws IOException {

        String FirstName = fname.getText();
        String LastName = lname.getText();
        double av = Double.parseDouble(average.getText());

        Connection conn = ConnectDB();
        try {
            String query = "UPDATE etudiant SET Moyenne="+av+" WHERE Nom='"+FirstName+"' and Prenom ='"+LastName+"'";

            // create the mysql insert preparedstatement
            Statement preparedStmt = conn.createStatement();
//            preparedStmt.setString(1, FirstName.trim());
//            preparedStmt.setString(2, LastName.trim());
//            preparedStmt.setDouble(3, av);

            // execute the preparedstatement
            preparedStmt.execute(query);

            JOptionPane.showMessageDialog(null, "Data updated");

        } catch (SQLException | HeadlessException e) {
            e.printStackTrace();
        }

    }
}
