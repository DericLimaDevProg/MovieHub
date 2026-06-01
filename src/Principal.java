import java.util.Scanner;

import br.com.cdl.moviehub.calculos.CalculadoraDeTempo;
import br.com.cdl.moviehub.modelos.Documentario; // Mudamos o import aqui!
import br.com.cdl.moviehub.modelos.Filme;
import br.com.cdl.moviehub.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Informação dos filmes
        Filme filme1 = new Filme();
        System.out.println("Digite o nome do filme:");
        filme1.setNome(scanner.nextLine());
        System.out.println("Digite o nome do diretor do filme:");
        filme1.setDiretor(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do filme:");
        filme1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração do filme em minutos:");
        filme1.setTotalEmMinutos(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de avaliações:");
        int qtd = Integer.parseInt(scanner.nextLine().trim());
        for (int i=0;i<qtd;i++){
            System.out.println("Digite a nota da avaliação " + (i+1) + ":");
            filme1.avalia(Double.parseDouble(scanner.nextLine().trim()));
        }
        // Informação das séries
        Serie serie1 = new Serie();
        System.out.println("Digite o nome da série:");
        serie1.setNome(scanner.nextLine());
        System.out.println("Digite o ano de lançamento da série:");
        serie1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de temporadas da série:");
        serie1.setTemporadas(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de episódios por temporada:");
        serie1.setEpisodiosPorTemporada(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração de cada episódio em minutos:");
        serie1.setMinutosPorEpisodio(Integer.parseInt(scanner.nextLine().trim()));
        
        // --- BLOCO DO DOCUMENTÁRIO (SUBSTITUINDO O ANIME) ---
        Documentario doc1 = new Documentario();
        System.out.println("Digite o nome do documentário:");
        doc1.setNome(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do documentário:");
        doc1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite o tema do documentário:");
        doc1.setTema(scanner.nextLine());
        System.out.println("Digite a duração do documentário em minutos:");
        doc1.setTotalEmMinutos(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("O documentário foi premiado? (true/false):");
        doc1.setPremiado(Boolean.parseBoolean(scanner.nextLine().trim()));

        // Fechamento seguro do scanner
        scanner.close();
        
        // --- EXIBIÇÃO DAS FICHAS TÉCNICAS SEPARADAS ---
        System.out.println("\n=== FICHAS TÉCNICAS ===");
        
        System.out.println("--- FILME ---");
        filme1.exibeFichaTecnica();
        System.out.println(); 

        System.out.println("--- SÉRIE ---");
        // Customização direta para contornar o "Nome do filme" sem tocar no arquivo Serie.java!
        System.out.println("Nome da série: " + serie1.getNome());
        System.out.println("Ano de lançamento: " + serie1.getAnoDeLancamento());
        System.out.println("Duração em minutos: " + serie1.getDuracaoEmMinutos());
        System.out.println(); 

        System.out.println("--- DOCUMENTÁRIO ---");
        doc1.exibeFichaTecnica(); // Ficha limpa e bonita do Documentário
        System.out.println(); 
        
        System.out.println("=== AVALIAÇÕES ===");
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());

        // Calculadora de tempo atualizada com o Documentário
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(serie1);
        calculadora.inclui(doc1); // Incluindo o documentário na maratona
        System.out.println("\nTempo total da maratona: " + calculadora.getTempoTotal() + " minutos.");
    }
}