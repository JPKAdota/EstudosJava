package Set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\ttOrdem aleatóriat\t--");
        Set<Serie> minhasSerie = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that", "comédia", 60));
        }};
        for (Serie serie: minhasSerie) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\ttOrdem inserçãp\t--");
        Set<Serie> minhasSerie1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that", "comédia", 60));
        }};
        for (Serie serie: minhasSerie1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\ttOrdem Natural\t--");
        Set<Serie> minhasSerie2 = new TreeSet<>(minhasSerie1);
        System.out.println(minhasSerie2);
        for (Serie serie: minhasSerie2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoRpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoRpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoRpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
       int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
       if (tempoEpisodio !=0) return tempoEpisodio;

       return this.getGenero().compareTo(serie.getGenero());
    }
}