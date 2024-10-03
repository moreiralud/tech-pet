package br.com.fiap.pet_tech.pet_tech;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProdutoService {
  @Autowired
  private ProdutoRepository produtoRepository;

  public Collection<Produto> findAll() {
    var produtos = produtoRepository.findAll();
    return produtos;
  }

  public Produto findById(UUID id) {
    var produto = produtoRepository.findById(id).orElseThrow(() -> new ControllerNotFoundException("produto nao encontrado"));
    return produto;
  }


  public Produto save(Produto produto) {
    produto = produtoRepository.save(produto);
    return produto;

  }

  public Produto produto(UUID id, Produto produto) {

    Produto buscaProduto = produtoRepository.getOne(id);
    buscaProduto.setNome(produto.getNome());
    buscaProduto.setDescricao(produto.getDescricao());
    buscaProduto.setUrlDaImagem(produto.getUrlDaImagem());
    buscaProduto.setPreco(produto.getPreco());
    buscaProduto = produtoRepository.save(buscaProduto);

    return buscaProduto;

  }

  public void delete(UUID id) {
    produtoRepository.deleteById(id);

  }

  public Produto update(UUID id, Produto produto) {
    try {
      Produto buscaproduto = produtoRepository.getOne(id);
      buscaproduto.setNome(produto.getNome());
      buscaproduto.setDescricao(produto.getNome());
      buscaproduto.setUrlDaImagem(produto.getUrlDaImagem());
      buscaproduto.setPreco(produto.getPreco());
      buscaproduto = produtoRepository.save(buscaproduto);

      return buscaproduto;
    } catch (EntityNotFoundException e) {
      throw new ControllerNotFoundException("produto não encntrado");
    }




    //TODO implementar lgica aqui
  }
}
