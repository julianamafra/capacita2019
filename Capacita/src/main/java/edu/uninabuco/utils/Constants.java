package edu.uninabuco.utils;

import java.io.File;

public class Constants {
	
	//Caminho para os drivers no projeto. Boa pr�tica para evitar erros na escrita e padronização para versionamento do projeto
	public static final String PATH_CHROMEDRIVER = new File("").getAbsolutePath() + "\\src\\main\\java\\edu\\uninabuco\\resources\\chromedriver.exe";
	public static final String PATH_FIREFOXDRIVER = new File("").getAbsolutePath() + "\\src\\main\\java\\edu\\uninabuco\\resources\\geckodriver.exe";
	public static final String PATH_IEDRIVER32 = new File("").getAbsolutePath() + "\\src\\main\\java\\edu\\uninabuco\\resources\\IEDriverServer32.exe";
	public static final String PATH_IEDRIVER64 = new File("").getAbsolutePath() + "\\src\\main\\java\\edu\\uninabuco\\resources\\IEDriverServer.exe";
	public static final String PATH_FOTO = new File("").getAbsolutePath() + "\\src\\main\\java\\edu\\uninabuco\\resources\\img\\foto.png";
	
	
}
