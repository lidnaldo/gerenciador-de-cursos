package br.com.alura.TreeSet_Comparator;

import java.util.Comparator;

//implemente a interface Comparator usando como critério de comparação 
//a idade de funcionários

public class OrdenaPorIdade implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }
}
