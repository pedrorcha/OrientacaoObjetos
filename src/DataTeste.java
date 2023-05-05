import classes.Data;

public class DataTeste {

    public static void main(String[] args) {

        Data data;

        data = new Data();
        data.dia = 10;
        data.mes = 04;
        data.ano = 2023;

        System.out.println( "Data: " + data.dia + "/"
                                     + data.mes + "/"
                                     + data.ano );
    }

}
