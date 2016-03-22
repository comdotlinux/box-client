/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.javafx.box.client.dashboard;

import com.linux.javafx.box.client.base.BaseView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.inject.Inject;
import javafx.scene.layout.Pane;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author guru
 */
public class DashboardPresenter implements Initializable {

    @Inject
    private String rememberme;

    @Inject
    private String username;

    @Inject
    private String password;

    @FXML
    private AnchorPane basePane;

    @FXML
    private Label dashboardHeader;

    @FXML
    private CheckBox rememberMe;
            
    @FXML
    private Button login;
    
    @FXML
    private TextField usernameInput;
    
    @FXML
    private PasswordField passwordInput;
    
    @FXML
    private Label usernameLabel;
    
    @FXML
    private Label passwordLabel;
    
    @FXML
    private Label output;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dashboardHeader.setText(rb.getString("header"));
        rememberMe.setText(rb.getString("rememberme"));
        login.setText(rb.getString("login"));
        usernameLabel.setText(rb.getString("username"));
        passwordLabel.setText(rb.getString("password"));

        rememberMe.setSelected(StringUtils.equalsIgnoreCase(rememberme, "yes"));
        usernameInput.setText(username);
        passwordInput.setText(password);

    }
    
    public void rememberMeChecked(){
        output.setText("Remember me is Checked");
    }
    
    public void loginButtonClicked(){
        output.setText("Username : " + usernameInput.getText() + " | Password : " + passwordInput.getText());
        basePane.getScene().setRoot(new BaseView().getView());
    }

}
