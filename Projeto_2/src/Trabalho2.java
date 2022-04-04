import java.util.ArrayList;
import java.util.Scanner;

public class Trabalho2 {

    public static void main(String[] args) {
        ArrayList<Onibus> listaonibus = new ArrayList();
        ArrayList<Carro> listacarro = new ArrayList();
        ArrayList<Caminhao> listacaminhao = new ArrayList();

        Onibus bus;
        Carro car;
        Caminhao cam;

        Scanner entrada = new Scanner(System.in);
        int opc = 1, a = 0;
        String nome, fabricante;
        double potencia;
        while (opc != 0) {
            opc = menu(entrada);
            switch (opc) {

                case 1:
                    int opc2 = submenu(entrada);
                    System.out.println("Nome:");
                    nome = entrada.next();
                    System.out.println("Fabricante:");
                    fabricante = entrada.next();
                    System.out.println("Potencia:");
                    do {
                        potencia = entrada.nextDouble();
                    } while (potencia <= 0.0);

                    switch (opc2) {
                        case 1:
                            int lugares;
                            boolean banheiro;
                            System.out.println("Lugares:");
                            do {
                                lugares = entrada.nextInt();
                            } while (lugares <= 0);
                            System.out.println("Banheiro: (1 - sim e 2 - nao)");
                            do {
                                a = entrada.nextInt();
                            } while (a != 1 && a != 2);

                            if (a == 1) {
                                banheiro = true;
                            } else {
                                banheiro = false;
                            }
                            bus = new Onibus(lugares, banheiro, nome, fabricante, potencia);
                            listaonibus.add(bus);
                            break;

                        case 2:
                            boolean completo;
                            System.out.println("Completo(1 - sim e 2 - nao):");
                            do {
                                a = entrada.nextInt();
                            } while (a != 1 || a != 2);

                            if (a == 1) {
                                completo = true;
                            } else {
                                completo = false;
                            }
                            car = new Carro(completo, nome, fabricante, potencia);
                            listacarro.add(car);
                            break;

                        case 3:
                            double suportado;
                            System.out.println("Peso suportado para tracionar:");
                            do {
                                suportado = entrada.nextDouble();
                            } while (suportado <= 0);
                            cam = new Caminhao(suportado, nome, fabricante, potencia);
                            listacaminhao.add(cam);
                            break;
                    }
                    break;

                case 2:
                    opc2 = submenu(entrada);
                    switch (opc2) {
                        case 1:
                            if (listaonibus.isEmpty()) {
                                System.out.print("\n Nada aqui ");
                            }
                            for (int i = 0; i < listaonibus.size(); i++) {
                                bus = listaonibus.get(i);
                                System.out.println("Nome: " + bus.getNome());
                                System.out.println("Fabricante: " + bus.getFabricante());
                                System.out.println("Potencia do motor: " + bus.getPotencia());
                                System.out.println("Quantidade de lugares: " + bus.getLugares());
                                System.out.println("Banheiro" + bus.getBanheiro());
                            }
                            break;
                        case 2:
                            if (listacarro.isEmpty()) {
                                System.out.print("\n Nada aqui ");
                            }
                            for (int i = 0; i < listacarro.size(); i++) {
                                car = listacarro.get(i);
                                System.out.println("Nome: " + car.getNome());
                                System.out.println("Fabricante: " + car.getFabricante());
                                System.out.println("Potencia do motor: " + car.getPotencia());
                                System.out.println("Completo: " + car.getCompleto());
                            }
                            break;
                        case 3:
                            if (listacaminhao.isEmpty()) {
                                System.out.print("\n Nada aqui ");
                            }
                            for (int i = 0; i < listacaminhao.size(); i++) {
                                cam = listacaminhao.get(i);
                                System.out.println("Nome: " + cam.getNome());
                                System.out.println("Fabricante: " + cam.getFabricante());
                                System.out.println("Potencia do motor: " + cam.getPotencia());
                                System.out.println("Peso suportado para tracionar: " + cam.getSuportado());
                            }
                            break;
                    }
                    break;

                case 3:
                    if (listaonibus.isEmpty()) {
                        System.out.print("\n  Nada aqui");
                    }
                    bus = listaonibus.get(0);
                    for (int i = 0; i < listaonibus.size(); i++) {
                        if (bus.getLugares() < listaonibus.get(i).getLugares()) {
                            bus = listaonibus.get(i);
                        }
                    }
                    System.out.println("Nome: " + bus.getNome());
                    System.out.println("Fabricante: " + bus.getFabricante());
                    System.out.println("Potencia do motor: " + bus.getPotencia());
                    System.out.println("Quantidade de lugares: " + bus.getLugares());
                    System.out.println("Banheiro" + bus.getBanheiro());
                    break;

                case 4:
                    if (listacaminhao.isEmpty()) {
                        System.out.print("\n  Nada aqui");
                    }
                    cam = listacaminhao.get(0);
                    for (int i = 0; i < listacaminhao.size(); i++) {
                        if (cam.getSuportado() < listacaminhao.get(i).getSuportado()) {
                            cam = listacaminhao.get(i);
                        }
                    }
                    System.out.println("Nome: " + cam.getNome());
                    System.out.println("Fabricante: " + cam.getFabricante());
                    System.out.println("Potencia do motor: " + cam.getPotencia());
                    System.out.println("Peso suportado para tracionar: " + cam.getSuportado());

                    break;
                case 5:

                    if (listacarro.isEmpty()) {
                        System.out.print("\n  Nada aqui");
                    }
                    for (int i = 0; i < listacarro.size(); i++) {
                        car = listacarro.get(i);
                        if (car.getCompleto() == true) {
                            System.out.println("Nome: " + car.getNome());
                            System.out.println("Fabricante: " + car.getFabricante());
                            System.out.println("Potencia do motor: " + car.getPotencia());
                            System.out.println("Completo: " + car.getCompleto());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Digite o peso: ");
                    double peso = 0;
                    do {
                        peso = entrada.nextDouble();
                    } while (peso <= 0);
                    if (listacaminhao.isEmpty()) {
                        System.out.print("\n  Nada aqui");
                    }

                    for (int i = 0; i < listacaminhao.size(); i++) {
                        cam = listacaminhao.get(i);
                        if (cam.getSuportado() > peso) {
                            System.out.println("Nome: " + cam.getNome());
                            System.out.println("Fabricante: " + cam.getFabricante());
                            System.out.println("Potencia do motor: " + cam.getPotencia());
                            System.out.println("Peso suportado para tracionar: " + cam.getSuportado());
                        }
                    }
                    break;
            }
        }
    }

    public static int menu(Scanner entrada) {
        int opc = -1;
        do {
            System.out.println("0 - Sair");
            System.out.println("1-Criar elementos:");
            System.out.println("2-Mostrar todos:");
            System.out.println("3-Mostrar onibus com mais lugares:");
            System.out.println("4-Mostrar caminhao com maior capacidade de tracionar:");
            System.out.println("5-Mostrar carros completos");
            System.out.println("6-Mostrar caminhoes q tracionam acima do peso X:");
            System.out.println("Digite uma opcao:");
            opc = entrada.nextInt();
        } while (opc < 1 && opc > 6);
        return opc;
    }

    public static int submenu(Scanner entrada) {
        int opc = -1;
        do {
            System.out.println("1-Onibus:");
            System.out.println("2-Carro:");
            System.out.println("3-Caminhão:");
            System.out.println("Digite uma opcao:");
            opc = entrada.nextInt();
        } while (opc < 1 && opc > 3);
        return opc;
    }
}