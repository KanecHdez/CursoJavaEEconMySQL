
public class VariosEjemplosWhile {

    public static void main(String args[]) {
        VariosEjemplosWhile objeto = new VariosEjemplosWhile();
        objeto.tablasDeMultiplicar();
    }
    public void tablasDeMultiplicar() {
        int tabla = 1;
        int i = 1;

        while (tabla <= 10) {
            while (i <= 10) {
                System.out.println(tabla + " * " + i + " = " + (tabla * i));
                i++;
            }
            System.out.println("--------");
            System.out.println("");
            i=1;
            tabla++;
        }
    }
    public void ejemplo1() {
        int i = 0;
        while (i == 0) {
            System.out.println("Este codigo no se ejecutara");
            i++;
        }
    }
}
