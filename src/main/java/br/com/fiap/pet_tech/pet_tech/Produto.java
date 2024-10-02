package br.com.fiap.pet_tech.pet_tech;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_produto")
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String nome;
  private String descricao;
  private Double preco;
  private String urlDaImagem;

  public Produto(){}

  public Produto(UUID id, String nome, String descricao, Double preco, String urlDaImagem) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.urlDaImagem = urlDaImagem;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getUrlDaImagem() {
    return urlDaImagem;
  }

  public void setUrlDaImagem(String urlDaImagem) {
    this.urlDaImagem = urlDaImagem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Produto produto = (Produto) o;
    return Objects.equals(id, produto.id);
  }

  @Override
  public String toString() {
    return "Produto{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", descricao='" + descricao + '\'' +
            ", preco=" + preco +
            ", urlDaImagem='" + urlDaImagem + '\'' +
            '}';
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
