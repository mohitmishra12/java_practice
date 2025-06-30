public class nesterClass {
    static class outer{
        void inner(){
            System.out.println("nester class in static method are calling");

        }

        public static void main(String[] args) {
            nesterClass.outer obj = new nesterClass.outer();
            obj.inner();
        }
    }
}
