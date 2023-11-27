package com.session;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.session.model.Produto;

@ManagedBean
@SessionScoped
public class testeBean {
	
	private List<Produto> listaProduto;
	private Produto produto;

	public testeBean() {
		this.listaProduto=new ArrayList<Produto>();
		this.produto=new Produto();
	}
	
	public void incluir() {
		listaProduto.add(produto);
		
		produto=new Produto();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}
}
