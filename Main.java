import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        notebook n1 = new notebook(2, 128, "Белый");
        notebook n2 = new notebook( 4, 256, "Серый");
        notebook n3 = new notebook( 32, 512, "Серый");
        notebook n4 = new notebook(16, 256,  "Черный");
       
        System.out.println("Выберите функцию:");
        System.out.println("1 - фильтр по ОЗУ");
        System.out.println("2 - фильтр по SSD");
        System.out.println("3 - фильтр по цвету");
        Scanner sc = new Scanner(System.in);        
        Integer choice = sc.nextInt();
        
            if(choice == 1){

                System.out.printf("Введите значение ОЗУ: ");
                Integer ram = sc.nextInt();
                if(ram >=32){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n4.toString() + "\n" + n3.toString() + "\n");
                }else if(ram < 32){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n4.toString());
                }else if(ram < 16){
                    System.out.printf(n1.toString() + "\n" + n2.toString());
                }else if(ram < 4){
                    System.out.printf(n1.toString());
                }else System.out.println("Ничего не найдено. Введите другой параметр ");

            }else if(choice == 2){

                System.out.printf("Введите значение SSD: ");
                Integer ssd = sc.nextInt();
                if(ssd >=512){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n3.toString() + "\n" + n4.toString() + "\n");
                }else if(ssd < 512){
                    System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n4.toString());
                }else if(ssd < 256){
                    System.out.printf(n1.toString() + "\n" + n2.toString());
                }else if(ssd < 128){
                    System.out.printf(n1.toString());
                }else System.out.println("Ничего не найдено. Введите другой параметр ");

            }else if(choice == 3){

                System.out.println("Введите цвет");
                Scanner sc1 = new Scanner(System.in);
                String color = sc1.nextLine();
                if(color.equalsIgnoreCase("White")){
                    System.out.printf(n1.toString() + "\n");
                }else if(color.equalsIgnoreCase("Grey")){
                    System.out.printf(n2.toString() + "\n" + n3.toString());
                }else if(color.equalsIgnoreCase("Black")){
                    System.out.printf(n4.toString() + "\n" );
                }else System.out.println("Ничего не найдено. Введите другой параметр ");
                sc1.close();
                sc.close();
                }
            
            }
        
        }