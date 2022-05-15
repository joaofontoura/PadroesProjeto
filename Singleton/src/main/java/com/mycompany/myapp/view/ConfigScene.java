/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.view;

import com.mycompany.myapp.App;
import com.mycompany.myapp.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        
        var label1 = new Label("Formato dos Relatórios"); 
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());
        
        var label2 = new Label("Tipo de Gráficos"); 
        var fieldTipoGraficos = new TextField(config.getTipoGrafico());
        
        var btnOk = new Button("OK");
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOk));
        
        btnOk.setOnAction(event -> {
            config.setFormatRelatorios(fieldFormatoRelatorios.getText());
            config.setTipoGrafico(fieldTipoGraficos.getText());
            app.setScene(new MainScene(app));
        });
    }
    
}
