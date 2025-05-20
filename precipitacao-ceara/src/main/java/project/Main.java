package project;
import project.model.RegistroPrecipitacao;
import project.service.EstatisticaPrecipitacao;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<RegistroPrecipitacao> dados = new ArrayList<>();

        // Janeiro
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 1, 5), 45.2));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 1, 10), 12.8));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 1, 20), 30.0));

        // Fevereiro
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 2, 5), 60.5));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 2, 10), 22.3));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 2, 20), 80.7));

        // Março
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 3, 5), 55.1));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 3, 10), 10.0));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 3, 20), 25.9));

        // Abril
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 4, 5), 35.4));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 4, 10), 18.2));
        dados.add(new RegistroPrecipitacao(LocalDate.of(2015, 4, 20), 90.6));

        // Cálculos
        EstatisticaPrecipitacao estatisticas = new EstatisticaPrecipitacao(dados);

        System.out.println("Total de precipitação por mês:");
        for (Map.Entry<Month, Double> entry : estatisticas.totalPorMes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "mm");
        }

        System.out.println("\nDia de maior precipitação: " + estatisticas.diaMaiorPrecipitacao());
        System.out.println("Dia de menor precipitação: " + estatisticas.diaMenorPrecipitacao());

        System.out.println("\nMês de maior precipitação: " + estatisticas.mesMaiorPrecipitacao());
        System.out.println("Mês de menor precipitação: " + estatisticas.mesMenorPrecipitacao());

        System.out.printf("\nMédia de precipitação anual: %.2fmm%n", estatisticas.mediaAnual());

        System.out.println("\nMédia por mês:");
        for (Map.Entry<Month, Double> entry : estatisticas.mediaPorMes().entrySet()) {
            System.out.println(entry.getKey() + ": " + String.format("%.2f", entry.getValue()) + "mm");
        }

        System.out.println("\nTop 10 dias mais chuvosos:");
        estatisticas.top10DiasMaisChuvosos().forEach(System.out::println);
    }
}
