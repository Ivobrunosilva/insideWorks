public class ConsumoEnergia {

    public static void main(String[] args) {
        
        // Matriz com os consumos mensais
        int[][] consumo = {
            {100, 120, 130, 150, 160, 180, 190, 200, 180, 150, 130, 110},
            {110, 130, 140, 160, 170, 190, 200, 210, 190, 160, 140, 120},
            {120, 140, 150, 170, 180, 200, 210, 220, 200, 170, 150, 130},
            {130, 150, 160, 180, 190, 210, 220, 230, 210, 180, 160, 140},
            {140, 160, 170, 190, 200, 220, 230, 240, 220, 190, 170, 150},
            {150, 170, 180, 200, 210, 230, 240, 250, 230, 200, 180, 160},
            {160, 180, 190, 210, 220, 240, 250, 260, 240, 210, 190, 170},
            {170, 190, 200, 220, 230, 250, 260, 270, 250, 220, 200, 180},
            {180, 200, 210, 230, 240, 260, 270, 280, 260, 230, 210, 190},
            {190, 210, 220, 240, 250, 270, 280, 290, 270, 240, 220, 200}
        };
        
        // Variáveis para guardar a soma dos consumos de cada mês e o consumo máximo
        int[] somaMes = new int[12];
        int consumoMax = 0;
        int mesMax = 0;
        int anoMax = 0;
        
        // Percorre a matriz e acumula a soma dos consumos de cada mês
        for (int i = 0; i < consumo.length; i++) {
            for (int j = 0; j < consumo[i].length; j++) {
                somaMes[j] += consumo[i][j];
                
                // Verifica se o consumo é o máximo até o momento
                if (consumo[i][j] > consumoMax) {
                    consumoMax = consumo[i][j];
                    mesMax = j;
                    anoMax = i;
                }
            }
        }
        
        // Imprime a média de consumo de cada mês
        System.out.println("Média de consumo por mês:");
        for (int i = 0; i < somaMes.length; i++) {
            double mediaMes = (double) somaMes[i] / consumo.length;
            System.out.printf("Mês %d: %.2f\n", i+1, mediaMes);
        }
        
        // Imprime o mês/ano com o consumo máximo
        System.out.printf("Mês/ano com maior consumo: %d/%d\n", mesMax+1, anoMax+2010);
    }

}
