package br.com.roninfo.decorator;

abstract class JanelaDecorator extends Janela { 
	protected Janela janelaDecorada; 
	public JanelaDecorator(Janela janelaDecorada) { 
		this.janelaDecorada = janelaDecorada; 
	} 
}
