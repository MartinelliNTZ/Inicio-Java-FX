package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SampleController {
	@FXML private Label lblTexto;
	@FXML private TextField edtNome;
	@FXML private Button bt;
	
	Integer idade;
	
	public void receberValor(ActionEvent event) {
		try {
			idade = Integer.parseUnsignedInt(edtNome.getText());			
			String textoString = idade>100? "Sua idade é "+idade+ " anos. Idade muito alta" : "Sua idade é "+idade+ " anos.";
			lblTexto.setStyle("-fx-background-color: black;");
			lblTexto.setText(textoString);
			edtNome.setText("");
		}catch(Exception e) {
			lblTexto.setText("Insira apenas numeros");				
			lblTexto.setStyle("-fx-background-color: red;");
			edtNome.setText("");
		}
	}
	
}
