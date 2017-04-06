package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Tela1Controller {

	@FXML
	private Label label;
	
	private String texto = 
		"Debaixo dumas mui formosas tamareiras,      \n"+ 
        "Estando já Berseba na escuridão.            \n"+
        "As aves escutando, entre as roseiras,       \n"+
        "Se vê andar o patriarca Abraão.             \n"+
        "Seu coração perante Deus está aflito,       \n"+
        "Pois quer que O sirvamos sem murmuração;    \n"+
        "E por amor pergunta ao Senhor bendito:      \n"+
        "O meu amado filho queres Tu, então?         \n"+
        "                                            \n"+ 
        "A voz de Jeová potente é ouvida:            \n"+ 
        "O teu Isaque oferece para Mim,              \n"+ 
        "Embora fiques com tu'alma dolorida,         \n"+ 
        "Pois te abençoo se fizeres tu assim.        \n"+ 
        "De abatido Abraão se torna forte            \n"+
        "E Canta hinos, pois com fé medita já:       \n"+
        "Deus pode o meu filho libertar da morte!    \n"+
        "E não temendo, segue para Moriá.            \n"+
        "                                            \n"+
        "Ao pé do monte do supremo sacrifício,       \n"+ 
        "Profunda duvida entrou em Abraão:           \n"+ 
        "Irei perder da minha vida o beneficio?      \n"+
        "E triste começou subir com lentidão,        \n"+
        "Pois ia dar, do coração a esperança         \n"+
        "- No seu outono, sacrifício duma flor,&     \n";
        
        
	@FXML
	protected void initialize(){
		label.setText(texto);
		
	}
}
