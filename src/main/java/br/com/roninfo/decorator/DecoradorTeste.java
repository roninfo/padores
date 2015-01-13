package br.com.roninfo.decorator;

public class DecoradorTeste { 
	public static void main(String args[]) { 
		Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples()); 
		janelaDecorada.draw(); 
	} 
}
