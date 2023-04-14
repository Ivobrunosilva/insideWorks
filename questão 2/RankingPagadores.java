
public class RankingPagadores {

    public static void main(String[] args) {
        
        // Entrada de dados - tabela de status dos pagamentos previstos por empresa
        int[][] tabela = {
                {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
        };
        
        // Cálculo da média de pagamentos por empresa
        double[] medias = new double[tabela.length];
        for (int i = 0; i < tabela.length; i++) {
            int pagamentos = 0;
            for (int j = 0; j < tabela[i].length; j++) {
                if (tabela[i][j] == 1) {
                    pagamentos++;
                }
            }
            medias[i] = (double) pagamentos / tabela[i].length;
        }
        
        // Ordenação do ranking das empresas (por ordem decrescente de média de pagamentos)
        String[] empresas = {"Empresa A", "Empresa B", "Empresa C", "Empresa D"};
        for (int i = 0; i < medias.length - 1; i++) {
            for (int j = i + 1; j < medias.length; j++) {
                if (medias[i] < medias[j]) {
                    double temp = medias[i];
                    medias[i] = medias[j];
                    medias[j] = temp;
                    String temp2 = empresas[i];
                    empresas[i] = empresas[j];
                    empresas[j] = temp2;
                }
            }
        }
        
        // Impressão do ranking das empresas
        System.out.println("Ranking das empresas:");
        for (int i = 0; i < empresas.length; i++) {
            System.out.println((i+1) + "º lugar - " + empresas[i] + " - média de pagamentos: " + medias[i]);
        }
    }

}
