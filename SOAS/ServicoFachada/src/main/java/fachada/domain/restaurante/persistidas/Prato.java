package fachada.domain.restaurante.persistidas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import fachada.domain.restaurante.CNPJ;
import fachada.domain.restaurante.PratoComposto;
import fachada.domain.restaurante.PratoSimples;
import fachada.domain.restaurante.Preco;
import org.hibernate.validator.constraints.NotEmpty;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type")
@JsonSubTypes({
    @Type(value = PratoSimples.class, name = "simples"),
    @Type(value = PratoComposto.class, name = "composto")
})
public abstract class Prato{

  int id;
  @NotEmpty
  private String descricao;
  @NotEmpty
  private String nome;
  @NotEmpty
  private int tempo;
  @NotEmpty
  private Preco preco;

  private CNPJ cnpjRestaurante = new CNPJ("");


  public Prato(){

  }
//  @JsonCreator
  public Prato(@JsonProperty("nome") String nome,
      @JsonProperty("descricao") String descricao,
      @JsonProperty("tempo") int tempo,
      @JsonProperty("preco") Preco preco, @JsonProperty("id") int id, @JsonProperty("cnpjRestaurante")CNPJ cnpj){
    this.nome = nome;
    this.descricao = descricao;
    this.tempo = tempo;
    this.preco = preco;
    this.id = id;
    this.cnpjRestaurante = cnpj;
  }

  public Prato(@JsonProperty("nome") String nome,
      @JsonProperty("descricao") String descricao,
      @JsonProperty("tempo") int tempo,
      @JsonProperty("preco") Preco preco,@JsonProperty("cnpjRestaurante")CNPJ cnpj){
    this.nome = nome;
    this.descricao = descricao;
    this.tempo = tempo;
    this.preco = preco;
    this.id = -1;
    this.cnpjRestaurante = cnpj;
  }

  public Prato(@JsonProperty("nome") String nome,
      @JsonProperty("descricao") String descricao,
      @JsonProperty("tempo") int tempo,
      @JsonProperty("preco") Preco preco) {
    this.nome = nome;
    this.descricao = descricao;
    this.tempo = tempo;
    this.preco = preco;
    this.id = -1;
  }

  @JsonGetter("preco")
  public Preco getPreco(){
    return this.preco;
  }

  @JsonSetter("preco")
  public int getTempo(){
    return this.tempo;
  }
  @JsonGetter("descricao")
  public String getDescricao() {
    return descricao;
  }
  @JsonSetter("descricao")
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  @JsonGetter("name")
  public String getNome() {
    return nome;
  }
  @JsonSetter("name")
  public void setNome(String nome) {
    this.nome = nome;
  }
  @JsonSetter("tempo")
  public void setTempo(int tempo) {
    this.tempo = tempo;
  }
  @JsonSetter("preco")
  public void setPreco(Preco preco) {
    this.preco = preco;
  }
  @JsonGetter("id")
  public int getId() {
    return id;
  }
  @JsonSetter("id")
  public void setId(int id) {
    this.id = id;
  }

  @JsonGetter("cnpjRestaurante")
  public CNPJ getCnpjRestaurante() {
    return cnpjRestaurante;
  }
  @JsonSetter("cnpjRestaurante")
  public void setCnpjRestaurante(CNPJ cnpjRestaurante) {
    this.cnpjRestaurante = cnpjRestaurante;
  }
}
