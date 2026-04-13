package lista06.questao1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new VeiculoPessoa("ABC1D23", 2015, "LEVE", "234.242.422-35");
        System.out.println(veiculo1.descricao());

        Veiculo veiculo2 = new VeiculoEmpresa("RMD718", 2024, "PESADO", "12.579.986/3241-63");
        System.out.println(veiculo2.descricao());

    }
}
