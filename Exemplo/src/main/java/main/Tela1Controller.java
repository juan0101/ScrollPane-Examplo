package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Tela1Controller {

	@FXML
	private Label label;
	
	private String texto = 
		"Debaixo dumas mui formosas tamareiras,      \n"+ 
        "Estando j� Berseba na escurid�o.            \n"+
        "As aves escutando, entre as roseiras,       \n"+
        "Se v� andar o patriarca Abra�o.             \n"+
        "Seu cora��o perante Deus est� aflito,       \n"+
        "Pois quer que O sirvamos sem murmura��o;    \n"+
        "E por amor pergunta ao Senhor bendito:      \n"+
        "O meu amado filho queres Tu, ent�o?         \n"+
        "                                            \n"+ 
        "A voz de Jeov� potente � ouvida:            \n"+ 
        "O teu Isaque oferece para Mim,              \n"+ 
        "Embora fiques com tu'alma dolorida,         \n"+ 
        "Pois te aben�oo se fizeres tu assim.        \n"+ 
        "De abatido Abra�o se torna forte            \n"+
        "E Canta hinos, pois com f� medita j�:       \n"+
        "Deus pode o meu filho libertar da morte!    \n"+
        "E n�o temendo, segue para Mori�.            \n"+
        "                                            \n"+
        "Ao p� do monte do supremo sacrif�cio,       \n"+ 
        "Profunda duvida entrou em Abra�o:           \n"+ 
        "Irei perder da minha vida o beneficio?      \n"+
        "E triste come�ou subir com lentid�o,        \n"+
        "Pois ia dar, do cora��o a esperan�a         \n"+
        "- No seu outono, sacrif�cio duma flor,&     \n";
        
        
	@FXML
	protected void initialize(){
		label.setText(texto);
		
	}
}
