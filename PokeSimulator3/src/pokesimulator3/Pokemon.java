package pokesimulator3;

public class Pokemon {
    //ATRIBUTOS    
    private String  nome, tipo;
    private int     level, vida, ataque, defesa;
    
    //CONSTRUTOR
    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        this.calculaAtributos();
        this.calculaBonus();
        this.imprimiPokemon();     
        
    }
    
    
    //MÉTODOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    //Método imprimi pokemon
    public void imprimiPokemon(){
        System.out.println("Nome: "     + nome      + " | " +
                           "Tipo: "     + tipo      + " | " +
                           "Level: "    + level     + " | " +
                           "Vida: "     + vida      + " | " +
                           "Ataque: "   + ataque    + " | " +
                           "Defesa: "   + defesa    + " | " );

    }
    
    public void calculaAtributos(){
        
        switch(this.tipo){
        
            case "Fogo":
                this.vida = 50;
                this.ataque = 100;
                this.defesa = 30;
                break;
            
            case "Agua":
                this.vida = 60;
                this.ataque = 70;
                this.defesa = 50;
                break;
                
            case "Terra":
                this.vida = 70;
                this.ataque = 40;
                this.defesa = 90;
                break;
                
            case "Ar":
                this.vida = 60;
                this.ataque = 70;
                this.defesa = 20;
                break;
                
            case "Eletrico":
                this.vida = 70;
                this.ataque = 85;
                this.defesa = 40;
                break;      
        }        
    }
    
    public void calculaBonus(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
}
