package ar.com.codoacodo.controllers;

import java.util.Scanner;

import ar.com.codoacodo.dao.IArticleDAO;
import ar.com.codoacodo.dao.impl.ArticleDAOMySQLImpl;
import ar.com.codoacodo.domain.Article;

public class CrudMain {
	public static void main(String[] args) throws Exception {
		//INVESTIGAR ESCANER PARA LEER DATOS
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una opcion 1, 2 o 3 etc..."); // TODO
		
		System.out.println("Ingrese el id del artículo");
		Long id = teclado.nextLong();
		System.out.println("Id es " + id);
		teclado.close();
	}
}
