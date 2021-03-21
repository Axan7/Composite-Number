import java.util.Scanner;

class Composite{
    int arr[][];
    int m, n;

    Composite(int mm, int nn){
        m = mm;
        n = nn;
    }

    int isComposite(int p){
        for(int i=2;i<p/2;i++){
            if(p%i==0)
                return 1;
        }
        return 0;
    }

    void fill(){
        arr = new int[m][n];
        int a = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isComposite(a) == 1)
                    arr[i][j] = a;
                else
                    j--;
                a++;
            }
        }
    }

    void display(){
        System.out.println("\nFirst " + (m*n) + " composite numbers are given below\n" );
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=0, col=0;
        System.out.print("Enter Number of rows you want in the matrix (Maximum 20 rows allowed): ");
        try{row = sc.nextInt();} catch(Exception e){System.out.println("You can enter only a positive integer within the range of (1-20)"); System.exit(0);}
        while (row > 20 || row <=0) {
            System.out.print("Number of rows out of range! Enter again within the range of (1-20): ");
            try{row = sc.nextInt();} catch(Exception e){System.out.println("You can enter only a positive integer within the range of (1-20)"); System.exit(0);}
        }

        System.out.print("Enter Number of columns you want in the matrix (Maximum 20 columns allowed): ");
        try{col = sc.nextInt();} catch(Exception e){System.out.println("You can enter only a positive integer within the range of (1-20)"); System.exit(0);}
        while (col > 20 || col <=0) {
            System.out.print("Number of columns out of range! Enter again within the range of (1-20): ");
            try{col = sc.nextInt();} catch(Exception e){System.out.println("You can enter only a positive integer within the range of (1-20)"); System.exit(0);}
        }
        sc.close();

        Composite comp = new Composite(row, col);
        comp.fill();
        comp.display();
    }
}