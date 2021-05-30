package net.tranlong5252;

public class PITT002 {
/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int det =
                        (a[0][0]*a[1][1]*a[2][2])+
                        (a[0][1]*a[1][2]*a[2][0])+
                        (a[0][2]*a[1][0]*a[2][1])-
                        (a[0][2]*a[1][1]*a[2][0])-
                        (a[0][1]*a[1][0]*a[2][2])-
                        (a[0][0]*a[1][2]*a[2][1]);
        System.out.println(det);
    }
    static int det2(int[][]a){
        int lvl = a.length;
        int dt = 0;
        if(lvl==1){
            dt = a[0][0];
        }
        else {
            for(int i=0 ; i < lvl ; i++){
                // tạo ma trân con bằng việc loại bỏ đi hàng 0 cột i
                // tương tự như việc loại bỏ hàng i cột j trong công thức tổng quát
                int smt = sub_mt(a,0,i);
                // tính định thức đồng thời gọi đệ quy tính định thức ma trận con
                dt += a[0][i]*Math.pow(-1, i)*det2(smt);
            }
        }
        return dt;
    }
    int sub_mt(int[][]a) {
        int lvl = a.length;
        int smt=0;
        for(int j=0; j<lvl; j++){
            if(j!=3){
                int value = 0;
                for(var k=0; k<lvl; k++){
                    if(k!=col){
                        value.push(mt[j][k]);
                    }
                }
                smt.push(value);
            }
        }
        return smt;
    } */
}
