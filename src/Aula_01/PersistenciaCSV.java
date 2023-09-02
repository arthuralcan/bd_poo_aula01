package Aula_01;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaCSV {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Maria" , 20);
		
		try {
			FileOutputStream arquivo = new FileOutputStream("dados.cvs");
			ObjectOutputStream escritor = new ObjectOutputStream(arquivo);
			
			escritor.writeObject(pessoa);
			
			escritor.close();
			arquivo.close();
			System.out.println("Objeto gravado com sucesso");
		}catch (IOException e) {
			System.out.println("Erro ao gravar objeto: " + e.getMessage());
		}

	}

}

class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}