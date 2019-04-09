/**
 * Classe Aluno traz elementos da classe Pessoa, acrescentando ao armazenamento
 * de RA e semestre.
 * Autores: Breno Amaral, Gabrielle Ramos, Victor Bulhoes
 * 19.03.2019
 *
 */
public class Aluno extends Pessoa {
    public String ra;
    private int semestre;
    public Disciplina disciplinas[];
    
    
    public Aluno (){
        super();
    }
    public Aluno(String nome, int idade, String rg, String ra, int semestre, Disciplina disciplinas[]) {
        super(nome, idade, rg);
        setRa(ra);
        setSemestre(semestre);
        setDisciplinas(disciplinas);
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return this.ra;
    }

    /**
     * @param _prontuario the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param _serie the _semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    public void setDisciplinas(Disciplina disciplinas[]){
        this.disciplinas = disciplinas;
    }
    
    
    /* Imprime dados do aluno
     * 
     */
    protected void imprimir(){
        super.imprimir();
        System.out.println("RA: " + getRa());
        System.out.println("Semestre: " + getSemestre());
        System.out.println("=====");
    }
    public String toString(){
        return(super.toString() + "\nRA: " + getRa() + ",   Serie: " + getSemestre());
    }
}
