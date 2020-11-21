/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import model.clock.Clock;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Willy Mateo
 */
public class MainView {
    private BorderPane root;

    public MainView() {
        root = new BorderPane();
        createCenter();
    }
    
    
    public void createCenter(){
        Clock clock = new Clock();
        Label lb_Cock = new Label("Reloj");
        
        Button btn_Stop = new Button("STOP");
        VBox vb_Center = new VBox(new Label("Basic Clock"), lb_Cock, btn_Stop);
        vb_Center.setAlignment(Pos.CENTER);
        vb_Center.setSpacing(10);
        root.setCenter(vb_Center);
    }

    public BorderPane getRoot() {
        return root;
    }
    
}
