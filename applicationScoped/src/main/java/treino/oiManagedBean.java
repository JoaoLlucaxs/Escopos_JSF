package treino;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import treino.model.Produto;

@ManagedBean
@ApplicationScoped
public class oiManagedBean {
	
	private List<Produto> listaProduto;
	private Produto produto;

	public oiManagedBean() {
		this.listaProduto=new ArrayList<Produto>();
		this.produto=new Produto();
	}
	
	public void incluir() {
		this.listaProduto.add(this.produto);
		
		produto=new Produto();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	
}
