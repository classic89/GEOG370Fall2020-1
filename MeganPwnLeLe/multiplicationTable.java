public class multiplicationTable {
    public void multiply() {
        for (int k=1;k<=2;k++){
            for (int l=1;l<=2;l++){
                int answer = k+l;
                System.out.print(k+"+"+l+":"+answer+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("I live!\n");
    }

}
