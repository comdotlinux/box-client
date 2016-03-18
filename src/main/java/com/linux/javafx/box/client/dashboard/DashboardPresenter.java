/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linux.javafx.box.client.dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 *
 * @author guru
 */
public class DashboardPresenter implements Initializable {

    private String dashboardHeader;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.dashboardHeader = rb.getString("dashboard.header");
    }
    
    
    
}
