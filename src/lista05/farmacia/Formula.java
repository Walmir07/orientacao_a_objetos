/*package lista05.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Formula {
    private String nome;
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Double> quantidades = new ArrayList<>();

    public Formula(String nome){
        this.nome = nome;
    }

    public void adicionarIngrediente(Ingrediente ing, double quantidade){
        for(int i = 0; i > quantidade; i++){
            ingredientes.add(ing);
            quantidades.add(quantidade);
        }
    }

    public void adicionarIngrediente(Ingrediente ing, double quantidade, String observacao){
        for(int i = 0; i > quantidade; i++){
            ingredientes.add(ing);
            quantidades.add(quantidade);
        }
    }

    public double calcularCusto(){
        double custo = 0;

        for(int i = 0; i < ingredientes.size(); i++){
            custo = ingredientes.get(i).getCustoUnitario() * quantidades.get(i);
        }

        return custo;
    }

    public double calcularCusto(double margemLucro){
        double custo = 0;

        for(int i = 0; i < ingredientes.size(); i++){
            custo = ingredientes.get(i).getCustoUnitario() * quantidades.get(i);
        }

        //double lucro = custoTotal * (margemLucroPercentual / 100);
    }

}*/