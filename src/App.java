
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = new PersonasGenerator().generarPersonas();
        CarrosGenerator generator2 = new CarrosGenerator();
        Carro[] carros = generator2.generarCarros();

        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByHeightWithInsertion(personas);
        System.out.println("Arreglo de personas ordenado: ");
        mOB.showPeople(personas);

        int result = mOB.searchBinaryByHeight(personas, 169);
        if (result == -1){
            System.out.println("No se encontro :/");
        } else {
            System.out.print("Encontro en la posicion " + result + " -> " );
            mOB.printObject(personas[result]);
        }

        System.out.println("");

        // Ordenamiento Carros
        MetodosOrdenamientoBusquedaGrupoB mOB2 = new MetodosOrdenamientoBusquedaGrupoB();
        mOB2.sortBYearWithBubbleAvnAsendente(carros);
        System.out.println("Arreglo de carros ordenado: ");
        mOB2.showCarros(carros);

        int result2 = mOB2.searchBinaryByYear(carros, 2017);
        if (result2 == -1){
            System.out.println("No se encontro :/");
        } else {
            System.out.print("Encontro en la posicion " + result2 + " -> ");
            mOB2.printObject(carros[result2]);
        }

    }
}
