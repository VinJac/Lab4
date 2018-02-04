/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * 
 */
public class Ex3Controller implements Initializable {
    
    @FXML
    private PieChart pieChart;
    
    //create the list used for pieChart
    ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {  //written in initialize to display the graph without doing an action
        data.add(new PieChart.Data("SI", 120)); //add the data
        data.add(new PieChart.Data("SE", 65));
        data.add(new PieChart.Data("OCRES", 37));
        data.add(new PieChart.Data("Finance", 42));
        data.add(new PieChart.Data("Sante", 23));
        data.add(new PieChart.Data("Energie", 28));
        pieChart.setLabelLineLength(10); // add the legend
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setData(data);
    }    
    
}