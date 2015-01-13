package br.com.roninfo.proxy;

class PessoaDAO { 
	public static Pessoa getPessoaByID(String id){ 
		System.out.println("select * from PESSOA where id="+id); 
		return new PessoaImpl(id,"Pessoa " + id); 
	} 
}

