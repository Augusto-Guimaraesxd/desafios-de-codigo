package Ex001Arr;

public class Ex01_ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {0 , -5 , 15 , 50 , 8 , 4};
        int count = 0;
        while (count < (vetor.length)){
            System.out.println(vetor[count] + " ");
            count++;
        }
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }


    }
}
