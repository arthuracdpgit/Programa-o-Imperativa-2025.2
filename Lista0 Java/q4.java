import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano;

        System.out.print("Digite o dia: ");
        dia = sc.nextInt();
        System.out.print("Digite o mes: ");
        mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        ano = sc.nextInt();

        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (mes < 1 || mes > 12) {
            System.out.println("Data Invalida");
        } else if (dia < 1 || dia > 31) {
            System.out.println("Data Invalida");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Data Invalida");
        } else if (mes == 2 && (anoBissexto && dia > 29 || !anoBissexto && dia > 28)) {
            System.out.println("Data Invalida");
        } else {
            // A data é válida
            switch (mes) {
                case 1: // Janeiro
                    if (dia <= 19) {
                        System.out.println("Capricornio");
                    } else {
                        System.out.println("Aquario");
                    }
                    break;
                case 2: // Fevereiro
                    if (dia <= 18) {
                        System.out.println("Aquario");
                    } else {
                        System.out.println("Peixes");
                    }
                    break;
                case 3: // Março
                    if (dia <= 20) {
                        System.out.println("Peixes");
                    } else {
                        System.out.println("Aries");
                    }
                    break;
                case 4: // Abril
                    if (dia <= 19) {
                        System.out.println("Aries");
                    } else {
                        System.out.println("Touro");
                    }
                    break;
                case 5: // Maio
                    if (dia <= 20) {
                        System.out.println("Touro");
                    } else {
                        System.out.println("Gemeos");
                    }
                    break;
                case 6: // Junho
                    if (dia <= 20) {
                        System.out.println("Gemeos");
                    } else {
                        System.out.println("Cancer");
                    }
                    break;
                case 7: // Julho
                    if (dia <= 22) {
                        System.out.println("Cancer");
                    } else {
                        System.out.println("Leao");
                    }
                    break;
                case 8: // Agosto
                    if (dia <= 22) {
                        System.out.println("Leao");
                    } else {
                        System.out.println("Virgem");
                    }
                    break;
                case 9: // Setembro
                    if (dia <= 22) {
                        System.out.println("Virgem");
                    } else {
                        System.out.println("Libra");
                    }
                    break;
                case 10: // Outubro
                    if (dia <= 22) {
                        System.out.println("Libra");
                    } else {
                        System.out.println("Escorpiao");
                    }
                    break;
                case 11: // Novembro
                    if (dia <= 21) {
                        System.out.println("Escorpiao");
                    } else {
                        System.out.println("Sagitario");
                    }
                    break;
                case 12: // Dezembro
                    if (dia <= 21) {
                        System.out.println("Sagitario");
                    } else {
                        System.out.println("Capricornio");
                    }
                    break;
            }
        }
        
        sc.close();
    }
}