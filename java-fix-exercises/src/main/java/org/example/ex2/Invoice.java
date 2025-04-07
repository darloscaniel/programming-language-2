package org.example.ex2;

public class Invoice {
        private String numeroItem;
        private String descricaoItem;
        private int quantidade;
        private double precoUnitario;

        // Construtor
        public Invoice(String numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
            this.numeroItem = numeroItem;
            this.descricaoItem = descricaoItem;
            this.quantidade = (quantidade > 0) ? quantidade : 0;
            this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
        }

        // Métodos Getters e Setters
        public String getNumeroItem() {
            return numeroItem;
        }

        public void setNumeroItem(String numeroItem) {
            this.numeroItem = numeroItem;
        }

        public String getDescricaoItem() {
            return descricaoItem;
        }

        public void setDescricaoItem(String descricaoItem) {
            this.descricaoItem = descricaoItem;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = (quantidade > 0) ? quantidade : 0;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }

        public void setPrecoUnitario(double precoUnitario) {
            this.precoUnitario = (precoUnitario > 0) ? precoUnitario : 0.0;
        }

        // Método para calcular o valor total da fatura
        public double getInvoiceAmount() {
            return quantidade * precoUnitario;
        }
    }
