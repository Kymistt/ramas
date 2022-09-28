import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Introduzca su nombre: ");
        name = sc.nextLine();

        int dia;
        System.out.print("Introduzca su dia de nacimiento: ");
        dia = sc.nextInt();

        int mes;
        System.out.print("Introduzca su mes de nacimiento: ");
        mes = sc.nextInt();

        int ano;
        System.out.print("Introduzca su ano de nacimiento: ");
        ano = sc.nextInt();


        public int
        int diasvividos=0;
        for (int i=ano+1; i<2022; i++){
            if (i%4==0){
                diasvividos+=366;
            }else{
                diasvividos+=365;
            }
        }
        for (int i=1; i<mes; i++){
            if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                diasvividos+=31;
            }else if (i==2){
                if (ano%4==0){
                    diasvividos+=29;
                }else{
                    diasvividos+=28;
                }
            }else{
                diasvividos+=30;
            }
        }
        diasvividos+=dia;
        System.out.println("Has vivido " + diasvividos + " días");


    }
}