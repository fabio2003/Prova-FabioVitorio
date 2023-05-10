import javax.swing.JOptionPane;

public class Prova{
    public static void main(String args[]){
        
        try {
            // entrada de dados --------------------------

            String placa = JOptionPane.showInputDialog(null, "Informe a placa do veículo");
            double valLitro = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do litro do combustível"));
            double qtd60km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de quilômetros rodados a 60 KM/H"));
            double qtd80km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de quilômetros rodados a 80 KM/H"));
            double qtd100km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de quilômetros rodados a 100 KM/H"));
            double qtd120km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de quilômetros rodados a 120 KM/H"));
            double qtd140km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de quilômetros rodados a 140 KM/H"));

            // processamento ----------------------------

            //qtd de combustível gasto em cada trecho
            double total60km = qtd60km / 30.7;
            double total80km = qtd80km / 26.8;
            double total100km = qtd100km / 22.4;
            double total120km = qtd120km / 18.1;
            double total140km = qtd140km / 14.5;

            //consumo total de combustível
            double consumoTotal = (total60km + total80km + total100km + total120km + total140km);

            //valor total
            double custoTotal = consumoTotal * valLitro;

            //velocidade média ponderada
            double velocidadeMedia = (qtd60km * 60) + (qtd80km * 80) + (qtd100km * 100) + (qtd120km * 120) + (qtd140km * 140) / 500;

            JOptionPane.showMessageDialog(null, "Placa do veículo: " + placa 
                                                                + "\nConsumo total: " + consumoTotal 
                                                                + "\nValor total: R$ " + custoTotal
                                                                + "\nVelocidade média: " + velocidadeMedia);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de digitação");        
        }
        

    }
}