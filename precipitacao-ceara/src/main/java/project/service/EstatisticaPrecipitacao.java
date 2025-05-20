package project.service;

import project.model.RegistroPrecipitacao;

import java.time.Month;
import java.util.Comparator;
import java.util.*;
import java.util.stream.Collectors;

public class EstatisticaPrecipitacao {

    private List<RegistroPrecipitacao> registros;

    public EstatisticaPrecipitacao(List<RegistroPrecipitacao> registros) {
        this.registros = registros;
    }

    public Map<Month, Double> totalPorMes() {
        return registros.stream()
                .collect(Collectors.groupingBy(
                        r -> r.getData().getMonth(),
                        TreeMap::new,
                        Collectors.summingDouble(RegistroPrecipitacao::getPrecipitacao)));
    }

    public RegistroPrecipitacao diaMaiorPrecipitacao() {
        return registros.stream()
                .max(Comparator.comparingDouble(RegistroPrecipitacao::getPrecipitacao))
                .orElse(null);
    }

    public RegistroPrecipitacao diaMenorPrecipitacao() {
        return registros.stream()
                .min(Comparator.comparingDouble(RegistroPrecipitacao::getPrecipitacao))
                .orElse(null);
    }

    public Month mesMaiorPrecipitacao() {
        return totalPorMes().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public Month mesMenorPrecipitacao() {
        return totalPorMes().entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public double mediaAnual() {
        return registros.stream()
                .mapToDouble(RegistroPrecipitacao::getPrecipitacao)
                .average()
                .orElse(0.0);
    }

    public Map<Month, Double> mediaPorMes() {
        return registros.stream()
                .collect(Collectors.groupingBy(
                        r -> r.getData().getMonth(),
                        TreeMap::new,
                        Collectors.averagingDouble(RegistroPrecipitacao::getPrecipitacao)));
    }

    public List<RegistroPrecipitacao> top10DiasMaisChuvosos() {
        return registros.stream()
                .sorted(Comparator.comparingDouble(RegistroPrecipitacao::getPrecipitacao).reversed())
                .limit(10)
                .collect(Collectors.toList());
    }
}
