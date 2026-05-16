public class Patternprograms {
    public static void main(String[]args){
        int n=5;
    System.out.println("PATTERNPROGRAMS");        
        for(int i=1;i<=n;i++){ //Outerloop
            for(int j=1;j<=n;j++){ //innerloop
                System.out.print("* ");
            }
            System.out.println( );
        }
  System.out.println("RIGHT ANGLED TRIANGLE:-");
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
}
        System.out.println( );
}System.out.println("INVERSE RIGHT ANGLED TRIANGLE:-");
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("* ");
        }
        System.out.println( );
    
} System.out.println("INVERSE TRIANGLE:-");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println( );
        } 
System.out.println("TRIANGLE:-");
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
         }
System.out.println("PYRAMID:-");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("* ");
                }
                System.out.println( );
            }
  System.out.println("INVERSE PYRAMID:-");
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i-1;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*(n-i)+1;j++){
                        System.out.print("* ");
                    }
                    System.out.println( );
                }
    System.out.println("HALLOW SQUARE:-");
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n;j++){
                        if(i==1 || i==n || j==1 || j==n){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println( );
                }
    System.out.println("HALLOW TRIANGLE:-");        
      for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
         }
   System.out.println("number pattern:-");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println( );
            }
 System.out.println("same number in one row :-");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println( );
                
    }}
}

