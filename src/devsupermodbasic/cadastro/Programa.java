package devsupermodbasic.cadastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        // Formatar a data e hora
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("\n* DADOS DA EMPRESA\n");
        System.out.print("- NOME DA EMPRESA: ");
        String nome = entrada.nextLine();
        System.out.print("- Nome do produto: ");
        String produto = entrada.nextLine();

        Date momento = null; // Inicializa a variável momento como null

        // Loop para garantir uma data válida
        while (true){
            try {
                    System.out.print("Informe a data no formato dd/MM/yyyy: ");
                    momento = sdf.parse(entrada.next());
                    break;
            }catch (ParseException e){
                System.out.println("Data invalida digite novamente: \n");
            }

        }

        entrada.nextLine(); // Consumir a linha pendente após entrada da data
        System.out.print("Nome Func: ");
        String nomeFuncionario = entrada.nextLine();
        System.out.print("CPF Func: ");
        String cpf = entrada.nextLine();
        System.out.print("Profissão Func: ");
        String profissao = entrada.nextLine();
        System.out.print("Endereço Func: ");
        String endereco = entrada.nextLine();

        // Cria o objeto Empresa com os dados inseridos
        Empresa empresa = new Empresa(nome, produto, momento,
                new Funcionario(nomeFuncionario, cpf, profissao, endereco));

        // Criação de departamentos e adição à empresa
        Departamento departamento = new Departamento("TI - Java Avançado! ");
        Departamento departamento1 = new Departamento("TI - JavaScript Avançado! ");

        empresa.addlistaDepartamento(departamento);
        empresa.addlistaDepartamento(departamento1);

        // Imprimir os dados da empresa
        System.out.println(empresa);

        entrada.close();
    }
}