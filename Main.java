public class Main {
        private int var;

        public Main() {
                this.var = 10;

        }

        public Main(int num) {
                this.var = num;

        }

        public int getvalue() {
                return var;
        }



        public static void main(String[] args) {
                Main obj = new Main();
                Main objj = new Main(22);
                System.out.println(objj.getvalue());

        }


}



