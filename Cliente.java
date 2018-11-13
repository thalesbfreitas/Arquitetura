
package modelo;

 /**
 * @author thales
 * * @version 1.0 
 * Sistema Hoetalria - Aquitetura de Software
 **/

public class Cliente {
    private long IdCliente;
    private long Cpf;
    private String Nome ;
    private String Endereco;
    private String Telefone;
    private String SituacaoCliente;
    private String DataCadastro;
    private String DataAtualizado;
    private boolean EmDebito;
    
    public long getIdCliente() {
		return IdCliente;
	}
    public void setIdCliente(long idCliente) {
		IdCliente = idCliente;
	}

    public long getCpf() {
		return Cpf;
	}
    public void setCpf(long cpf) {
		Cpf = cpf;
	}

    public String getNome() {
		return Nome;
	}
    public void setNome(String nome) {
		Nome = nome;
	}

    public String getEndereco() {
		return Endereco;
	}
    public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getSituacaoCliente() {
		return SituacaoCliente;
	}
	public void setSituacaoCliente(String situacaoCliente) {
		SituacaoCliente = situacaoCliente;
	}

	public String getDataCadastro() {
		return DataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		DataCadastro = dataCadastro;
	}

	public String getDataAtualizado() {
		return DataAtualizado;
	}
	public void setDataAtualizado(String dataAtualizado) {
		DataAtualizado = dataAtualizado;
	}

	public boolean isEmDebito() {
		return EmDebito;
	}
	public void setEmDebito(boolean emDebito) {
		EmDebito = emDebito;
	}
}
