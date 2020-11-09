public class mathTable {
    public static void addition() {
        for (int k=1;k<=2;k++){
            for (int l=1;l<=2;l++){
                int answer = k+l;
                System.out.print(k+"+"+l+":"+answer+"\t");
            }
            System.out.println();
        }
    }
    public static void multiplication() {
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int answer = j*i;
                System.out.print(i+"x"+j+"="+answer+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("I live!\n");
        multiplication();
    }
}
