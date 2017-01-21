public class Binary {

    void print_binary(int n){
        if(n>=2){
           print_binary(n/2);
            System.out.print(n%2);
        }
        else{
            System.out.print(n);
        }


    }
}
