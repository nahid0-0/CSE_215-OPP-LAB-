public class employee {
        private double salary;
        private String name;

        public employee() {

        }


        public employee(String name, double salary) {
                this.name = name;
                this.salary = salary;

        }

        String getname() {
                return name;
        }

        double out_salary() {
                return salary;
        }

        public static void main(String[] args) {
                employee e1 = new employee("adfadf",66.6);
                System.out.println(e1.getname());
                System.out.println(e1.out_salary());
                
                
        }
                
        
}