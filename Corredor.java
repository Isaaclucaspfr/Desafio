public class Corredor {
private String nome;
private int nota;
private int trofeus;

public Corredor(String nomeCorredor){
nome = nomeCorredor;
nota = 0;
trofeus = 0;
}

public String getNome(){
return nome;
}
public void setNome(String novoNome){
nome = novoNome;
}
public int getNota(){
return nota;
}
public void setNota(int novaNota){
nota = novaNota;
}
public int getTrofeus(){
return trofeus;
}
public void setTrofeus(int novosTrofeus){
trofeus = novosTrofeus;
}
public void aumentaTrofeus(int quantidade){
trofeus = trofeus + quantidade;
}

public String tipo(){
if(trofeus > 5){
return "campeão";
}
else{
return "normal";
}
}
public void mostrarDados(){
System.out.println("Nome: " + nome);
System.out.println("Nota: " + nota);
System.out.println("Trofeus: " + trofeus);
}
}