package pokesimulator3;

public class PokeSimulator3 {

    public static void main(String[] args) {
        //Instanciar um objeto do tipo Pokemon
        Pokemon pokemon1 = new Pokemon("Charmander", "Fogo", 10);
        Pokemon pokemon2 = new Pokemon("Pikachu", "Eletrico", 30);        
        
        int vidaPokemon1 = pokemon1.getVida();
        int vidaPokemon2 = pokemon2.getVida();
        
        System.out.println("\n");
        
        if (vidaPokemon1 > vidaPokemon2) {
            System.out.println(pokemon1.getNome() + " VENCEU !");
        } else {
            System.out.println(pokemon2.getNome() + " VENCEU !");
        }

    }    
}
