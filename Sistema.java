import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Carro> carros = new ArrayList<Carro>();
        int escolha;

        do{
            System.out.println("\nSistema de Estoque");
            System.out.println("----------------------\n");
            System.out.println("1 - Cadastrar Veículo");
            System.out.println("2 - Alterar dados do veículo");
            System.out.println("3 - Deletar veículo");
            System.out.println("4 - Mostrar Estoque");
            System.out.println("5 - Mostrar Estoque com Custo");
            System.out.println("6 - Encerrar programa");
            escolha = Integer.parseInt(teclado.nextLine());
            
            switch(escolha) {
                case 1:
                    Carro c = new Carro();

                    System.out.print("Qual a marca do Veículo? ");
                    c.setMarca(teclado.nextLine());
                    System.out.print ("Qual o modelo do Veículo? ");
                    c.setModelo(teclado.nextLine());
                    System.out.print("Qual a Placa do Veículo? ");
                    c.setPlaca(teclado.nextLine());
                    System.out.print("Qual o custo do Veículo? ");
                    c.setCusto(Double.parseDouble(teclado.nextLine()));
                    System.out.print("Qual é o valor anunciado do Veículo? ");
                    c.setValor(Double.parseDouble(teclado.nextLine()));
                    System.out.print("Qual é a KM atual do Veículo? ");
                    c.setKm(Integer.parseInt(teclado.nextLine()));
                    System.out.print("Qual o Ano de Modelo do Veículo? ");
                    c.setAnoModelo(Integer.parseInt(teclado.nextLine()));
                    System.out.print("Qual o Ano de Fabricação do Veículo? ");
                    c.setAnoFabricacao(Integer.parseInt(teclado.nextLine()));
                    System.out.print("Quais opcionais o veículo possuí? ");
                    c.setOpcionais(teclado.nextLine());
                    System.out.println("Adicione uma observação: ");
                    c.setObservacao(teclado.nextLine());

                    carros.add(c);
                    break;
                case 2:
                    int carroParaAlterar = 0;

                    System.out.println("\nSelecione o veículo que deseja alterar:");
                    System.out.println("----------------------\n");
                    for(int i = 0; i < carros.size(); i++) {
                        int x = i + 1;
                        System.out.println(x + " - " + carros.get(i).getModelo() + " " +
                            carros.get(i).getAnoModelo());
                    }
                    carroParaAlterar = Integer.parseInt(teclado.nextLine()) - 1;

                    int escolhaAlteracao;
                    do{
                        System.out.println("\nSelecione o Veículo que deseja alterar:");
                        System.out.println("----------------------\n");
                        System.out.println("1 - Marca: " + carros.get(carroParaAlterar).getMarca());
                        System.out.println("2 - Modelo: " + carros.get(carroParaAlterar).getModelo());
                        System.out.println("3 - Placa: " + carros.get(carroParaAlterar).getPlaca());
                        System.out.println("4 - Custo: " + carros.get(carroParaAlterar).getCusto());
                        System.out.println("5 - Valor: " + carros.get(carroParaAlterar).getValor());
                        System.out.println("6 - KM: " + carros.get(carroParaAlterar).getKm());
                        System.out.println("7 - Ano de Modelo: " + carros.get(carroParaAlterar).getAnoModelo());
                        System.out.println("8 - Ano de Fabricacao: " + carros.get(carroParaAlterar).getAnoFabricacao());
                        System.out.println("9 - Opcionais: " + carros.get(carroParaAlterar).getOpcionais());
                        System.out.println("10 - Observacao: " + carros.get(carroParaAlterar).getObservacao());
                        System.out.println("0 - Sair");
                        escolhaAlteracao = Integer.parseInt(teclado.nextLine());

                        switch(escolhaAlteracao){
                            case 1:
                                System.out.println("Marca Atual: " + carros.get(carroParaAlterar).getMarca());
                                System.out.print("Digite a marca a ser alterada: ");
                                carros.get(carroParaAlterar).setMarca(teclado.nextLine());
                                break;
                            case 2:
                                System.out.println("Modelo Atual: " + carros.get(carroParaAlterar).getModelo());
                                System.out.print("Digite o modelo a ser alterado: ");
                                carros.get(carroParaAlterar).setModelo(teclado.nextLine());
                                break;
                            case 3:
                                System.out.println("Placa Atual: " + carros.get(carroParaAlterar).getPlaca());
                                System.out.print("Digite a placa a ser alterada: ");
                                carros.get(carroParaAlterar).setPlaca(teclado.nextLine());
                                break;
                            case 4:
                                System.out.println("Custo Atual: " + carros.get(carroParaAlterar).getCusto());
                                System.out.print("Digite o custo a ser alterado: ");
                                carros.get(carroParaAlterar).setCusto(Double.parseDouble(teclado.nextLine()));
                                break;
                            case 5:
                                System.out.println("Valor Atual: " + carros.get(carroParaAlterar).getValor());
                                System.out.print("Digite o valor a ser alterado: ");
                                carros.get(carroParaAlterar).setValor(Double.parseDouble(teclado.nextLine()));
                                break;
                            case 6:
                                System.out.println("KM Atual: " + carros.get(carroParaAlterar).getKm());
                                System.out.print("Digite o KM a ser alterado: ");
                                carros.get(carroParaAlterar).setKm(Integer.parseInt(teclado.nextLine()));
                                break;
                            case 7:
                                System.out.println("Ano de Modelo Atual: " + carros.get(carroParaAlterar).getAnoModelo());
                                System.out.print("Digite o ano de modelo a ser alterado: ");
                                carros.get(carroParaAlterar).setAnoModelo(Integer.parseInt(teclado.nextLine()));
                                break;
                            case 8:
                                System.out.println("Ano de Fabricacao Atual: " + carros.get(carroParaAlterar).getAnoFabricacao());
                                System.out.print("Digite o ano de fabricacao a ser alterado: ");
                                carros.get(carroParaAlterar).setAnoFabricacao(Integer.parseInt(teclado.nextLine()));
                                break;
                            case 9:
                                System.out.println("Opcionais Atuais: " + carros.get(carroParaAlterar).getOpcionais());
                                System.out.print("Digite os opcionais a serem alterados: ");
                                carros.get(carroParaAlterar).setOpcionais(teclado.nextLine());
                                break;
                            case 10:
                                System.out.println("Observacao Atual: " + carros.get(carroParaAlterar).getObservacao());
                                System.out.print("Digite a observacao a ser alterada: ");
                                carros.get(carroParaAlterar).setObservacao(teclado.nextLine());
                                break;
                            case 0:
                                System.out.println("Alterações Salvas com sucesso!");
                                break;
                            default:
                                System.out.println("O número digitado não é válido");
                                break;
                        }
                    }while(escolhaAlteracao != 0);
                    break;
                case 3:
                    int carroDelecao;

                    System.out.println("\nSelecione o Veículo que deseja deletar");
                    System.out.println("----------------------\n");
                    for(int i = 0; i < carros.size(); i++) {
                        int x = i + 1;
                        System.out.println(x + " - " + carros.get(i).getModelo() + " " +
                            carros.get(i).getAnoModelo());
                    }
                    carroDelecao = Integer.parseInt(teclado.nextLine()) - 1;
                    
                    carros.remove(carroDelecao);
                    break;
                case 4:
                    System.out.println("\nEstoque:");
                    System.out.println("----------------------\n");
                    for(Carro carro : carros) {
                        System.out.println(carro.imprimir());
                    }
                    break;
                case 5:
                    System.out.println("\nEstoque com Custo:");
                    System.out.println("----------------------\n");
                    for(Carro carro : carros) {
                        System.out.println(carro.imprimirComCusto());
                    }
                    break;
                case 6:
                    System.out.println("O programa será encerrado!");
                    break;
                default:
                    System.out.println("O número digitado não é válido!");
                    break;
            }
        }while(escolha != 6);

        teclado.close();
    }
}