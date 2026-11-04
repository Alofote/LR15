//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner in = new Scanner(System.in);
    System.out.println("Введите номер задания");
    int zadanie = in.nextInt();
    switch (zadanie){
        case 1:
            System.out.println("Введите размер массива");
            int n = in.nextInt();
            System.out.println("Заполните массив");
            int[] mas = new int[n];
            for (int i = 0;i<n;i++){
                mas[i]= in.nextInt();
            }
            int[] mas_copy = new int[n];
            for (int i = 0;i<mas.length;i++){
                mas_copy[i] = mas[i];
            }
            System.out.print("Массив: ");
            for (int i = 0;i<n;i++){
                System.out.print(mas[i]+" ");
            }
            System.out.println();
            System.out.print("Клон Массива: ");
            for (int i = 0;i<n;i++){
                System.out.print(mas_copy[i]+" ");
            }
            break;
        case 2:
            System.out.println("Введите размер массива N");
            int n2 = in.nextInt();
            System.out.println("Введите размер массива M");
            int m2 = in.nextInt();
            System.out.println("Заполните массив");
            int k = 0;
            int[][] mas2 = new int[n2][m2];
            for (int i = 0;i<n2;i++){
                for (int j =0;j<m2;j++){
                    mas2[i][j] = in.nextInt();
                    if(mas2[i][j]%2==0){
                        k++;
                    }
                }
            }
            int[] chet = new int[k];
            for (int i = 0;i<n2;i++){
                for(int j = 0;j<m2;j++){
                    if(mas2[i][j]%2==0){
                        chet[i]=mas2[i][j];
                    }
                }
            }
            for (int i = 0;i<k;i++){
                System.out.print(chet[i]+" ");
            }
            break;
        default:
            System.out.println("Такого задания нет");
            break;
    }
}
